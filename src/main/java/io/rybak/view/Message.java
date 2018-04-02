package io.rybak.view;

import io.rybak.race.impl.AbstractRace;
import io.rybak.team.Team;

public class Message {
    public static void cureHimself(AbstractRace enemyPair) {
        System.out.println(String.format("\tHeroe %s of %s race cure himself, health(%d)",
                enemyPair.getHeroName(), enemyPair.getRace(), enemyPair.getHealth()));
    }

    public static void enemyDefeated(AbstractRace enemyPair) {
        System.out.println(String.format("\t\tDONE: Heroe %s of %s race defeated",
                enemyPair.getHeroName(), enemyPair.getRace()));
    }

    public static void fightInfo(AbstractRace[] enemyPair, String impactDirection) {
        System.out.println(String.format("\t%s (%s) [health(%d)] %s %s (%s) [health(%d)]",
                enemyPair[0].getHeroName(), enemyPair[0].getRace(), enemyPair[0].getHealth(),
                impactDirection,
                enemyPair[1].getHeroName(), enemyPair[1].getRace(), enemyPair[1].getHealth()));
    }

    public static void teamsInfo(Team team1, Team team2) {
        System.out.println(team1.toString());
        System.out.println(team2.toString());
    }

    public static void winInfo(Team team, int step) {
        System.out.println(String.format("\n\n=====Team of %s win in %d steps=====", team.getName(), step));
    }
}
