import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import restaurant.Restaurant;

public class Main {
    public static void main(String[] args) {
        ArrayList<Restaurant> restaurantsObjects = new ArrayList<>();
        Restaurant restaurant = new Restaurant(null, null, null, 0);
        boolean stillOn = true;
        String op;
        do {
            JOptionPane.showMessageDialog(null, "Welcome to the program, what do you want?");
            op = JOptionPane.showInputDialog("""
                    1.-Add restaurant
                    2.-Edit restaurant
                    3.-Show restaurant
                    4.-Delete restaurant
                    Q.Stop program
                    """).toLowerCase();
            switch (op) {
                case "1":

                    String restaurantName = JOptionPane.showInputDialog("What restaurant do you want to add").trim()
                            .toLowerCase();
                    String location = JOptionPane.showInputDialog("The location of the restaurant?").toLowerCase()
                            .trim();
                    String schelude = JOptionPane.showInputDialog("the schelude?").trim().toLowerCase();

                    int score = Integer.parseInt(JOptionPane
                            .showInputDialog("and for the end the score, just values between 0 and 5 are permited."));
                    if (score == 0 || score == 1 || score == 2 || score == 3 || score == 4 || score == 5) {
                        restaurant = new Restaurant(restaurantName, location, schelude, score);
                        restaurantsObjects.add(restaurant);
                        System.out.println("Restaurant " + restaurant.getName() + " was added successfully");
                        break;
                    } else {
                        System.out.println("You didnt put the correct score.");
                    }

                case "2":
                    String nameEdit = JOptionPane.showInputDialog("wich restaurant do you want to edit?");

                    for (Restaurant restaurants : restaurantsObjects) {
                        if (restaurants.getName().equals(nameEdit)) {
                            JOptionPane.showMessageDialog(null, "What thing do you want to edit about the restaurant; "
                                    + restaurants.getName() + "?");
                            String option = JOptionPane.showInputDialog("""
                                     1.Name
                                    2.Location
                                    3.Schelude
                                    4.Score

                                    Choose what registry want you to edit and write the number
                                    """);
                            switch (option) {
                                case "1":
                                    String nameEditRestaurant = JOptionPane
                                            .showInputDialog("Wich name want you to put?").trim().toLowerCase();
                                    restaurants.setName(nameEditRestaurant);
                                    JOptionPane.showMessageDialog(null,
                                            "Name of the restaurant was changed to; " + nameEditRestaurant);
                                    break;
                                case "2":
                                    String locationEdit = JOptionPane.showInputDialog("Wich location want you to put?")
                                            .trim().toLowerCase();
                                    restaurants.setLocation(locationEdit);
                                    JOptionPane.showMessageDialog(null,
                                            "Name of the location was changed to; " + locationEdit);
                                    break;
                                case "3":
                                    String scheludeEdit = JOptionPane.showInputDialog("Wich schelude want you to put?")
                                            .trim().toLowerCase();
                                    restaurants.setSchelude(scheludeEdit);
                                    JOptionPane.showMessageDialog(null,
                                            "Schelude of the restaurant was changed to; " + scheludeEdit);
                                    break;
                                case "4":
                                    int scoreEdit = Integer.parseInt(JOptionPane.showInputDialog(
                                            "Wich score want you to edit? remember just to use values between 0 and 5"));
                                    if (scoreEdit == 0 || scoreEdit == 1 || scoreEdit == 2 || scoreEdit == 3
                                            || scoreEdit == 4 || scoreEdit == 5) {
                                        restaurants.setScore(scoreEdit);
                                        JOptionPane.showMessageDialog(null,
                                                "The score of the restaurant was changed to; " + scoreEdit);
                                    } else {
                                        System.out.println(
                                                "you didnt put the correct score values, restaurant wasnt added.");
                                    }
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "You dind't choose a correct option.", "Error",
                                            JOptionPane.ERROR_MESSAGE);
                                    break;
                            }
                        }

                    }
                    JOptionPane.showMessageDialog(null,
                            "The program couldnt find the restaurant that you was looking for o it doesnt exist",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "*****Data of all restaurants*****\n");

                    Collections.sort(restaurantsObjects, (r1, r2) -> Integer.compare(r2.getScore(), r1.getScore()));
                    JOptionPane.showMessageDialog(null, restaurantsObjects.toString());

                    if (restaurantsObjects.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "You didnt add a restaurant yet", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "4":
                    String opDelete = JOptionPane.showInputDialog("Wich restaurant do you want to erase?").toLowerCase()
                            .trim();
                    System.out.println();
                    for (Restaurant restaurants : restaurantsObjects) {
                        if (opDelete.equals(restaurants.getName())) {
                            restaurantsObjects.remove(restaurants);
                            JOptionPane.showMessageDialog(null, "Restaurant deleted successfully.");
                        }
                    }
                    if (restaurantsObjects.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "The restaurant that you are looking for it doesnt exists");
                    }
                    break;
                case "q":
                    JOptionPane.showMessageDialog(null, "stopping program");
                    stillOn = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "You didnt choose a correct option");
                    break;
            }
        } while (stillOn);
    }
}