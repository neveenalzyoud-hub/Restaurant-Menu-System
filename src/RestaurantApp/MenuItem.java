/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantsystemapp;
    public class MenuItem implements MenuComponent {
    private String name;
    private double price;

    public MenuItem( String name , double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public void display(int indent) {
        System.out.println(" ".repeat(indent) + ". " + name + ":" + price + " JOD");
    }
}


