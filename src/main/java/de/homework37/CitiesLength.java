package de.homework37;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CitiesLength {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Berlin", "Buenos Aires", "Paris", "Los Angeles", "New York", "London", "Beijing");

        List<String> result = cities.stream().filter( cityname -> cityname.length() >= 6).collect(Collectors.toList());
        System.out.println(result);
    }
}
