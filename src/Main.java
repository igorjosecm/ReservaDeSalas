package src;

import java.io.*;
import java.util.*;
public class Main {
    static List<Sala> salas = new ArrayList<>();
    static List<Reserva> reservas = new ArrayList<>();

    public static void loadRooms() {
        try (Scanner scanner = new Scanner(new File("rooms.txt"))) {
            int roomCount = scanner.nextInt();
            for (int i = 0; i < roomCount; i++) {
                Sala sala = new Sala();
                sala.codSala = scanner.next();
                sala.nomeSala = scanner.next();
                sala.capacidade = scanner.nextInt();
                sala.andar = scanner.nextInt();
                salas.add(sala);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening rooms file.");
        }
    }

    public static void saveReservations() {
        try (PrintWriter writer = new PrintWriter("reservations.txt")) {
            writer.println(reservas.size());
            for (Reservation r : reservas) {
                writer.printf("%d %d %s %s %d%n", r.id, r.roomId, r.roomName, r.date, r.peopleCount);
            }
        } catch (IOException e) {
            System.out.println("Error opening reservations file.");
        }
    }

    public static void loadReservations() {
        try (Scanner scanner = new Scanner(new File("reservations.txt"))) {
            int reservationCount = scanner.nextInt();
            for (int i = 0; i < reservationCount; i++) {
                Reservation r = new Reservation();
                r.id = scanner.nextInt();
                r.roomId = scanner.nextInt();
                r.roomName = scanner.next();
                r.date = scanner.next();
                r.peopleCount = scanner.nextInt();
                reservas.add(r);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening reservations file.");
        }
    }

    public static void listRooms() {
        System.out.println("Available rooms:");
        for (Room r : salas) {
            System.out.printf("ID: %d, Name: %s, Capacity: %d, Available: %d%n", r.id, r.name, r.capacity, r.available);
        }
    }

    public static void listReservations() {
        System.out.println("All reservations:");
        for (Reservation r : reservas) {
            System.out.printf("Reservation ID: %d, Room ID: %d, Room Name: %s, Date: %s, People Count: %d%n",
                    r.id, r.roomId, r.roomName, r.date, r.peopleCount);
        }
    }

    public static void listRoomReservations(int roomId) {
        System.out.printf("Reservations for Room ID %d:%n", roomId);
        for (Reservation r : reservas) {
            if (r.roomId == roomId) {
                System.out.printf("Reservation ID: %d, Date: %s, People Count: %d%n", r.id, r.date, r.peopleCount);
            }
        }
    }

    public static void makeReservation(Scanner scanner) {
        System.out.print("Enter Room ID: ");
        int roomId = scanner.nextInt();
        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = scanner.next();
        System.out.print("Enter number of people: ");
        int peopleCount = scanner.nextInt();

        Room room = null;
        for (Room r : salas) {
            if (r.id == roomId) {
                room = r;
                break;
            }
        }

        if (room == null) {
            System.out.println("Room not found.");
            return;
        }

        if (peopleCount > room.capacity) {
            System.out.println("Room capacity exceeded.");
            return;
        }

        for (Reservation r : reservas) {
            if (r.roomId == roomId && r.date.equals(date)) {
                System.out.println("Room already reserved on this date.");
                return;
            }
        }

        Reservation reservation = new Reservation();
        reservation.id = reservas.size() + 1;
        reservation.roomId = roomId;
        reservation.roomName = room.name;
        reservation.date = date;
        reservation.peopleCount = peopleCount;

        reservas.add(reservation);
        System.out.println("Reservation made successfully.");
    }

    public static void cancelReservation(Scanner scanner) {
        System.out.print("Enter Reservation ID to cancel: ");
        int reservationId = scanner.nextInt();

        Reservation target = null;
        for (Reservation r : reservas) {
            if (r.id == reservationId) {
                target = r;
                break;
            }
        }

        if (target == null) {
            System.out.println("Reservation not found.");
            return;
        }

        reservas.remove(target);
        System.out.println("Reservation cancelled successfully.");
    }

    public static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. List Rooms");
        System.out.println("2. List All Reservations");
        System.out.println("3. List Reservations for a Room");
        System.out.println("4. Make a Reservation");
        System.out.println("5. Cancel a Reservation");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        loadRooms();
        loadReservations();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    listRooms();
                    break;
                case 2:
                    listReservations();
                    break;
                case 3:
                    System.out.print("Enter Room ID: ");
                    int roomId = scanner.nextInt();
                    listRoomReservations(roomId);
                    break;
                case 4:
                    makeReservation(scanner);
                    break;
                case 5:
                    cancelReservation(scanner);
                    break;
                case 6:
                    System.out.println("Exiting program. Here are the final reservations:");
                    listReservations();
                    saveReservations();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

}