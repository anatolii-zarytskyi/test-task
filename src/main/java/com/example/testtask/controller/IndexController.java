package com.example.testtask.controller;

import com.example.testtask.model.Request;
import com.example.testtask.model.Stats;
import com.example.testtask.model.dto.RequestRequestDto;
import com.example.testtask.model.dto.StatsResponseDto;
import com.example.testtask.service.ParserService;
import com.example.testtask.service.RequestService;
import com.example.testtask.service.StatsService;
import com.example.testtask.service.mapper.DtoRequestMapper;
import com.example.testtask.service.mapper.DtoResponseMapper;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requests")
public class IndexController {
    private final RequestService requestService;
    private final StatsService statsService;
    private final DtoRequestMapper<RequestRequestDto, Request> requestMapper;
    private final DtoResponseMapper<StatsResponseDto, Stats> statsResponseMapper;
    private final ParserService parserService;

    public IndexController(RequestService requestService, StatsService statsService,
                           DtoRequestMapper<RequestRequestDto, Request> requestMapper,
                           DtoResponseMapper<StatsResponseDto, Stats> statsResponseMapper,
                           ParserService parserService) {
        this.requestService = requestService;
        this.statsService = statsService;
        this.requestMapper = requestMapper;
        this.statsResponseMapper = statsResponseMapper;
        this.parserService = parserService;
    }

    @PostMapping
    public List<StatsResponseDto> add(@RequestBody @Valid RequestRequestDto requestDto) {
        Request request = requestService.add(requestMapper.fromDto(requestDto));
        List<Stats> stats = parserService.dataParser(request);
        statsService.add(stats);
        return stats.stream()
                .map(statsResponseMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping
    public List<StatsResponseDto> getAllRequest() {
        return statsService.getAll().stream()
                .map(statsResponseMapper::toDto)
                .collect(Collectors.toList());
    }
}
