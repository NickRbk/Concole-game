package io.rybak.hero.human.crossbowman;

import lombok.Getter;

public enum FightAbility {

    ATTACK("attack", 7), SHOOT_CROSSBOW("shoot a crossbow", 11);

    @Getter
    private String name;

    @Getter
    private int damage;

    FightAbility(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
