package io.rybak.race.impl;

import io.rybak.race.Activity;
import lombok.Getter;

public abstract class AbstractRace implements Activity {
    @Getter
    private String race;

    @Getter
    private String heroName;

    @Getter
    private int health = 100;

    // health should not be more 100 or less 0
    public void setHealth(int health) {
        if(health > 100 || health < 0) {
            this.health = health > 100 ? 100 : 0;
        } else {
            this.health = health;
        }
    }

    public AbstractRace(String race, String heroName) {
        this.race = race;
        this.heroName = heroName;
    }

    /*This method needed for below case
       We store our heroes in array on Team class
       then we have access to this array and invoke
       this method to create new hero */
    public abstract AbstractRace createHero();
}
