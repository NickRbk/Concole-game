package io.rybak.heroe.elf.mag;

import lombok.Getter;

public enum FightAbility {
    ATTACK_MAGIC("attack with magic", 9), CURE("+ imposition of an improvement", -7);

    @Getter
    private String name;

    @Getter
    private int damage;

    FightAbility(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
