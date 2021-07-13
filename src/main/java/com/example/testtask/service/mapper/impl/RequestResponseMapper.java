package com.example.testtask.service.mapper.impl;

import com.example.testtask.model.Request;
import com.example.testtask.model.dto.RequestResponseDto;
import com.example.testtask.service.mapper.DtoResponseMapper;
import org.springframework.stereotype.Component;

@Component
public class RequestResponseMapper implements DtoResponseMapper<RequestResponseDto, Request> {
    @Override
    public RequestResponseDto toDto(Request request) {
        RequestResponseDto dto = new RequestResponseDto();
        dto.setId(request.getId());
        dto.setPayload(request.getPayload());
        return dto;
    }
}
