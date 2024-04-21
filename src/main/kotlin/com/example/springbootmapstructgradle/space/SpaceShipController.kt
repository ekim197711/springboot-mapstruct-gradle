package com.example.springbootmapstructgradle.space

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/spaceship")
class SpaceShipController(val spaceGun: SpaceGun) {

    @GetMapping("/shoot")
    fun shoot(): String {
        return spaceGun.shoot();
    }

    @GetMapping("/reload")
    fun reload(): String {
        return spaceGun.reload();
    }
}