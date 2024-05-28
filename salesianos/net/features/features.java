package features;

import java.util.ArrayList;

import restaurants.Restaurants;

public class Features extends Restaurants{

    public Features(ArrayList<Restaurants> restaurants, String name, String location, String schelude, String score) {
        super(restaurants, name, location, schelude, score);
    }
    
    public void addRestaurant(String name,String location,String schelude,String score){
        Restaurants restaurant = new Restaurants(restaurants, name, location, schelude, score);
       this. restaurants.add(restaurant);
    }
}
