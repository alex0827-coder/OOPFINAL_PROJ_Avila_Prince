/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PACKAGEMODEL;

/**
 *
 * @author Asus
 */
public abstract class GameEntity {
    // Protected access modifier allows child classes to look at it directly
    protected String name;

    // Parent Constructor
    public GameEntity(String name) {
        this.name = name;
    }

    // Shared Encapsulation methods
    public String getName() { 
        return name; 
    }
    
    public void setName(String name) {
        this.name = name;
    }
}