package com.company.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex
{

    public static void main(String[] args) {

        List<String> names= Arrays.asList("balakris","sanjay","yuvarj","aari","virat");
        names.stream().filter(f->f.length()>3).forEach(System.out::println);

       List<String> s= names.stream().filter(n->n.endsWith("s")).collect(Collectors.toList());
        System.out.println(s);
    }
}
