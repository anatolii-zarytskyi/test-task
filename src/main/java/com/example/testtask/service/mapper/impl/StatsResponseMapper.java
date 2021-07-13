package com.example.testtask.service.mapper.impl;

import com.example.testtask.model.Stats;
import com.example.testtask.model.dto.StatsResponseDto;
import com.example.testtask.service.mapper.DtoResponseMapper;
import org.springframework.stereotype.Component;

@Component
public class StatsResponseMapper implements DtoResponseMapper<StatsResponseDto, Stats> {
    @Override
    public StatsResponseDto toDto(Stats stats) {
        StatsResponseDto dto = new StatsResponseDto();
        dto.setWord(stats.getWord());
        dto.setEntry(stats.getEntry());
        dto.setRequestId(stats.getRequest().getId());
        return dto;
    }
}
