package com.example.springbootmapstructgradle.alien

import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface AlienMapper {
    fun toAlienDto(alienEntity: AlienEntity): AlienDto
    fun toAlienEntity(alien: AlienDto): AlienEntity
}