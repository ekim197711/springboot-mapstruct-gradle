package com.example.springbootmapstructgradle.alien

import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface AlienMapper {
    fun toAlienDto(alienEntity: AlienEntity): AlienDto
    fun toAlienDtos(alienEntityList: List<AlienEntity>): List<AlienDto>
    fun toAlienEntity(alien: AlienDto): AlienEntity
    fun toAlienEntities(alien: List<AlienDto>): List<AlienEntity>
}