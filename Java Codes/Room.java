public abstract class Room {
    private int roomNumber;
    private int capacity;
    private double pricePerNight;
  
    public Room(int roomNumber, int capacity, double pricePerNight) {
      this.roomNumber = roomNumber;
      this.capacity = capacity;
      this.pricePerNight = pricePerNight;
    }
  
    public int getRoomNumber() {
      return roomNumber;
    }
  
    public int getCapacity() {
      return capacity;
    }
  
    public double getPricePerNight() {
      return pricePerNight;
    }
  }