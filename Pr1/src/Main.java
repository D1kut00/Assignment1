import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Room r = new Room();
        Guest g = new Guest();
        Booking b = new Booking(r,g);
        System.out.println("How many people are going to be in the room? ");
        int people = g.PPR();
        int price = b.bookingPrice(people);
        System.out.println("The price for "+people+" people will be: "+ price);
        if (people > price) {
            System.out.println("There are bigger number of people than price");
        } else {
            System.out.println("There are bigger number of price then people");
        }
    }
}