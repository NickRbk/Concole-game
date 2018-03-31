package io.rybak.race;

public interface Activity {
    default boolean isPreference() {
        return Math.round( Math.random() ) == 1;
    }

    int attack();
}
