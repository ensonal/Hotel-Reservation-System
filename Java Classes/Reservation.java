import java.util.Calendar;


public class Reservation {
  private Guest guest;
  private Room room;
  private Calendar startDate;
  private Calendar endDate;

  public Reservation(Guest guest, Room room, Calendar startDate, Calendar endDate) {
    this.guest = guest;
    this.room = room;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public Guest getGuest() {
    return guest;
  }

  public Room getRoom() {
    return room;
  }

  public Calendar getStartDate() {
    return startDate;
  }

  public Calendar getEndDate() {
    return endDate;
  }
}