package kr.hs.dgsw.data.entity

data class RelatedVideoData(
    val idx: Int,
    val source: String,
    val title: String,
    val thumbnail: String,
    val duration: Int,
    val category: String
) {
    constructor(source: String, title: String, thumbnail: String, duration: Int, category: String):
            this(0, source, title, thumbnail, duration, category)
}