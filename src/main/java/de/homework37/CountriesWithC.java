package de.homework37;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountriesWithC {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Germany", "France", "Brazil", "Argentina", "Canada", "China", "Australia", "India");
        List<String> result = countries.stream().filter( countryname -> countryname.startsWith("C")).collect(Collectors.toList());
        System.out.println(result);
    }
}
