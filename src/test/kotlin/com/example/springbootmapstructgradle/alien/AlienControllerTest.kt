package com.example.springbootmapstructgradle.alien

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AlienControllerTest {
    @Autowired
    var controller: AlienController? = null

    @Test
    fun aliens() {
        val aliens = controller?.aliens()
        Assertions.assertThat(aliens).isNotEmpty()
        aliens?.forEach { println(it) }
    }
}