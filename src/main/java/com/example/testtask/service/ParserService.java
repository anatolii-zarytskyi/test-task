package com.example.testtask.service;

import com.example.testtask.model.Request;
import com.example.testtask.model.Stats;
import java.util.List;

public interface ParserService {
    List<Stats> dataParser(Request request);
}
