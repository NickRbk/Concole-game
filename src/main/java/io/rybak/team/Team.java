package io.rybak.team;

import io.rybak.heroe.elve.archer.Archer;
import io.rybak.heroe.human.mag.Mag;
import io.rybak.heroe.human.warrior.Warrior;
import io.rybak.race.impl.AbstractRace;
import lombok.Getter;
import lombok.NonNull;

public class Team {
    @Getter
    AbstractRace[] heroes;

    // Predefine arrays of heroes for each race
    private AbstractRace[] humanHeroes = {
            new Mag(),
            new Warrior()
    };

    private AbstractRace[] elveHeroes = {
            new Archer(),
            new io.rybak.heroe.elve.mag.Mag(),
            new io.rybak.heroe.elve.warrior.Warrior()
    };

    // Create custom constructor to create Team
    public Team(String race, int teamMembers) {
        this.heroes = createTeam(race, teamMembers);
    }

    private AbstractRace[] createTeam(String race, int teamMembers) {
        AbstractRace[] selectedHeroes = new AbstractRace[teamMembers];
        AbstractRace[] allHeroes = findRaceHeroes(race);

        for(int i = 0; i < teamMembers;) {
            int index = (int)Math.round( Math.random() * (allHeroes.length - 1) );

            selectedHeroes[i] = allHeroes[index];
            i++;
        }

        return selectedHeroes;
    }

    private AbstractRace[] findRaceHeroes(@NonNull String race) {
        if(race.equals("Elve")) {
            return this.elveHeroes;
        }
        return this.humanHeroes;
    }
}
