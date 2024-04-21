package com.example.springbootmapstructgradle.space

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Service

//@Profile("test")
@Service
@ConditionalOnProperty(name = ["weapon"], havingValue = "nerf")
class NerfGun : SpaceGun {
    override fun shoot(): String {
        return "Just shooting nerf pellets plastic things. Remember to wear glasses"
    }

    override fun reload(): String {
        return "Clak clack click"
    }
}