package de.homework34;

public class SimpleBooking {
    public void bookRoom(int roomNumber, String guestName) {
        if (roomNumber <= 0) {
            System.out.println(" Некорректный номер комнаты: " + roomNumber);

        }
        if (guestName == null || guestName.trim().isEmpty()) {
            System.out.println(" Некорректное имя гостя");

        } else {
            System.out.println("Комната " + roomNumber + " успешно забронирована для " + guestName);


        }
    }
}
