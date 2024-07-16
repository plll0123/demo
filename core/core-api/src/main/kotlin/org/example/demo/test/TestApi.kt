package org.example.demo.test

import org.example.demo.https.HttpsApi
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate
import java.time.OffsetDateTime

@RestController
@RequestMapping("/path")
class TestApi(
    private val httpsApi: HttpsApi
) {

    @GetMapping("/index")
    fun hello(): String {
        val httpsApi = httpsApi.hello()
        return "123"
    }

}