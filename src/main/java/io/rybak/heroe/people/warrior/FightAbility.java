package io.rybak.heroe.people.warrior;

import lombok.Getter;

public enum FightAbility {
    ATTACK("attack with a sword", 11);

    @Getter
    private String name;

    @Getter
    private int damage;

    FightAbility(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
