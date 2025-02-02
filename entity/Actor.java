package entity;

public class Actor {
    private String name;
    private String actorRole;

    public Actor(String name, String actorRole) {
        this.name = name;
        this.actorRole = actorRole;
    }

    public String getName() {
        return name;
    }

    public String getActorRole() {
        return actorRole;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActorRole(String actorRole) {
        this.actorRole = actorRole;
    }

}
