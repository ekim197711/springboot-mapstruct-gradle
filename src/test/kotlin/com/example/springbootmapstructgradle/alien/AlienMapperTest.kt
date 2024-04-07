package com.example.springbootmapstructgradle.alien

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AlienMapperTest {
    @Autowired
    var alienMapper: AlienMapper? = null;

    @Test
    fun mapAnAlientEntity() {
        val mikeEntity = AlienEntity(-1, "Earth", "Mike")
        val mikeDto = alienMapper?.toAlienDto(mikeEntity)
        Assertions.assertThat(mikeDto).isNotNull
        Assertions.assertThat(mikeDto?.id).isEqualTo(mikeEntity.id)
        Assertions.assertThat(mikeDto?.name).isEqualTo(mikeEntity.name)
        Assertions.assertThat(mikeDto?.homeWorld).isEqualTo(mikeEntity.homeWorld)
        println(mikeDto)
    }

    @Test
    @DisplayName("Map an alien dto to an entity")
    fun mapToEntity() {
        val robinhoodDto = AlienDto(id = -2, name = "Robin Hood", homeWorld = "Mars")
        val robinhoodEntity = alienMapper?.toAlienEntity(robinhoodDto)
        Assertions.assertThat(robinhoodEntity).isNotNull
        Assertions.assertThat(robinhoodEntity?.id).isEqualTo(robinhoodDto.id)
        Assertions.assertThat(robinhoodEntity?.name).isEqualTo(robinhoodDto.name)
        Assertions.assertThat(robinhoodEntity?.homeWorld).isEqualTo(robinhoodDto.homeWorld)
        println(robinhoodEntity)
    }
}