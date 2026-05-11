/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantsystemapp;
import java.util.ArrayList;
import java.util.List;
public class Menu implements MenuComponent {
    private String name;
    private List<MenuComponent>
            components = new ArrayList<>();
    
    public Menu(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public void add(MenuComponent component) {
        components.add(component);
    }
    @Override
    public double getPrice() {
        double total = 0;
        for (MenuComponent item : components) {
            total += item.getPrice();
        }
        return total;
    }
     @Override
     public void display(int indent) {
         System.out.println("\n" + " " .repeat(indent) + ">>>" + name.toUpperCase() + "<<<");
         for (MenuComponent item : components) {
             item.display(indent+1);
         }
     }
}


