import java.util.Scanner;
public class Booking {
    private Room room;
    private Guest guest;

    // Constructor // Здесь можно применять аттрибуты с разных классов
    public Booking(Room room, Guest guest) {
        this.room = room;
        this.guest = guest;

    }
    // Method to calculate booking price based on people
    public int bookingPrice(int people) {
        return people * 150; // Assume each person costs $150
    }
}