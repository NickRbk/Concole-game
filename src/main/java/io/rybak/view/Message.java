package io.rybak.view;

import io.rybak.race.impl.AbstractRace;
import io.rybak.team.Team;

public class Message implements MagicColors {
    public static void welcomeInfo() {
        System.out.println(CYAN + "Hello player, start game!\nWe choose team members randomly" + RESET);
    }

    public static void cureHimself(AbstractRace enemyPair) {
        System.out.println(String.format("\tHeroe %s of %s race %s cure himself %s, health(%d)",
                enemyPair.getHeroName(), enemyPair.getRace(), PURPLE, RESET, enemyPair.getHealth()));
    }

    public static void enemyDefeated(AbstractRace enemyPair) {
        System.out.println(String.format("\t\t%sDONE%s: Heroe %s of %s race defeated",
                RED, RESET, enemyPair.getHeroName(), enemyPair.getRace()));
    }

    public static void fightInfo(AbstractRace[] enemyPair, String impactDirection) {
        System.out.println(String.format("\t%s (%s) [health(%d)] %s%s%s %s (%s) [health(%d)]",
                enemyPair[0].getHeroName(), enemyPair[0].getRace(), enemyPair[0].getHealth(),
                RED, impactDirection, RESET,
                enemyPair[1].getHeroName(), enemyPair[1].getRace(), enemyPair[1].getHealth()));
    }

    public static void teamsInfo(Team team1, Team team2) {
        System.out.println(team1.toString());
        System.out.println(team2.toString());
    }

    public static void winInfo(Team team, int step) {
        System.out.println(String.format("\n\n%s=====Team of %s win in %d steps=====%s",
                GREEN, team.getName(), step, RESET));
    }
}
