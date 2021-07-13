package com.example.testtask.service.mapper;

public interface DtoRequestMapper<K, T> {
    T fromDto(K obj);
}
