package com.example.testtask.service.mapper.impl;

import com.example.testtask.model.Request;
import com.example.testtask.model.dto.RequestRequestDto;
import com.example.testtask.service.mapper.DtoRequestMapper;
import org.springframework.stereotype.Component;

@Component
public class RequestRequestMapper implements DtoRequestMapper<RequestRequestDto, Request> {

    @Override
    public Request fromDto(RequestRequestDto dto) {
        Request request = new Request();
        request.setPayload(dto.getPayload());
        return request;
    }
}
