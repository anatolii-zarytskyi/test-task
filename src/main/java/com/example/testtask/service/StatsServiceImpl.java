package com.example.testtask.service;

import com.example.testtask.model.Stats;
import com.example.testtask.repository.StatsRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StatsServiceImpl implements StatsService {
    private final StatsRepository statsRepository;

    public StatsServiceImpl(StatsRepository statsRepository) {
        this.statsRepository = statsRepository;
    }

    @Override
    public void add(List<Stats> stats) {
        for (Stats stat : stats) {
            statsRepository.save(stat);
        }
    }

    @Override
    public List<Stats> getAll() {
        return statsRepository.findAll();
    }
}
