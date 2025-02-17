package de.homework39;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class WeatherApp {


    public static void main(String[] args) {

        List<Weather> weatherList = WeatherTestData.getWeatherList();

        List<Weather> coldWeatherList = weatherList.stream()
                .filter(w -> w.getTemperature() < 0)
                .collect(Collectors.toList());
        for (Weather weather : coldWeatherList) {
            System.out.println("The cities whose temperature drops below zero :" + weather.getCity() + " (" + weather.getTemperature() + "°C)");

        }
        boolean maxTemperatureList = weatherList.stream()
                .anyMatch(w -> w.getTemperature() > 25);
        List<Weather> hotWeatherList = weatherList.stream()
                .filter(w -> w.getTemperature() > 25)
                .collect(Collectors.toList());
        for (Weather weather : hotWeatherList) {
            System.out.println("Are there any cities with temperatures above 25°C? *" + maxTemperatureList + "*: It's the  city :" + weather.getCity());

        }
        Optional<Weather> maxTemperatureCity = weatherList.stream()
                .max(Comparator.comparingDouble(Weather::getTemperature));
        List<Weather> maxHotCity = weatherList.stream()
                .filter(w -> w.getTemperature() == maxTemperatureCity.get().getTemperature())
                .collect(Collectors.toList());
        for (Weather weather : maxHotCity) {

            System.out.println("The city  with maximum temperature :" + maxTemperatureCity.get().getCity() + "+" +
                    maxTemperatureCity.get().getTemperature() + "°C");

        }
        double averageTemperature = weatherList.stream()
                .mapToDouble(Weather::getTemperature)
                .average()
                .orElse(Double.NaN);

        System.out.println("Average temperature: " + averageTemperature);

        Map<Boolean, List<Weather>> groupedByRain = weatherList.stream()
                .collect(Collectors.groupingBy(Weather::isRainy));
        System.out.println("Cities grouped by rain status:");
        for (Map.Entry<Boolean, List<Weather>> entry : groupedByRain.entrySet()) {
            boolean isRainy = entry.getKey();
            List<Weather> cities = entry.getValue();

            System.out.println(isRainy ? "Rainy Cities:" : "Non-Rainy Cities:");

            for (Weather weather : cities) {
                System.out.println(" - " + weather.getCity() + " (" + weather.getTemperature() + "°C)");
            }
        }

            List<Weather> sortsCities = weatherList.stream()
                    .sorted(Comparator.comparing(Weather::getCity))
                    .collect(Collectors.toList());
            for (Weather weather : sortsCities) {
                System.out.println("Sort data by the city name:" + weather.getCity());
            }
        }
    }
