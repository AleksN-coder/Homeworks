package de.homework35;

public class FlightsRegisterApp {
    FlightsRegister register = new FlightsRegister();

    // Тест addPassenger
        try {
        register.addPassenger(2, "Frank Sinatra");
        register.addPassenger(5, "Wrong Index");
    } catch (ArrayIndexOutOfBoundsException exception) {
        System.out.println(exception.getMessage());
    }

        try {
        register.addPassenger(1, "");
    } catch ( IllegalArgumentException exception) {
        System.out.println(exception.getMessage());
    }

        try {
        register.addPassenger(3, null);
    } catch (IllegalArgumentException exception) {
        System.out.println(exception.getMessage());
    }

    // Тест getPassenger
        try {
        System.out.println("Passenger on flight LH300: " + register.getPassenger(2));
        System.out.println("Passenger on flight AF101: " + register.getPassenger(3));
    } catch (ArrayIndexOutOfBoundsException exception) {
        System.out.println(exception.getMessage());
    }
}


