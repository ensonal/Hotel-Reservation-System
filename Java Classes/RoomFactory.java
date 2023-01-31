public class RoomFactory {
  public static Room createRoom(String type, int roomNumber, int capacity, double pricePerNight) {
    switch (type) {
      case "Single":
        System.out.println(type + " " + roomNumber + " room was created.");
        return new SingleRoom(roomNumber, capacity, pricePerNight);
      case "Double":
        System.out.println(type + " " + roomNumber + " room was created.");
        return new DoubleRoom(roomNumber, capacity, pricePerNight);
      case "Suite":
        System.out.println(type + " " + roomNumber + " room was created.");
        return new Suite(roomNumber, capacity, pricePerNight);
      default:
        throw new IllegalArgumentException("Invalid room type: " + type);
    }
  }

  
}