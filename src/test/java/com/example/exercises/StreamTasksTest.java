package com.example.exercises;

import com.example.exercises.task.Person;
import com.example.exercises.task.StreamTasks;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



@Slf4j
public class StreamTasksTest {

    private List<Person> persons = List.of(
            Person.builder().name("John").age(26).salary(5000).build(),
            Person.builder().name("Alice").age(30).salary(6000).build(),
            Person.builder().name("Vlad").age(35).salary(8000).build()
    );

    @Test
    public void givenNonemptyPersons_whenGetOldest_thenNonnullPerson() {
        Person p = StreamTasks.getOldestPerson(persons);
        assertThat(p, is(notNullValue()));
        assertThat(p.getAge(), equalTo(35));
    }
}
