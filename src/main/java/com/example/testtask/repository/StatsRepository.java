package com.example.testtask.repository;

import com.example.testtask.model.Stats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatsRepository extends JpaRepository<Stats, Long> {
}
