package io.rybak.race.impl;

import io.rybak.race.Activity;
import lombok.Getter;
import lombok.Setter;

public abstract class Elve implements Activity {
    @Getter
    private String race = "People race";

    @Getter @Setter
    private int health = 100;

    @Getter
    private String heroeName;

    public Elve(String heroeName) {
        this.heroeName = heroeName;
    }
}
