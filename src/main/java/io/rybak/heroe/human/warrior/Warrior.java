package io.rybak.heroe.human.warrior;

import io.rybak.race.impl.AbstractRace;

public class Warrior extends AbstractRace {
    private FightAbility[] attackTypes = FightAbility.values();

    public int attack() {
        return randomAttackType(attackTypes).getDamage();
    }

    public Warrior() {
        super("Human", "warrior");
    }

    private FightAbility randomAttackType(FightAbility[] attackTypes) {
        int index = (int)Math.round( Math.random() * (attackTypes.length - 1) );
        return attackTypes[index];
    }
}
