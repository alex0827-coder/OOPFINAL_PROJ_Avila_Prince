/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PACKAGEMODEL;

/**
 *
 * @author Asus
 */
public class Boss extends GameEntity {
    private String weakness;
    private String notes;

    // Subclass constructor invoking the parent class constructor via super()
    public Boss(String name, String weakness, String notes) {
        super(name); // Sends 'name' up to GameEntity
        this.weakness = weakness;
        this.notes = notes;
    }

    // Getters and Setters for private attributes
    public String getWeakness() { 
        return weakness; 
    }
    
    public void setWeakness(String weakness) { 
        this.weakness = weakness; 
    }

    public String getNotes() { 
        return notes; 
    }
    
    public void setNotes(String notes) { 
        this.notes = notes; 
    }
}