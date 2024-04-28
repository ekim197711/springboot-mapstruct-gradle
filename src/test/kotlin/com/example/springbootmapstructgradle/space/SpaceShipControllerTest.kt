package com.example.springbootmapstructgradle.space

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SpaceShipControllerTest(
    @Autowired val spaceshipController: SpaceShipController
) {
    @Test
    fun shoot() {
        Assertions.assertThat(
            spaceshipController.shoot()
        ).isEqualTo("Just shooting nerf pellets plastic things. Remember to wear glasses")

    }

    @Test
    fun reload() {
        Assertions.assertThat(
            spaceshipController.reload()
        ).isEqualTo("Clak clack click")
    }
}