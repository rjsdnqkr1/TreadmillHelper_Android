package kr.hs.dgsw.treadmill_helper.ui.video

import io.reactivex.observers.DisposableSingleObserver
import kr.hs.dgsw.data.etc.Object
import kr.hs.dgsw.domain.entity.video.Video
import kr.hs.dgsw.domain.usecase.video.GetVideoListUseCase
import kr.hs.dgsw.treadmill_helper.base.viewmodel.BaseViewModel
import kr.hs.dgsw.treadmill_helper.ui.video.add.VideoAddDialog
import kr.hs.dgsw.treadmill_helper.widget.recyclerview.video.VideoListAdapter

class VideoViewModel(
    private val getVideoListUseCase: GetVideoListUseCase
) : BaseViewModel() {
    var page = 0
    var isLastPage = false
    val videoList = ArrayList<Video?>()

    val videoListAdapter = VideoListAdapter(videoList)

    init {
        setVideoList()
    }

    fun setVideoList() {
        startLoading()
        addDisposable(getVideoListUseCase.buildUseCaseObservable(GetVideoListUseCase.Params(page)),
            object : DisposableSingleObserver<List<Video>>() {
                override fun onSuccess(t: List<Video>) {
                    stopLoading()

                    val beforeListSize = videoList.size
                    videoList.addAll(t)
                    if (beforeListSize == 0)
                        videoListAdapter.notifyDataSetChanged()
                    else
                        videoListAdapter.notifyItemRangeInserted(beforeListSize, videoList.size - beforeListSize)

                    if (page == 0) {
                        page++
                        setVideoList()
                        return
                    }

                    isLastPage = t.size < Object.VIDEO_ITEM_SIZE
                }

                override fun onError(e: Throwable) {
                    stopLoading()
                    errorEvent.value = e
                }
            })
    }

    private fun startLoading() {
        videoList.add(null)
        videoListAdapter.notifyItemInserted(videoList.size - 1)
    }

    private fun stopLoading() {
        videoList.remove(null)
        videoListAdapter.notifyItemRemoved(videoList.size)
    }
}