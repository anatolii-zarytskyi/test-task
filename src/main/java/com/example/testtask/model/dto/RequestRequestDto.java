package com.example.testtask.model.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestRequestDto {
    @NotNull
    @Size(min = 1, max = 1000)
    private String payload;
}
