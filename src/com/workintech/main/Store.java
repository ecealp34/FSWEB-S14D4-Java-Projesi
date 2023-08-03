package com.workintech.main;

import com.workintech.game.Monster;
import com.workintech.game.Troll;
import com.workintech.game.Werewolf;
import com.workintech.model.Bread;
import com.workintech.model.Chocolate;
import com.workintech.model.Coke;
import com.workintech.model.ProductForSale;


public class Store {
    public static void main(String[] args) {
        System.out.println("Products******");
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Bread("X", 10, "Y", "Oat");
        products[1] = new Chocolate("Y", 10, "Z", true, 50);
        products[2] = new Coke("X", 6, "Z", true);
        listProducts(products);
        System.out.println("Monster******");
        Monster troll = new Troll("X", 100, 20);
        System.out.println("Attack = " + troll.attack());
        Monster wereWolf = new Werewolf("Y", 250, 30);
        System.out.println("Poison = " + wereWolf.poison());

    }

    public static void listProducts(ProductForSale[] products) {
       if(products != null) {
           for (ProductForSale product : products) {
               if(product != null) {
                   product.showDetails();
               }
           }
       }
    }
}