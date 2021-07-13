package com.example.testtask.service;

import com.example.testtask.model.Stats;
import java.util.List;

public interface StatsService {
    void add(List<Stats> stats);

    List<Stats> getAll();

}
