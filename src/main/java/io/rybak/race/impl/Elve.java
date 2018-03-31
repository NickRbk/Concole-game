package io.rybak.race.impl;

import io.rybak.race.Activity;
import lombok.Getter;
import lombok.Setter;

public abstract class Elve implements Activity {
    @Getter @Setter
    private int health = 100;
}
