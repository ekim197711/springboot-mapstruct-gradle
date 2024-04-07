package com.example.springbootmapstructgradle.alien

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class AlienDefaultData(val alienRepository: AlienRepository) {
    @PostConstruct
    fun defaultAliens() {
        alienRepository.saveAll(
            listOf(
                AlienEntity(homeWorld = "Krypton", name = "Mike-el"),
                AlienEntity(homeWorld = "Krypton", name = "Kal-el"),
                AlienEntity(homeWorld = "Dakobar", name = "Yoda"),
                AlienEntity(homeWorld = "Duck Planet", name = "Mickey Mouse"),
            )
        )
    }
}