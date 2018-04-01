package io.rybak.race.impl;

import io.rybak.race.Activity;
import lombok.Getter;
import lombok.Setter;

public abstract class AbstractRace implements Activity {
    @Getter
    private String race;

    @Getter
    private String heroeName;

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

    public AbstractRace(String race, String heroeName) {
        this.race = race;
        this.heroeName = heroeName;
    }
}
