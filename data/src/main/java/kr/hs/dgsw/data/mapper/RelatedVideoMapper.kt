package kr.hs.dgsw.data.mapper

import kr.hs.dgsw.data.database.entity.RelatedVideoEntity
import kr.hs.dgsw.data.entity.RelatedVideoData
import kr.hs.dgsw.domain.entity.routine.RelatedVideo
import kr.hs.dgsw.domain.entity.video.Video

fun RelatedVideo.toVideo(): Video {
    return Video(
        source = source,
        title = title,
        thumbnail = thumbnail,
        duration = duration,
        category = category
    )
}

fun RelatedVideo.toDataEntity(routineIdx: Int): RelatedVideoData {
    return RelatedVideoData(
        idx = idx,
        routineIdx = routineIdx,
        source = source,
        title = title,
        thumbnail = thumbnail,
        duration = duration,
        category = category.name
    )
}

fun RelatedVideoData.toEntity(): RelatedVideo {
    return RelatedVideo(
        idx = idx,
        source = source,
        title = title,
        thumbnail = thumbnail,
        duration = duration,
        category = enumValueOf(category)
    )
}

fun RelatedVideoData.toDbEntity(): RelatedVideoEntity {
    return RelatedVideoEntity(
        idx = idx,
        routineIdx = routineIdx,
        source = source,
        title = title,
        thumbnail = thumbnail,
        duration = duration,
        category = category
    )
}

fun RelatedVideoEntity.toDataEntity(): RelatedVideoData {
    return RelatedVideoData(
        idx = idx,
        routineIdx = routineIdx,
        source = source,
        title = title,
        thumbnail = thumbnail,
        duration = duration,
        category = category
    )
}