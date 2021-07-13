package com.example.testtask.service.mapper;

public interface DtoResponseMapper<T, K> {
    T toDto(K obj);
}
