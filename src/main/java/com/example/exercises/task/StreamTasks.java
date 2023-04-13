package com.example.exercises.task;

import com.google.common.collect.Lists;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

@UtilityClass
public class StreamTasks {

    @Nullable
    public static Person getOldestPerson(List<Person> persons) {
        return persons.stream().collect(Collectors.maxBy(
                Comparator.comparing(Person::getAge)
        )).orElse(null);
    }

    private void dummy() {
        StringUtils.isEmpty("");
        ArrayUtils.toString(new Object[0]);
        Lists.newArrayList();
    }
}
