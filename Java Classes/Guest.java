public class Guest implements Observer {
    private String name;
    private String email;
    private String eventName, eventDescription, eventLocation;

    public Guest(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void display() {
        System.out.println("Dear " + this.name + ", " + " you can join event and informations below" + "\n" +
                "- " + eventName + "\n- " + eventDescription + "\n- " + eventLocation);
    }

    @Override
    public void update(String eventName, String eventDescription, String eventLocation) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventLocation = eventLocation;

    }
}