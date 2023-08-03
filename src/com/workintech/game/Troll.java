package com.workintech.game;

public class Troll extends Monster{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }

    @Override
    public double poison() {
        return getDamage()*0.3;
    }
}
