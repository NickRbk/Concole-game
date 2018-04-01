package io.rybak.heroe.human.mag;

import lombok.Getter;

public enum FightAbility {

    ATTACK("attack", 7), SHOOT_CROSSBOW("shoot a crossbow", 11),
    ATTACK_MAGIC("attack with magic", 9), CURE("+ imposition of an improvement", -10);

    @Getter
    private String name;

    @Getter
    private int damage;

    FightAbility(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
