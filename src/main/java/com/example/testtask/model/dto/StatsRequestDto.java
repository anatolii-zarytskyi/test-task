package com.example.testtask.model.dto;

import lombok.Data;

@Data
public class StatsRequestDto {
    private String word;
    private Long entry;
    private Long requestId;
}
