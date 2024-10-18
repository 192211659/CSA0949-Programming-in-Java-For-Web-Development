import java.util.ArrayList;
import java.util.List;

class ExamRoom {
    private int n; // Total number of seats
    private List<Integer> seats; // List of occupied seats

    public ExamRoom(int n) {
        this.n = n;
        this.seats = new ArrayList<>();
    }

    public int seat() {
        if (seats.isEmpty()) {
            seats.add(0); // If no one is in the room, sit at seat 0
            return 0;
        }

        int maxDistance = 0;
        int seatToSit = 0;

        // Check distance from the beginning of the row
        if (seats.get(0) > 0) {
            maxDistance = seats.get(0); // Distance from seat 0 to the first occupied seat
            seatToSit = 0;
        }

        // Check distances between occupied seats
        for (int i = 1; i < seats.size(); i++) {
            int distance = (seats.get(i) - seats.get(i - 1)) / 2; // Halfway between two occupied seats
            if (distance > maxDistance) {
                maxDistance = distance;
                seatToSit = seats.get(i - 1) + distance; // Position to sit
            }
        }

        // Check distance to the end of the row
        if (n - 1 - seats.get(seats.size() - 1) > maxDistance) {
            seatToSit = n - 1; // Sit at the last seat
        }

        // Add the chosen seat to the occupied list and return its index
        seats.add(seatToSit);
        return seatToSit;
    }

    public void leave(int p) {
        seats.remove(Integer.valueOf(p)); // Remove the student from the occupied list
    }
}

public class Main {
    public static void main(String[] args) {
        ExamRoom examRoom = new ExamRoom(10);

        System.out.println(examRoom.seat()); // Output: 0
        System.out.println(examRoom.seat()); // Output: 9
        System.out.println(examRoom.seat()); // Output: 4
        System.out.println(examRoom.seat()); // Output: 2
        examRoom.leave(4);
        System.out.println(examRoom.seat()); // Output: 5
    }
}
