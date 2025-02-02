package entity;

public class Session {
    private boolean stateSession;
    private int time;

    public Session(boolean stateSession, int time) {
        this.stateSession = stateSession;
        this.time = time;
    }

    public boolean isStateSession() {
        return stateSession;
    }

    public void setStateSession(boolean stateSession) {
        this.stateSession = stateSession;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void registerMovie() {

    }

    public void availableSeats() {
    }

}
