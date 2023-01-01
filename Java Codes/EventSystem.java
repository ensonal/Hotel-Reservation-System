import java.util.ArrayList;
import java.util.List;

public class EventSystem implements Subject {
  private List<Observer> observers;
  private String eventName;
  private String eventDescription;
  private String eventLocation;

  public EventSystem() {
    this.observers = new ArrayList<>();
  }

  public void listObservers() {
    for (Observer o : observers) {
      System.out.println(o);
    }
  }

  public void seteventName(String eventName) {
    this.eventName = eventName;
  }

  public void seteventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  public void seteventLocation(String eventLocation) {
    this.eventLocation = eventLocation;
  }

  public void addEvent(String eventName, String eventDescription, String eventLocation) {
    seteventName(eventName);
    seteventDescription(eventDescription);
    seteventLocation(eventLocation);
    notifyObservers();
  }

  @Override
  public void subscribe(Observer observer) {
    observers.add(observer);
    System.out.println("Observer subscribed.");
  }

  @Override
  public void unsubscribe(Observer observer) {
    observers.remove(observer);
    System.out.println("Observer unsubscribed.");
  }

  @Override
  public void notifyObservers() {
    for (int i = 0; i < observers.size(); i++) {
      Observer observer = (Observer) observers.get(i);
      observer.update(eventName, eventDescription, eventLocation);
      System.out.println("All observers have been updated.");
    }
  }
}