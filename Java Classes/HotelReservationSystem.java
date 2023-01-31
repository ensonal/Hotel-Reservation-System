import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
  private static HotelReservationSystem instance;
  private List<Reservation> reservations;
  private List<Room> rooms;
  private List<Guest> guests;

  private HotelReservationSystem() {
    this.rooms = new ArrayList<>();
    this.reservations = new ArrayList<>();
    this.guests = new ArrayList<>();
  }

  public static HotelReservationSystem getInstance() {
    if (instance == null) {
      instance = new HotelReservationSystem();
    }
    return instance;
  }

  public void makeReservation(Reservation reservation) {
    reservations.add(reservation);
    System.out.println("Reservation was completed.");
    System.out.println("You can find all informations below. \n" + "Guest Name: " + reservation.getGuest().getName() +
        "\nRoom Number: " + reservation.getRoom().getRoomNumber() + "\nDates: " + reservation.getStartDate().getTime() +
        " to " + reservation.getEndDate().getTime());
  }

  public void cancelReservation(Reservation reservation) {
    reservations.remove(reservation);
    System.out.println("Dear " + reservation.getGuest().getName() + ", " + " your reservation was cancelled.");
  }

  public void addRoom(Room room) {
    rooms.add(room);
    System.out.println(room.getRoomNumber() + " room was added in the hotel.");
  }

  public void removeRoom(Room room) {
    rooms.remove(room);
    System.out.println(room.getRoomNumber() + " room was removed in the hotel.");
  }

  public void addGuest(Guest guest) {
    guests.add(guest);
    System.out.println(guest.getName() + " named guest was added in the hotel system.");
  }

  public void removeGuest(Guest guest) {
    guests.remove(guest);
    System.out.println(guest.getName() + " named guest was removed in the hotel system.");
  }

  public List<Reservation> getReservations() {
    return reservations;
  }

  public List<Room> getRooms() {
    return rooms;
  }

  public List<Guest> getGuests() {
    return guests;
  }
}