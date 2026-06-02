/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PACKAGEMODEL;

/**
 *
 * @author Asus
 */
public class Character {
    private String name;
    private int level;
    private String buildType;
    private int vigor;
    private int mind;

    public Character(String name, int level, String buildType, int vigor, int mind) {
        this.name = name;
        this.level = level;
        this.buildType = buildType;
        this.vigor = vigor;
        this.mind = mind;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
    
    public String getBuildType() { return buildType; }
    public void setBuildType(String buildType) { this.buildType = buildType; }
    
    public int getVigor() { return vigor; }
    public void setVigor(int vigor) { this.vigor = vigor; }
    
    public int getMind() { return mind; }
    public void setMind(int mind) { this.mind = mind; }
}

