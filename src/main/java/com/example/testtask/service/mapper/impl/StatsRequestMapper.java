package com.example.testtask.service.mapper.impl;

import com.example.testtask.model.Stats;
import com.example.testtask.model.dto.StatsRequestDto;
import com.example.testtask.service.RequestService;
import com.example.testtask.service.mapper.DtoRequestMapper;
import org.springframework.stereotype.Component;

@Component
public class StatsRequestMapper implements DtoRequestMapper<StatsRequestDto, Stats> {
    private final RequestService requestService;

    public StatsRequestMapper(RequestService requestService) {

        this.requestService = requestService;
    }

    @Override
    public Stats fromDto(StatsRequestDto dto) {
        Stats stats = new Stats();
        stats.setWord(dto.getWord());
        stats.setEntry(dto.getEntry());
        stats.setRequest(requestService.get(dto.getRequestId()));
        return stats;
    }
}
