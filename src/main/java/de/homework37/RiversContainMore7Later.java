package de.homework37;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RiversContainMore7Later {
    public static void main(String[] args) {
        List<String> rivers = Arrays.asList("Amazon", "Nile", "Yangtze", "Mississippi", "Danube", "Main", "Ganges");
        List<String> result = rivers.stream().filter( rivername -> rivername.length() > 7).collect(Collectors.toList());
        System.out.println(result);
    }
}
