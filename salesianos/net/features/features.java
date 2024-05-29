package features;

import java.util.Scanner;

import restaurants.Restaurants;

public class Features extends Restaurants {

    static Scanner scanner = new Scanner(System.in);

    public Features(String name, String location, String schelude, String score) {
        super(name, location, schelude, score);
    }

    public static void addRestaurant(String name, String location, String schelude, String score) {
        Restaurants restaurant = new Restaurants(name, location, schelude, score);
        restaurantsObjects.add(restaurant);
        System.out.println("Restaurant " + restaurant.getName() + " was added successfully");
    }

    public static void editRestaurant(String restaurantName) {
        for (Restaurants restaurants : restaurantsObjects) {
            if (restaurants.getName().equals(restaurantName)) {
                System.out.println("What thing do you want to edit about the restaurant; " + restaurants.getName() + "?");
                System.out.println("""
                        1.Name
                        2.Location
                        3.Schelude
                        4.Score

                        Choose what registry want you to edit and write the number
                        """);
                String option = scanner.nextLine();
                switch (option) {
                    case "1":
                        System.out.println("Wich name want you to put?");
                        String name = scanner.nextLine().trim().toLowerCase();
                        restaurants.setName(name);
                        System.out.println("Name of the restaurant was changed to; " + name);
                        break;
                    case "2":
                        System.out.println("Wich location want you to put?");
                        String location = scanner.nextLine().trim().toLowerCase();
                        restaurants.setLocation(location);
                        System.out.println("Location name of the restaurant was changed to; " + location);
                        break;
                    case "3":
                        System.out.println("Wich schelude want you to put?");
                        String schelude = scanner.nextLine().trim().toLowerCase();
                        restaurants.setSchelude(schelude);
                        System.out.println("The schelude of the restaurant was changed to; " + schelude);
                        break;
                    case "4":
                        System.out.println("Wich name what do you want to put?");
                        String score = scanner.nextLine().trim().toLowerCase();
                        restaurants.setScore(score);
                        System.out.println("The score of the restaurant was changed to; " + score);
                        break;
                    default:
                        System.out.println("You dind't choose a correct option.");
                        break;
                }
            }

        }
        System.out.println("The program couldnt find the restaurant that you was looking for o it doesnt exist");
    }

    public static void showAllRestaurants() {
        System.out.println("*****Data of all restaurants*****\n");
        for (Restaurants restaurants : restaurantsObjects) {
            System.out.println("Name of the restaurant; " + restaurants.getName() +
                    "\n" + "Name of the location; " + restaurants.getLocation() + "\n"
                    + "The schelude; " + restaurants.getSchelude() + "\n" +
                    "The score; " + restaurants.getScore());
            System.out.println("*************************************");
        }
        if (restaurantsObjects.isEmpty()) {
            System.out.println("You didnt add a restaurant yet");
        }
        
    }

    public static void deleteRestaurants(){
        System.out.println("Wich restaurant do you want to erase?");
        String op = scanner.nextLine().toLowerCase().trim();
        for (Restaurants restaurants : restaurantsObjects) {
            if (op.equals(restaurants.getName())) {
                restaurantsObjects.remove(restaurants);
                System.out.println("Restaurant deleted successfully.");
            }
        }
        if (restaurantsObjects.isEmpty()) {
            System.out.println("The restaurant that you are looking for it doesnt exists");
        }
    }

}
