package entity;

import enumetation.EnumGenderMovie;

public class Movie {
    private String title;
    private int duration;
    private EnumGenderMovie gender;

    public Movie(String title, int duration, EnumGenderMovie gender) {
        this.title = title;
        this.duration = duration;
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {

        return duration;
    }

    public EnumGenderMovie getGender() {
        return gender;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setGender(EnumGenderMovie gender) {
        this.gender = gender;
    }

}
