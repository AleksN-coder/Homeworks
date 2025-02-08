package de.homework37;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountriesWithA {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Germany", "France", "Brazil", "Argentina", "Canada", "China", "Australia", "India");
        List<String> result = countries.stream().filter( countryname -> countryname.contains("a")).collect(Collectors.toList());
        System.out.println(result);
    }
}
