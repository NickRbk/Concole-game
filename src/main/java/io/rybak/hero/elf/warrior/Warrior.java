package io.rybak.hero.elf.warrior;

import io.rybak.race.impl.AbstractRace;

public class Warrior extends AbstractRace {
    private FightAbility[] attackTypes = FightAbility.values();

    public int attack() {
        return randomAttackType(attackTypes).getDamage();
    }

    public Warrior() {
        super("Elf","warrior");
    }

    private FightAbility randomAttackType(FightAbility[] attackTypes) {
        int index = (int)Math.round( Math.random() * (attackTypes.length - 1) );
        return attackTypes[index];
    }

    @Override
    public AbstractRace createHero() {
        return new Warrior();
    }
}
