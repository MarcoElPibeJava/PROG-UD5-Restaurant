import java.util.ArrayList;
import java.util.Scanner;

import restaurants.Restaurant;

public class Main {
    public static void main(String[] args) {
        ArrayList<Restaurant> restaurantsObjects = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean stillOn = true;
        String op;
        do {
            System.out.println("Welcome to the program, what do you want?");
            System.out.println("""
                    1.-Add restaurant
                    2.-Edit restaurant
                    3.-Show restaurant
                    4.-Delete restaurant
                    Q.Stop program
                    """);
            op = scanner.nextLine().toLowerCase();
            switch (op) {
                case "1":
                    System.out.println("What restaurant do you want to add");
                    String restaurantName = scanner.nextLine().trim().toLowerCase();
                    System.out.println("The location of the restaurant?");
                    String location = scanner.nextLine().trim().toLowerCase();
                    System.out.println("the schelude?");
                    String schelude = scanner.nextLine().trim().toLowerCase();
                    System.out.println("and for the end the score");
                    String score = scanner.nextLine().trim().toLowerCase();
                    Restaurant restaurant = new Restaurant(restaurantName, location, schelude, score);
                    restaurantsObjects.add(restaurant);
                    System.out.println("Restaurant " + restaurant.getName() + " was added successfully");
                    break;
                case "2":
                    System.out.println("wich restaurant do you want to edit?");
                    String nameEdit = scanner.nextLine();
                    for (Restaurant restaurants : restaurantsObjects) {
                        if (restaurants.getName().equals(nameEdit)) {
                            System.out
                                    .println("What thing do you want to edit about the restaurant; "
                                            + restaurants.getName() + "?");
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
                                    String nameEditRestaurant = scanner.nextLine().trim().toLowerCase();
                                    restaurants.setName(nameEditRestaurant);
                                    System.out.println("Name of the restaurant was changed to; " + nameEditRestaurant);
                                    break;
                                case "2":
                                    System.out.println("Wich location want you to put?");
                                    String locationEdit = scanner.nextLine().trim().toLowerCase();
                                    restaurants.setLocation(locationEdit);
                                    System.out
                                            .println("Location name of the restaurant was changed to; " + locationEdit);
                                    break;
                                case "3":
                                    System.out.println("Wich schelude want you to put?");
                                    String scheludeEdit = scanner.nextLine().trim().toLowerCase();
                                    restaurants.setSchelude(scheludeEdit);
                                    System.out
                                            .println("The schelude of the restaurant was changed to; " + scheludeEdit);
                                    break;
                                case "4":
                                    System.out.println("Wich name what do you want to put?");
                                    String scoreEdit = scanner.nextLine().trim().toLowerCase();
                                    restaurants.setScore(scoreEdit);
                                    System.out.println("The score of the restaurant was changed to; " + scoreEdit);
                                    break;
                                default:
                                    System.out.println("You dind't choose a correct option.");
                                    break;
                            }
                        }

                    }
                    System.out.println(
                            "The program couldnt find the restaurant that you was looking for o it doesnt exist");
                    ;
                    break;
                case "3":
                    System.out.println("*****Data of all restaurants*****\n");
                    for (Restaurant restaurants : restaurantsObjects) {
                        System.out.println("Name of the restaurant; " + restaurants.getName() +
                                "\n" + "Name of the location; " + restaurants.getLocation() + "\n"
                                + "The schelude; " + restaurants.getSchelude() + "\n" +
                                "The score; " + restaurants.getScore());
                        System.out.println("*************************************");
                    }
                    if (restaurantsObjects.isEmpty()) {
                        System.out.println("You didnt add a restaurant yet");
                    }
                    break;
                case "4":
                    System.out.println("Wich restaurant do you want to erase?");
                    String opDelete = scanner.nextLine().toLowerCase().trim();
                    for (Restaurant restaurants : restaurantsObjects) {
                        if (opDelete.equals(restaurants.getName())) {
                            restaurantsObjects.remove(restaurants);
                            System.out.println("Restaurant deleted successfully.");
                        }
                    }
                    if (restaurantsObjects.isEmpty()) {
                        System.out.println("The restaurant that you are looking for it doesnt exists");
                    }
                    break;
                case "q":
                    System.out.println("stopping program");
                    stillOn = false;
                    break;
                default:
                    System.out.println("You didnt choose a correct option");
                    break;
            }
        } while (stillOn);
        scanner.close();
    }
}