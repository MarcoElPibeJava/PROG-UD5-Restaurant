package restaurants;

import java.util.ArrayList;

public class Restaurants {
    public static ArrayList<Restaurants> restaurantsObjects = new ArrayList<>();
    private String name;
    private String location;
    private String schelude;
    private String score;

    public Restaurants(String name, String location, String schelude,
            String score) {
        this.name = name;
        this.location = location;
        this.schelude = schelude;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSchelude() {
        return schelude;
    }

    public void setSchelude(String schelude) {
        this.schelude = schelude;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    

    
}
