package de.homework35;

public  class FlightsRegister {

    private final String[] flights = {"SU100", "BA202", "LH300", "AF101", "AA777"};
    private final String[] passengers = new String[flights.length];

    public void addPassenger(int flightIndex, String passengerName) {
        if (flightIndex < 0 || flightIndex >= flights.length) {
            throw new ArrayIndexOutOfBoundsException("Error: Flight index out of bounds: " + flightIndex);
        }
        if (passengerName == null || passengerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Passenger name cannot be empty or null.");
        }
        passengers[flightIndex] = passengerName;
        System.out.println("Passenger " + passengerName + " was added to flight " + flights[flightIndex]);
    }

    public String getPassenger(int flightIndex) throws NoPassengerException {
        if (flightIndex < 0 || flightIndex >= flights.length) {
            throw new ArrayIndexOutOfBoundsException("Error: Flight index out of bounds: " + flightIndex);
        }
        if (passengers[flightIndex] == null) {
            throw new NoPassengerException("Error: No passenger found for flight " + flights[flightIndex]);
        }
        return passengers[flightIndex];
    }
}