package io.rybak.race.impl;

import io.rybak.race.Activity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public abstract class People implements Activity {
    @Getter
    private String race = "People race";

    @Getter @Setter
    private int health = 100;

    @Getter
    private String heroeName;

    public People(String heroeName) {
        this.heroeName = heroeName;
    }
}
