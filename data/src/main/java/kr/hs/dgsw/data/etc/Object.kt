package kr.hs.dgsw.data.etc

import kr.hs.dgsw.data.entity.PartData
import kr.hs.dgsw.data.entity.RelatedVideoData
import kr.hs.dgsw.data.entity.RoutineData
import kr.hs.dgsw.domain.entity.e.ColorEnum
import kr.hs.dgsw.domain.entity.e.RoutineTypeEnum
import kr.hs.dgsw.domain.entity.e.VideoCategoryEnum

object Object {
    const val VIDEO_ITEM_SIZE = 10

    const val DEFAULT_HOST = "http://10.80.161.201:5000/"

    val presetRoutineList = listOf(
        RoutineData(
            title = "BEGINNER",
            routineType = RoutineTypeEnum.PRESET.name,
            partList = listOf(
                PartData(
                    routineIdx = 1,
                    title = "Warm up",
                    time = 10,
                    color = ColorEnum.YELLOW.name,
                    speed = 5.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 1,
                    title = "Walking",
                    time = 300,
                    color = ColorEnum.GREEN.name,
                    speed = 7.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 1,
                    title = "Running",
                    time = 120,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 1,
                    title = "Hiking",
                    time = 180,
                    color = ColorEnum.ORANGE.name,
                    speed = 5.0,
                    incline = 5
                ),
                PartData(
                    routineIdx = 1,
                    title = "Cool down",
                    time = 300,
                    color = ColorEnum.BLUE.name,
                    speed = 4.5,
                    incline = 0
                )
            ),
            relatedVideoList = listOf(
                RelatedVideoData(
                    routineIdx = 1,
                    title = "Virtual Run | Amazing Norwegian Nature Scenery for your Virtual Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/VsmsGtiavUQ/original.jpg",
                    source = "VsmsGtiavUQ",
                    duration = 2460,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 1,
                    title = "Virtual Run | The Bridge | Sun Fun Run! | Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/shzvF4cVCv0/original.jpg",
                    source = "shzvF4cVCv0",
                    duration = 3496,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 1,
                    title = "Virtual Run | Relaxing Nature Scenery | Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/kav_pl6S9AQ/original.jpg",
                    source = "kav_pl6S9AQ",
                    duration = 1289,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 1,
                    title = "Virtual Run | Stunning Trails in Beautiful Nature Scenery | Treadmill Running, Walk, Workout",
                    thumbnail = "https://i.ytimg.com/vi/rlG10erTysE/original.jpg",
                    source = "rlG10erTysE",
                    duration = 2650,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 1,
                    title = "Virtual Run | Zen Nature Scenery for your Virtual Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/qZou0yB1RFk/original.jpg",
                    source = "qZou0yB1RFk",
                    duration = 2850,
                    category = VideoCategoryEnum.VIRTUAL.name
                )
            )
        ),
        RoutineData(
            title = "BASIC",
            routineType = RoutineTypeEnum.PRESET.name,
            partList = listOf(
                PartData(
                    routineIdx = 2,
                    title = "Warm up",
                    time = 10,
                    color = ColorEnum.YELLOW.name,
                    speed = 5.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 2,
                    title = "Walking",
                    time = 300,
                    color = ColorEnum.GREEN.name,
                    speed = 7.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 2,
                    title = "Running",
                    time = 300,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 2,
                    title = "Walking",
                    time = 300,
                    color = ColorEnum.GREEN.name,
                    speed = 7.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 2,
                    title = "Running",
                    time = 300,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 2,
                    title = "Walking",
                    time = 300,
                    color = ColorEnum.GREEN.name,
                    speed = 7.5,
                    incline = 0
                ),
                PartData(routineIdx = 2,
                    title = "Running",
                    time = 300,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                )
            ),
            relatedVideoList = listOf(
                RelatedVideoData(
                    routineIdx = 2,
                    title = "Virtual Run | Amazing Norwegian Nature Scenery for your Virtual Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/VsmsGtiavUQ/original.jpg",
                    source = "VsmsGtiavUQ",
                    duration = 2460,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 2,
                    title = "Virtual Run | The Bridge | Sun Fun Run! | Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/shzvF4cVCv0/original.jpg",
                    source = "shzvF4cVCv0",
                    duration = 3496,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 2,
                    title = "Virtual Run | Relaxing Nature Scenery | Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/kav_pl6S9AQ/original.jpg",
                    source = "kav_pl6S9AQ",
                    duration = 1289,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 2,
                    title = "Virtual Run | Stunning Trails in Beautiful Nature Scenery | Treadmill Running, Walk, Workout",
                    thumbnail = "https://i.ytimg.com/vi/rlG10erTysE/original.jpg",
                    source = "rlG10erTysE",
                    duration = 2650,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 2,
                    title = "Virtual Run | Zen Nature Scenery for your Virtual Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/qZou0yB1RFk/original.jpg",
                    source = "qZou0yB1RFk",
                    duration = 2850,
                    category = VideoCategoryEnum.VIRTUAL.name
                )
            )
        ),
        RoutineData(
            title = "Advanced",
            routineType = RoutineTypeEnum.PRESET.name,
            partList = listOf(
                PartData(
                    routineIdx = 3,
                    title = "Walking",
                    time = 300,
                    color = ColorEnum.GREEN.name,
                    speed = 7.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 3,
                    title = "Running",
                    time = 600,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 3,
                    title = "Walking",
                    time = 300,
                    color = ColorEnum.GREEN.name,
                    speed = 7.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 3,
                    title = "Running",
                    time = 600,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 3,
                    title = "Walking",
                    time = 300,
                    color = ColorEnum.GREEN.name,
                    speed = 7.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 3,
                    title = "Running",
                    time = 600,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 3,
                    title = "Walking",
                    time = 300,
                    color = ColorEnum.GREEN.name,
                    speed = 7.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 3,
                    title = "Running",
                    time = 600,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 3,
                    title = "Walking",
                    time = 300,
                    color = ColorEnum.GREEN.name,
                    speed = 7.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 3,
                    title = "Running",
                    time = 600,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 3,
                    title = "Cool down",
                    time = 300,
                    color = ColorEnum.BLUE.name,
                    speed = 4.5,
                    incline = 0
                )
            ),
            relatedVideoList = listOf(
                RelatedVideoData(
                    routineIdx = 3,
                    title = "Virtual Run | Amazing Norwegian Nature Scenery for your Virtual Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/VsmsGtiavUQ/original.jpg",
                    source = "VsmsGtiavUQ",
                    duration = 2460,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 3,
                    title = "Virtual Run | The Bridge | Sun Fun Run! | Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/shzvF4cVCv0/original.jpg",
                    source = "shzvF4cVCv0",
                    duration = 3496,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 3,
                    title = "Virtual Run | Relaxing Nature Scenery | Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/kav_pl6S9AQ/original.jpg",
                    source = "kav_pl6S9AQ",
                    duration = 1289,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 3,
                    title = "Virtual Run | Stunning Trails in Beautiful Nature Scenery | Treadmill Running, Walk, Workout",
                    thumbnail = "https://i.ytimg.com/vi/rlG10erTysE/original.jpg",
                    source = "rlG10erTysE",
                    duration = 2650,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 3,
                    title = "Virtual Run | Zen Nature Scenery for your Virtual Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/qZou0yB1RFk/original.jpg",
                    source = "qZou0yB1RFk",
                    duration = 2850,
                    category = VideoCategoryEnum.VIRTUAL.name
                )
            )
        ),
        RoutineData(
            title = "HARD",
            routineType = RoutineTypeEnum.PRESET.name,
            partList = listOf(
                PartData(
                    routineIdx = 4,
                    title = "Running",
                    time = 720,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 4,
                    title = "Cool down",
                    time = 300,
                    color = ColorEnum.BLUE.name,
                    speed = 4.5,
                    incline = 0
                )
            ),
            relatedVideoList = listOf(
                RelatedVideoData(
                    routineIdx = 4,
                    title = "Virtual Run | Amazing Norwegian Nature Scenery for your Virtual Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/VsmsGtiavUQ/original.jpg",
                    source = "VsmsGtiavUQ",
                    duration = 2460,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 4,
                    title = "Virtual Run | The Bridge | Sun Fun Run! | Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/shzvF4cVCv0/original.jpg",
                    source = "shzvF4cVCv0",
                    duration = 3496,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 4,
                    title = "Virtual Run | Relaxing Nature Scenery | Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/kav_pl6S9AQ/original.jpg",
                    source = "kav_pl6S9AQ",
                    duration = 1289,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 4,
                    title = "Virtual Run | Stunning Trails in Beautiful Nature Scenery | Treadmill Running, Walk, Workout",
                    thumbnail = "https://i.ytimg.com/vi/rlG10erTysE/original.jpg",
                    source = "rlG10erTysE",
                    duration = 2650,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 4,
                    title = "Virtual Run | Zen Nature Scenery for your Virtual Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/qZou0yB1RFk/original.jpg",
                    source = "qZou0yB1RFk",
                    duration = 2850,
                    category = VideoCategoryEnum.VIRTUAL.name
                )
            )
        ),
        RoutineData(
            title = "TABATA",
            routineType = RoutineTypeEnum.PRESET.name,
            partList = listOf(
                PartData(
                    routineIdx = 5,
                    title = "Running",
                    time = 120,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 5,
                    title = "Rest",
                    time = 30,
                    color = ColorEnum.PURPLE.name,
                    speed = 0.0,
                    incline = 0
                ),
                PartData(
                    routineIdx = 5,
                    title = "Running",
                    time = 150,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 5,
                    title = "Rest",
                    time = 30,
                    color = ColorEnum.PURPLE.name,
                    speed = 0.0,
                    incline = 0
                ),
                PartData(
                    routineIdx = 5,
                    title = "Running",
                    time = 180,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 5,
                    title = "Rest",
                    time = 30,
                    color = ColorEnum.PURPLE.name,
                    speed = 0.0,
                    incline = 0
                ),
                PartData(
                    routineIdx = 5,
                    title = "Running",
                    time = 210,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 5,
                    title = "Rest",
                    time = 30,
                    color = ColorEnum.PURPLE.name,
                    speed = 0.0,
                    incline = 0
                ),
                PartData(
                    routineIdx = 5,
                    title = "Running",
                    time = 240,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 5,
                    title = "Rest",
                    time = 30,
                    color = ColorEnum.PURPLE.name,
                    speed = 0.0,
                    incline = 0
                ),
                PartData(
                    routineIdx = 5,
                    title = "Running",
                    time = 270,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 5,
                    title = "Rest",
                    time = 30,
                    color = ColorEnum.PURPLE.name,
                    speed = 0.0,
                    incline = 0
                ),
                PartData(
                    routineIdx = 5,
                    title = "Running",
                    time = 300,
                    color = ColorEnum.RED.name,
                    speed = 10.5,
                    incline = 0
                ),
                PartData(
                    routineIdx = 5,
                    title = "Rest",
                    time = 30,
                    color = ColorEnum.PURPLE.name,
                    speed = 0.0,
                    incline = 0
                )
            ),
            relatedVideoList = listOf(
                RelatedVideoData(
                    routineIdx = 5,
                    title = "Virtual Run | Amazing Norwegian Nature Scenery for your Virtual Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/VsmsGtiavUQ/original.jpg",
                    source = "VsmsGtiavUQ",
                    duration = 2460,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 5,
                    title = "Virtual Run | The Bridge | Sun Fun Run! | Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/shzvF4cVCv0/original.jpg",
                    source = "shzvF4cVCv0",
                    duration = 3496,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 5,
                    title = "Virtual Run | Relaxing Nature Scenery | Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/kav_pl6S9AQ/original.jpg",
                    source = "kav_pl6S9AQ",
                    duration = 1289,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 5,
                    title = "Virtual Run | Stunning Trails in Beautiful Nature Scenery | Treadmill Running, Walk, Workout",
                    thumbnail = "https://i.ytimg.com/vi/rlG10erTysE/original.jpg",
                    source = "rlG10erTysE",
                    duration = 2650,
                    category = VideoCategoryEnum.VIRTUAL.name
                ),
                RelatedVideoData(
                    routineIdx = 5,
                    title = "Virtual Run | Zen Nature Scenery for your Virtual Treadmill Workout",
                    thumbnail = "https://i.ytimg.com/vi/qZou0yB1RFk/original.jpg",
                    source = "qZou0yB1RFk",
                    duration = 2850,
                    category = VideoCategoryEnum.VIRTUAL.name
                )
            )
        )
    )
}