package com.game.model.materials;

public class Caterpillar {
    private int health;
    private int experience;
    private int strength;
    private int maxHealth;
    private int level = 1;
    private int maxLevel;
    private int maxExperience;
    private boolean isButterfly;
    private Location currentLocation;
    private boolean hidden;
    public  Caterpillar(int health, int experience, int strength){
        this.health = health;
        this.health = maxHealth;
        this.experience = experience;
        this.strength = strength;
        this.hidden = false;
    }
    public void setCurrentLocation(Location location){
        this.currentLocation = location;
    }
    public Location getCurrentLocation(){
        return this.currentLocation;
    }
    public void eat(Leaf leaf){
        if(!leaf.equals(null)){
            setExperience(leaf.getXp());
            setHealth(maxHealth);
        }
    }
    public void levelUp(){
        if(experience == maxExperience - 1) {
            setExperience(0);
            setStrength(strength + 1);
            setLevel(level + 1);
        }
    }
//
//    public void fightGetHit( Enemy enemy){
//        int strengthAdvantage = 0;
//        if(enemy.getStrength() > getStrength()){
//            strengthAdvantage = 1;
//            setHealth(health - enemy.getStrength() - strengthAdvantage);
//        }
//        else{
//            setHealth(health - enemy.getStrength());
//        };
//    }
//
//    public void fightHitBack( Enemy enemy){
//        int strengthAdvantage = 0;
//        if(enemy.getStrength() < getStrength()){
//            strengthAdvantage = 1;
//            enemy.setHealth(enemy.getHealth() - strength - strengthAdvantage);
//        }
//        else{
//            enemy.setHealth(enemy.getHealth() - strength);
//        }
//    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
