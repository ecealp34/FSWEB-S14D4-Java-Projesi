package com.workintech.model;

public class Chocolate extends ProductForSale {

    private boolean hasSugar;
    private int bitterContent;

    public Chocolate(String type, double price, String description, boolean hasSugar, int bitterContent) {
        super(type, price, description);
        this.hasSugar = hasSugar;
        this.bitterContent = bitterContent;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("BitterContent - " + bitterContent + "\n");
        builder.append("HasSugar - " + hasSugar + "\n");
        System.out.println(result + builder.toString());

    }
}
