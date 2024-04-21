package com.example.springbootmapstructgradle.space

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Service

//@Profile("production")
@Service
@ConditionalOnProperty(name = ["weapon"], havingValue = "lazer")
class LazerGun : SpaceGun {
    override fun shoot(): String {
        return "Shooting the lazer gun. Be careful. Bzzzzzzzzz"
    }

    override fun reload(): String {
        return "Charge the lazer gun. Yuyuumm woppa woppaa"
    }
}