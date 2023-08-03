package com.workintech.model;

public class Coke extends ProductForSale{

    private boolean hasSugar;
    public Coke(String type, double price, String description, boolean hasSugar) {
        super(type, price, description);
        this.hasSugar = hasSugar;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }

    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("HasSugar - " + hasSugar + "\n");
        System.out.println(result + builder.toString());
    }
}
