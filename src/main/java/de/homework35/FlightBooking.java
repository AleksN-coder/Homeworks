package de.homework35;

public class FlightBooking {

    public static void bookFlight(String flightNumber, String passengerName, int seatNumber) {

        if (flightNumber == null || flightNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("flightNumber is empty or null");
        }
        if (passengerName == null || passengerName.trim().isEmpty()) {
            throw new IllegalArgumentException("passengerName is empty or null");
        }
        if (seatNumber <= 0) {
            throw new IllegalArgumentException("seatNumber must be greater than 0");
        }
        System.out.println("Flight " + flightNumber + " successfully booked for " + passengerName + "\n" +
                "in place " + seatNumber);
    }

}
