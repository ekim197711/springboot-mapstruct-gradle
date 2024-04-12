package com.example.springbootmapstructgradle.alien

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AlienRestControllerTest {
    @LocalServerPort
    var port: Int? = null

    @Test
    fun aliens() {
        val rest = RestTemplate()
        val jsonResult = rest.getForObject<String>("http://localhost:" + port + "/alien/")
        print(jsonResult)
        Assertions.assertThat(jsonResult).isNotBlank()
    }
}