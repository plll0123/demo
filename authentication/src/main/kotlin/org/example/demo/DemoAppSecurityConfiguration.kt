package org.example.demo

import org.example.demo.jwt.JwtAuthenticationFilter
import org.springframework.boot.autoconfigure.security.servlet.PathRequest
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.invoke
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter

@Configuration
@EnableWebSecurity
class DemoAppSecurityConfiguration(
    private val jwtFilter: JwtAuthenticationFilter,
) {

    @Bean
    fun httpSecurity(security: HttpSecurity): SecurityFilterChain {
        security {
            cors { disable() }
            sessionManagement { sessionCreationPolicy = SessionCreationPolicy.STATELESS }
            formLogin { disable() }
            httpBasic { disable() }
            addFilterBefore<UsernamePasswordAuthenticationFilter>(jwtFilter)
            authorizeRequests {
                authorize("/**", permitAll)
//                authorize(anyRequest, permitAll)
                authorize(PathRequest.toStaticResources().atCommonLocations(), permitAll)
            }
        }
        return security.build()
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder = BCryptPasswordEncoder()
}