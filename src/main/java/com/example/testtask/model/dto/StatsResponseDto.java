package com.example.testtask.model.dto;

import lombok.Data;

@Data
public class StatsResponseDto {
    private String word;
    private Long entry;
    private Long requestId;
}
