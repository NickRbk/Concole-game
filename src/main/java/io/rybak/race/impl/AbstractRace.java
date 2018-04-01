package io.rybak.race.impl;

import io.rybak.race.Activity;
import lombok.Getter;
import lombok.Setter;

public abstract class AbstractRace implements Activity {
    @Getter
    private String race;

    @Getter
    private String heroeName;

    @Getter @Setter
    private int health = 100;

    public AbstractRace(String race, String heroeName) {
        this.race = race;
        this.heroeName = heroeName;
    }
}
