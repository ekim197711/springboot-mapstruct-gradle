package com.example.springbootmapstructgradle.alien

import org.springframework.data.jpa.repository.JpaRepository

interface AlienRepository : JpaRepository<AlienEntity, Int>