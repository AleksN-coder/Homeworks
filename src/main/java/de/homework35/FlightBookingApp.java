package de.homework35;

public class FlightBookingApp {
    public static void main(String[] args) {
        FlightBooking flightBooking = new FlightBooking();
        String[] FlightNumbers = {"DF777", "", null};
        String[] PassengerNames = {"Elon Musk", "", null};
        int[] SeatNumbers = {9, -1, 0};

        for (String flight : FlightNumbers) {
            for (String passenger : PassengerNames) {
                for (int seat : SeatNumbers) {
                    try {
                        flightBooking.bookFlight(flight, passenger, seat);
                    } catch (IllegalArgumentException exception) {
                        System.out.println("Booking error:" + exception.getMessage());
                    }
                }
            }
        }
    }
}
