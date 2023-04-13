package com.example.exercises.task;

import lombok.AllArgsConstructor;

import java.util.concurrent.atomic.AtomicInteger;


@AllArgsConstructor
public class AtomicIncrementor {

    private final AtomicInteger value;

    public Integer increment(int inc) {
        while(true) {
            int expected = value.get();
            int newValue = expected + inc;
            if (value.compareAndSet(expected, newValue)) {
                return newValue;
            }
        }

    }


}
