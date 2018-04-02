package io.rybak.hero.human.mag;

import io.rybak.race.impl.AbstractRace;

public class Mag extends AbstractRace {
    private FightAbility[] attackTypes = FightAbility.values();

    public int attack() {
        return randomAttackType(attackTypes).getDamage();
    }

    public Mag() {
        super("Human", "mag");
    }

    private FightAbility randomAttackType(FightAbility[] attackTypes) {
        int index = (int)Math.round( Math.random() * (attackTypes.length - 1) );
        return attackTypes[index];
    }

    @Override
    public AbstractRace createHero() {
        return new Mag();
    }
}
