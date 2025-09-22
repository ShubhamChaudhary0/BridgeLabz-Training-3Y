import java.util.*;

class Flight {
    String number, dest;
    int seats;
    Flight(String number, String dest, int seats) {
        this.number = number; this.dest = dest; this.seats = seats;
    }
}

public class FlightBookingSystem {
    static List<Flight> flights = new ArrayList<>();

    public static void search(String dest) {
        for (Flight f : flights) {
            if (f.dest.equalsIgnoreCase(dest)) {
                System.out.println(f.number + " -> " + f.dest + " | Seats: " + f.seats);
            }
        }
    }

    public static void book(String number) throws Exception {
        for (Flight f : flights) {
            if (f.number.equalsIgnoreCase(number)) {
                if (f.seats <= 0) throw new Exception("No seats available!");
                f.seats--;
                System.out.println("Seat booked on flight " + number);
                return;
            }
        }
        throw new Exception("Flight not found!");
    }

    public static void main(String[] args) {
        flights.add(new Flight("AI101","Delhi",2));
        flights.add(new Flight("AI202","Mumbai",1));
        search("Delhi");
        try { book("AI101"); } catch(Exception e){ System.out.println(e.getMessage()); }
    }
}
