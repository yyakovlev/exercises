package com.example.exercises.task;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
   private String name;
   private int age;
   private int salary;
}
