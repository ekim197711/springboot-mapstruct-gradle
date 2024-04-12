package com.example.springbootmapstructgradle.alien

import lombok.*
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/alien")
class AlienController(
    val alienRepository: AlienRepository, val alienMapper: AlienMapper
) {

    @RequestMapping(path = ["/"], method = [RequestMethod.GET])
    fun aliens(): List<AlienDto> {
        return alienMapper.toAlienDtos(
            alienRepository.findAll()
        )
    }
}