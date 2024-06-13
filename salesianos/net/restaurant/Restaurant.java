package restaurant;

public class Restaurant {

    private String name;
    private String location;
    private String schelude;
    private int score;

    public Restaurant(String name, String location, String schelude,
            int score) {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Restaurant Name;" + name + ", The location of the restaurant=" + location + ", the schelude=" + schelude + ", and the score=" + score
                + "+ \n";
    }
}
