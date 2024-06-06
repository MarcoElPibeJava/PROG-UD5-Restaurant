import java.util.ArrayList;
import java.util.Scanner;

import features.Features;
import restaurants.Restaurants;

public class Main {
    public static void main(String[] args) {
        ArrayList<Restaurants> restaurantsObjects = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean stillOn = true;
        String op;
        do {
            System.out.println("Welcome to the program, what do you want?");
            System.out.println("""
                    1.-Add restaurant
                    2.-Edit restaurant
                    3.-Show restaurants
                    4.-Delete restaurants
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
                    Features.addRestaurant(restaurantName, location, schelude, score);
                    break;
                case "2":
                    System.out.println("wich restaurant do you want to edit?");
                    String name = scanner.nextLine();
                    Features.editRestaurant(name);;
                    break;
                case "3":
                    Features.showAllRestaurants();
                    break;
                case "4":
                    Features.deleteRestaurants();
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