package org.example.demo.api.member.data

import org.example.demo.app.member.Member

data class ResponseMembersBoard(
    val writerId: Long,
    val writerNickname: String,
    val boardsTitle: List<String>
) {


}