package com.example.testtask.service;

import com.example.testtask.model.Request;
import com.example.testtask.repository.RequestRepository;
import org.springframework.stereotype.Service;

@Service
public class RequestServiceImpl implements RequestService {
    private final RequestRepository requestRepository;

    public RequestServiceImpl(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public Request add(Request request) {
        return requestRepository.save(request);
    }

    @Override
    public Request get(Long requestId) {
        return requestRepository.getById(requestId);
    }

}
