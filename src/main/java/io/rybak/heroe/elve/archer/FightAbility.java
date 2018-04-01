package io.rybak.heroe.elve.archer;

import lombok.Getter;

public enum FightAbility {
    ATTACK("attack", 8), SHOOT("shoot from the bow", 12);

    @Getter
    private String name;

    @Getter
    private int damage;

    FightAbility(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
