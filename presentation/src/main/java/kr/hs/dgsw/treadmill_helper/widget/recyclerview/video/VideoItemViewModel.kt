package kr.hs.dgsw.treadmill_helper.widget.recyclerview.video

import androidx.lifecycle.MutableLiveData
import kr.hs.dgsw.domain.entity.video.Video
import kr.hs.dgsw.treadmill_helper.base.viewmodel.BaseItemViewModel
import kr.hs.dgsw.treadmill_helper.etc.extension.secToTimeFormat

class VideoItemViewModel : BaseItemViewModel<VideoNavigator>() {
    private lateinit var video: Video

    val thumbnailData = MutableLiveData<String>()
    val titleData = MutableLiveData<String>()
    val durationData = MutableLiveData<String>()
    val categoryData = MutableLiveData<String>()

    fun bind(model: Video) {
        video = model

        thumbnailData.value = video.thumbnail
        titleData.value = video.title
        durationData.value = video.duration.secToTimeFormat()
        categoryData.value = video.category.toString()
    }

    fun onClickItem() {
        getNavigator().onClickItem(video)
    }
}