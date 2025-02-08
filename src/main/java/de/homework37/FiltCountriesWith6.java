package de.homework37;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltCountriesWith6 {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Mexico", "Sweden", "Brazil", "Russia", "Canada", "France", "Norway");
        List<String> result = countries.stream().filter( cityname -> cityname.length() == 6).collect(Collectors.toList());
        System.out.println(result);
    }
}
