package com.example.testtask.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;
    private Long entry;
    @ManyToOne
    private Request request;

    public Stats(String word, Long entry, Request request) {
        this.word = word;
        this.entry = entry;
        this.request = request;
    }

    public Stats() {

    }
}
