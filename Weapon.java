/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PACKAGEMODEL;

/**
 *
 * @author Asus
 */
public class Weapon extends GameEntity {
    private String category;
    private double weight;
    private int damage;

    public Weapon(String name, String category, double weight, int damage) {
        super(name); // Sends 'name' up to GameEntity
        this.category = category;
        this.weight = weight;
        this.damage = damage;
    }

    // Getters and Setters
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }
}