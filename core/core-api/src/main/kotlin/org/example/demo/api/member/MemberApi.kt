//package org.example.demo.api.member
//
//import org.example.demo.api.common.ApiResponse
//import org.example.demo.api.member.data.RequestSignUp
//import org.example.demo.app.member.*
//import org.springframework.web.bind.annotation.*
//
//@RestController
//@RequestMapping("/members")
//class MemberApi(
//    private val memberService: MemberService,
//) {
//
//    @PostMapping
//    fun signUp(@RequestBody requestSignUp: RequestSignUp): ApiResponse<Long> {
//        val member = requestSignUp.toMember()
//        val memberId = memberService.signUp(member)
//        return ApiResponse.success(memberId)
//    }
//
//    @PatchMapping("/{fieldType}")
//    fun updateNickname(
//        @RequestParam memberId: Long,
//        @RequestParam value: String,
//        @PathVariable fieldType: MemberUpdatableAttribute,
//    ) {
//        memberService.update(memberId, value, fieldType)
//    }
//
//}