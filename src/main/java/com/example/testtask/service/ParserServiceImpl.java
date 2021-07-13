package com.example.testtask.service;

import com.example.testtask.model.Request;
import com.example.testtask.model.Stats;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ParserServiceImpl implements ParserService {
    private final String CUSTOM_REGEX = "[,.!?;:]";

    @Override
    public List<Stats> dataParser(Request request) {
        List<Stats> stats = new ArrayList<>();
        List<String> array = new ArrayList<String>(Arrays.asList(request.getPayload().
                replaceAll(CUSTOM_REGEX, "").split(" ")));

        for (int i = 0; i < array.size(); ) {
            long counter = 1;
            List<String> list = new ArrayList<>();
            list.add(array.get(i));
            array.remove(array.get(i));
            for (int j = 0; j < array.size(); j++) {
                if (list.get(i).equals(array.get(j))) {
                    counter++;
                    array.remove(array.get(j));
                    j--;
                }
            }
            stats.add(new Stats(list.get(i), counter, request));
            list.remove(list.get(i));
        }
        return stats;
    }
}
