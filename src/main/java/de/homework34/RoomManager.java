package de.homework34;

public class RoomManager {
    public static void main(String[] args) {
        SimpleBooking booking = new SimpleBooking();

        int[] RoomNumbers = {100, -5, 0};
        String[] GuestNames = {"Брэд Пит", "", null};

        for (int room : RoomNumbers) {
            for (String guest : GuestNames) {
                try {
                    booking.bookRoom(room, guest);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка обработки бронирования: " + e.getMessage());
                }
            }
        }
    }
}


