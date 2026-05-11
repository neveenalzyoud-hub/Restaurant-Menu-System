/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurantsystemapp;
public class RestaurantSystemApp {
    public static void main(String[] args) {
         MenuItem burger = new MenuItem("Zinger Burger" , 3.0);
         MenuItem pizza = new MenuItem("Pizza Margherita" , 5.0);
         
         Menu meal = new Menu("Family Meal");
         meal.add(burger);
         meal.add(new MenuItem("Large Fries" , 1.5));
         meal.add(new MenuItem("Coke" , 1.0));
         
         Menu mainMenu = new Menu("Main Menu");
         mainMenu.add(pizza);
         mainMenu.add(meal);
         
         mainMenu.display(0);
         System.out.println("\nGrand Total: " + mainMenu.getPrice() + "JOD");
    }
    
}
