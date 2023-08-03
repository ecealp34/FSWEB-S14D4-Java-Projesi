package com.workintech.game;

public interface Bleedable {

    double bleedDamage = 0.25;

    public double bleed();

    default double bleed(int level) {
        return level * bleed();
    }
}
