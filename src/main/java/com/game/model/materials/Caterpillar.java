package com.game.model.materials;

public class Caterpillar {
    public boolean winner;
    private int health;
    private int experience;
    private int strength ;
    private int level = 1;
    private int maxLevel = 10;
    private int maxExperience = 5;

    private Location currentLocation;
    private boolean hidden;
    private String lastAction;

    private boolean isDead;

    public boolean isDead() {
        return isDead;
    }


    public void checkDeath(){
        if(this.health <= 0){
            this.isDead = true;
        }
    }



    public  Caterpillar(int health, int experience, int strength){
        this.health = health;
        this.experience = experience;
        this.strength = strength;
        this.hidden = false;
        this.lastAction = "";
        this.winner = false;
        this.isDead = false;
    }
    public void setCurrentLocation(Location location){ //we should move this to the bottom
        this.currentLocation = location;
    }
    public Location getCurrentLocation(){
        return this.currentLocation;
    }
    public void eat(Leaf leaf){
        setHealth(getHealth() + 10);
        System.out.println("eat");
        //deleted some of the condition statement
        if( (getExperience() + leaf.getXp()) >= maxExperience ) {
            //taking this portion of code out resets the experience to 0 after level up
            levelUp(); //increases level / ends the stage once appropriate level
            maxExperience += maxExperience; // double experience needed to level up
            setExperience(0); // reset experience to 0 after level up
            }
        //changed the else if
        else {
                setExperience(getExperience() + leaf.getXp() ); // no level-up by experience up
            }

        }

    public void levelUp(){
        setStrength(strength + 50);
        setLevel(level + 1);
        if(getLevel() == 2){
            this.setLastAction("You are level 2! You feel slightly stronger and more healthy.");
        }
        else if(getLevel()== 3) {
            this.setLastAction("You have reached level 3! You are now a butterfly... from now on you can use acid attacks.");
            }
        else if(getLevel()== maxLevel) {
            this.setLastAction("You have reached the max level of "+ maxLevel + "!");
        }

    }

    public void healthRegenerator(int counter){
        if(counter % 2934342 == 0){
            setHealth(getHealth() + 1);
        }
    }
    public int getHealth() {
        return health;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public void setHealth(int health) {
        this.health = Math.max(health, 0);

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

    public void setLastAction(String str){
        this.lastAction = str;
    }
    public String getLastAction(){
        return this.lastAction;
    }


    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
    public int getMaxExperience() {
        return maxExperience;
    }
}
