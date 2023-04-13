package com.example.exercises.task;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.tuple.Pair;

import javax.annotation.Nullable;
import java.util.Map;

public class TestApp {
    public static void main(String[] args) {
        /*
        arr = [87, 1, 13, 99, 64, 198, 13, 221, 3]
sum = 100

         */
        System.out.println(findPairWithSumByHashMap(new int[]{88, 1, 13, 99, 64, 198, 13, 221, 3}, 100));
    }

    @Nullable
    private static Pair<Integer, Integer> findPairWithSum(int[] source, int sum) {

        for (int i = 0; i < source.length - 1; i++) {
            for (int j = i + 1; j < source.length; j++) {
                if (source[i] + source[j] == sum) {
                    return Pair.of(i, j);
                }
            }
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> findPairWithSumByHashMap(int[] source, int sum) {
        Map<Integer, Integer> indexCache = Maps.newHashMap();
        for (int index = 0; index < source.length; index++) {
            indexCache.put(source[index], index);
        }

        for (int i = 0; i < source.length; i++) {
            Integer pairIndex = indexCache.get(sum - source[i]) ;
            if (pairIndex != null) {
                return Pair.of(i, pairIndex);
            }
        }
        return null;
    }






}
