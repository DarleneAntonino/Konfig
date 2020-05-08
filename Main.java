/*
Name: Main
Created: Darlene Antonino
Last changed: 08.05.2020; Darlene Antonino
Description: this class contains all the different Liquids and Drinks; here the Drinks get tested if they are valide
it also contains the print menu method
 */


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //all the liquids
        Liquid vodka1 = new Liquid("Eristoff, Vodka", 0.04, 40);
        Liquid spWater = new Liquid("Voeslauer, Sparkling Water", 0.3, 0);
        Liquid redWine1 = new Liquid("Zweigelt, Redwine", 0.125, 13.5);

        //all the simple drinks
        SimpleDrink shotVodka = new SimpleDrink("Vodkashot", vodka1);



        //all the mixed drinks
        List <Liquid> spritzRed = new ArrayList<Liquid>();
        spritzRed.add(redWine1);
        spritzRed.add(spWater);
        MixedDrink spritzerRed = new MixedDrink("Redwine-Spritzer",  spritzRed, "poured",
                "grape on the rim");


        //all the hot beverages


        //the menu
        List<Drink> menu = new ArrayList<Drink>();
        menu.add(shotVodka);
        menu.add(spritzerRed);

        //printing the menu
        System.out.println("This is our menu:\n");
        for (Drink d : menu) {
            System.out.println(d.toString() + "\n");
        }
    }
}

