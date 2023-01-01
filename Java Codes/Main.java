/*
 * @author Muhammed Enes Onal
 * @author Ali Ege Ozceylan
 */

import java.util.Calendar;

public class Main {
  public static void main(String[] args) {
    HotelReservationSystem hotelReservationSystem = HotelReservationSystem.getInstance();
    EventSystem eventSystem = new EventSystem();

    Guest guest1 = new Guest("John Smith", "johnsmith@example.com", "123-456-7890");
    Guest guest2 = new Guest("Jane Doe", "janedoe@example.com", "098-765-4321");
    Guest guest3 = new Guest("Henry Johnson", "henryjohnson@example.com", "759-785-1247");
    Guest guest4 = new Guest("Emily Rodriguez", "emilyrodriguez@example.com", "856-327-446");

    hotelReservationSystem.addGuest(guest1);
    hotelReservationSystem.addGuest(guest2);

    Room room1 = RoomFactory.createRoom("Single", 101, 1, 99.99);
    Room room2 = RoomFactory.createRoom("Double", 201, 2, 149.99);
    Room room3 = RoomFactory.createRoom("Suite", 301, 4, 199.99);
    Room room4 = RoomFactory.createRoom("Suite", 302, 4, 199.99);

    hotelReservationSystem.addRoom(room1);
    hotelReservationSystem.addRoom(room2);
    hotelReservationSystem.addRoom(room3);
    hotelReservationSystem.addRoom(room4);
    hotelReservationSystem.removeRoom(room4);

    Calendar startDate = Calendar.getInstance();
    startDate.set(2022, Calendar.JULY, 1);

    Calendar endDate = Calendar.getInstance();
    endDate.set(2022, Calendar.JULY, 5);

    Reservation r1 = new Reservation(guest1, room1, startDate, endDate);
    Reservation r2 = new Reservation(guest2, room2, startDate, endDate);
    Reservation r3 = new Reservation(guest3, room3, startDate, endDate);

    hotelReservationSystem.makeReservation(r1);
    hotelReservationSystem.makeReservation(r2);
    hotelReservationSystem.makeReservation(r3);
    hotelReservationSystem.cancelReservation(r2);

    eventSystem.subscribe(guest1);
    eventSystem.subscribe(guest2);
    eventSystem.subscribe(guest3);
    eventSystem.subscribe(guest4);
    eventSystem.unsubscribe(guest2);

    eventSystem.addEvent("Pool Party", "Come join us for a pool party at the hotel!", "Pool Area");

    guest1.display();
    guest2.display();
    guest3.display();
    guest4.display();

    eventSystem.addEvent("Po123123ol Party", "Come join us for a pool party at the hotel!", "Pool Area");

    guest1.display();
    guest2.display();
    guest3.display();
    guest4.display();

    eventSystem.listObservers();
  }
}