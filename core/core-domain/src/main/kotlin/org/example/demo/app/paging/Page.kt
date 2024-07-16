package org.example.demo.app.paging

data class Page(
    val pageNumber: Long,
    val pageSize: Long = 20,
    val offset: Long = 0,
    val sortKey: String = "",
    val sort: String = "desc"
)