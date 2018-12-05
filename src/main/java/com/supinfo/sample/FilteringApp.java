package com.supinfo.sample;

import com.supinfo.sample.entities.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class FilteringApp
{


    public static void main(String[] args) {

        java8();

    }

    public static void java7() {

        List<String> lines = Arrays.asList("spring", "node", "toto");
        List<String> result = getFilterOutput(lines, "toto");
        for (String temp : result) {
            System.out.println(temp);    //output : spring, node
        }

    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"toto".equals(line)) { // we dont like mkyong
                result.add(line);
            }
        }
        return result;
    }

    public static void java8() {

        List<String> lines = Arrays.asList("spring", "node", "toto");

        System.out.println("Before");
        lines.forEach(System.out::println);


        List<String> linesWithoutToto = lines.stream()
                                 .filter(value -> !value.equals("toto"))
                                 .collect(Collectors.toList());

        System.out.println("after");
        linesWithoutToto.forEach(System.out::println);

    }


    
    
}
