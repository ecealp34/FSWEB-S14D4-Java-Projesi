package com.workintech.model;

public class Bread extends ProductForSale{

    private String flourType;

    public Bread(String type, double price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }

    public String getFlourType() {
        return flourType;
    }

    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("FlourType - " + flourType + "\n");
        System.out.println(result + builder.toString());
    }
}
