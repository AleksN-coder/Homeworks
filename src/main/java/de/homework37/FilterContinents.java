package de.homework37;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterContinents {
    public static void main(String[] args) {
        List<String> continents = Arrays.asList("Europe", "Asia", "Africa", "Australia", "Antarctica", "South America", "North America");
        List<String> result = continents.stream().filter( cityname -> cityname.length() < 7).collect(Collectors.toList());
        System.out.println(result);
    }
}
