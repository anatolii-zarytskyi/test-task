package com.example.testtask.service;

import com.example.testtask.model.Request;

public interface RequestService {
    Request add(Request request);

    Request get(Long requestId);
}
