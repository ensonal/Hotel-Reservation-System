
# Hotel Reservation System

In a team of 2, we created a simple hotel reservation system that actively keeps room, customer, hotel activities in the hotel system and runs them in a specific flow.

The problem we are trying to solve is the inability to efficiently and orderly manage hotel reservations, rooms and guests. This may include tasks such as booking rooms for guests, tracking room availability, etc. Informs guests about ongoing events throughout the day.

We used 3 different patterns to make the various classes created in this system more efficient and safe.




## Singleton Pattern
The singleton pattern is used to ensure that there is only one instance of the HotelReservationSystem class. This is useful because it ensures that there is only one central point of management for the hotel's reservations, rooms, and guests. This allows for better control and organization of the hotel's resources, and ensures that there are no conflicts when multiple users are interacting with the System

![App Screenshot](https://raw.githubusercontent.com/ensonal/Hotel-Reservation-System/main/Java%20UML%20Class%20Diagrams/singleton.png)

## Observer Pattern
The observer pattern is used to allow guests to receive updates about events of the hotel. This is useful because it allows the hotel to send out updates and notifications to its guests without having to manually contact each guest indiviually. The guests are subscribed to the event system, and when an event is added, the observers(guests) are automatically notified.

![App Screenshot](https://raw.githubusercontent.com/ensonal/Hotel-Reservation-System/main/Java%20UML%20Class%20Diagrams/observer.png)

## Factory Method Pattern
The factory pattern is used to create Room objects of specific types(single rooms, double rooms and suites). This is useful because it allows the hotel to easily create and add new rooms to the system without having to manually create each room object. The factory abstracts the creation of the room objects and provides a convenient way to create new rooms of different types.

![App Screenshot](https://raw.githubusercontent.com/ensonal/Hotel-Reservation-System/main/Java%20UML%20Class%20Diagrams/factory.png)


## Statement of Work
### Scope
- Design and implement a user interface for the hotel reservation system.
- Test the system to ensure that it meets the functional and non functional requirements.
- Implement the observer pattern to allow quests to receive updates about events at the hotel.
- Implement the factory method pattern tor create Room object of specific types.
- Implement the singleton pattern to ensure that there is only one instance of the HotelReservationSystem class.

### Repo contains
- A working main class of this system.
- Readme file.
- Implementation of the system(all classes).
- UML diagrams of patterns.
## Authors

- [@ensonal](https://www.github.com/ensonal)
- [@aleyge](https://github.com/Aleyge)



