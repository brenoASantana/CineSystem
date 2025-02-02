package entity;

public class Room {
    private int quantSeats;
    private String screenType;
    private String location;

    public Room(int quantSeats, String screenType, String location) {
        this.quantSeats = quantSeats;
        this.screenType = screenType;
        this.location = location;
    }

    public int getQuantSeats() {
        return quantSeats;
    }

    public void setQuantSeats(int quantSeats) {
        this.quantSeats = quantSeats;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
