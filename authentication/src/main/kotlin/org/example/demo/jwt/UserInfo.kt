package org.example.demo.jwt

import org.example.demo.app.member.Member
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class UserInfo(
    private val member: Member
) : UserDetails {

    override fun getAuthorities() = listOf(GrantedAuthority { "USER" })

    override fun getPassword() = ""

    override fun getUsername() = member.id.toString()

    override fun isAccountNonExpired() = true

    override fun isAccountNonLocked() = true

    override fun isCredentialsNonExpired() = true

    override fun isEnabled() = true
}