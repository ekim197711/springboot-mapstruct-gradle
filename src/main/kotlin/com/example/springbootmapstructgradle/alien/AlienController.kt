package com.example.springbootmapstructgradle.alien

import lombok.*
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Getter
@Setter
class AlienController(val alienRepository: AlienRepository) {
    fun aliens(): MutableList<AlienEntity> {
        return alienRepository.findAll()
    }
}