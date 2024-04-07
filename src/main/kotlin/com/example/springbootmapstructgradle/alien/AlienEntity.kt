package com.example.springbootmapstructgradle.alien

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.Builder

@Entity
@Builder
class AlienEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null,
    var homeWorld: String = "not_set",
    var name: String? = null
) {
    override fun toString(): String {
        return "AlienEntity(id=$id, homeWorld='$homeWorld', name=$name)"
    }
}