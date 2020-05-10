/*
Name: Main
Created: Darlene Antonino
Last changed: 10.05.2020; Viola Schlocker
Description: this class contains all the different Liquids and Drinks; here the Drinks get tested if they are valide
 */


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //all the liquids
        Liquid vodka1 = new Liquid("Eristoff, Vodka", 0.04, 40);
        Liquid spWater1 = new Liquid("Voeslauer, Sparkling Water", 0.3, 0);
        Liquid redWine1 = new Liquid("Zweigelt, Redwine", 0.125, 13.5);
        Liquid juiceApple = new Liquid("Applejuice", 0.1, 0);
        Liquid juiceOrange = new Liquid("Orangejuice", 0.2, 0);
        Liquid syrupGrenadine = new Liquid("Grenadine syrup", 0.01, 0);
        Liquid tequila1 = new Liquid("Sierra, Tequila", 0.04, 38);
        Liquid vermouth1 = new Liquid("Martini Extra Dry, Vermouth", 0.015, 18);
        Liquid gin1 = new Liquid("Beefeater London Dry, Gin", 0.09, 40);
        Liquid vermouth2 = new Liquid("Martini Fiero, Vermouth", 0.015, 14.9);
        Liquid spWater2 = new Liquid("Saskia, Sparkling Water", 1, 0);
        Liquid hotWater = new Liquid("Voeslauer, Still", 0.5, 0);
        Liquid coffee = new Liquid("Kaffee Partner, Bio Crema", 0.030, 0);
        Liquid milk1 = new Liquid("Stainzer, Vollmilch", 0.1, 0);
        Liquid milk2 = new Liquid("Stainzer, Vollmilch", 0.25, 0);
        Liquid cocoa = new Liquid("Rapunzel, Bio Kakao", 0.010, 0);
        Liquid whiskey = new Liquid("Tullamore Dew, Irish Whiskey", 0.010, 40);

        //all the simple drinks
        SimpleDrink shotVodka = new SimpleDrink("Vodkashot", vodka1);
        SimpleDrink orange = new SimpleDrink("Orangejuice", juiceOrange);
        SimpleDrink apple = new SimpleDrink("Applejuice", juiceApple);
        SimpleDrink shotTequila = new SimpleDrink("Tequilashot", tequila1);
        SimpleDrink sparklingWater = new SimpleDrink("Sparklingwater, Voeslauer", spWater1);
        SimpleDrink redW = new SimpleDrink("Redwine", redWine1);
        SimpleDrink sparkWater2 = new SimpleDrink("Sparklingwater, Saskia", spWater2);
        SimpleDrink shotWhiskey = new SimpleDrink("Irish Whiskey, Tullamore Dew", whiskey);
        SimpleDrink hotWater = new SimpleDrink("Still, Voeslauer", hotWater);
        SimpleDrink espresso = new SimpleDrink("Espresso", coffee);  
        
        //all the mixed drinks
        //red Spritzer
        List<Liquid> spritzRed = new ArrayList<Liquid>();
        spritzRed.add(redWine1);
        spritzRed.add(spWater1);
        MixedDrink spritzerRed = new MixedDrink("Redwine-Spritzer", spritzRed, "poured",
                "grape on the rim");

        //Tequila Sunrise
        List<Liquid> tSunrise = new ArrayList<Liquid>();
        tSunrise.add(juiceOrange);
        tSunrise.add(syrupGrenadine);
        tSunrise.add(tequila1);
        MixedDrink tequilaSunrise = new MixedDrink("Tequila Sunrise", tSunrise, "poured",
                "slice of orange");

        //Martini
        List<Liquid> martin = new ArrayList<Liquid>();
        martin.add(vermouth1);
        martin.add(gin1);
        MixedDrink martini = new MixedDrink("Martini", martin, "stirred",
                "lemon twist and an olive");

        //Bronx Cocktail
        List<Liquid> bronxC = new ArrayList<Liquid>();
        bronxC.add(gin1);
        bronxC.add(vermouth1);
        bronxC.add(vermouth2);
        bronxC.add(juiceOrange);
        MixedDrink bronxCocktail = new MixedDrink("Bronx Cocktial", bronxC, "shaken",
                "cocktail umbrella and an orange twist");

        //all the hot beverages
        //Hot Chocolate
        List<Liquid> hotChocolate = new ArrayList<Liquid>();
        hotChocolate.add(milk2);
        hotChocolate.add(cocoa);
        HotBeverage hotChocolate = new HotBeverage("Hot Chocolate", hotChocolate);
        
        //Cappuccino
        List<Liquid> cappu = new ArrayList<Liquid>();
        cappu.add(milk1);
        cappu.add(coffee);
        HotBeverage cappuccino = new HotBeverage("Cappuccino", cappu);
        
        //Latte Macchiatto
        List<Liquid> latteMacch = new ArrayList<Liquid>();
        latteMacch.add(milk2);
        latteMacch.add(coffee);
        HotBeverage latteMachiatto = new HotBeverage("Latte Macchiatto", latteMacch);
        
        
        
        //Irish Coffee
        List<Liquid> irishC = new ArrayList<Liquid>();
        irishC.add(milk2);
        irishC.add(coffee);
        irishC.add(whiskey);
        HotBeverage irishCoffee = new HotBeverage("Irish Coffee", irishC);
        
        //Long Black
        List<Liquid> longB = new ArrayList<Liquid>();
        longB.add(hotWater);
        longB.add(coffee);
        longB.add(coffee);
        HotBeverage longBlack = new HotBeverage("Long Black", longB);
        
        //Mochaccino
        List<Liquid> mocha = new ArrayList<Liquid>();
        mocha.add(milk2);
        mocha.add(coffee);
        mocha.add(cocoa);
        HotBeverage mochaccino = new HotBeverage("Mochaccino", mocha);
        
        //the menu
        List<Drink> menu = new ArrayList<Drink>();
        //simple
        menu.add(shotVodka);
        menu.add(shotTequila);
        menu.add(redW);
        menu.add(sparklingWater);
        menu.add(apple);
        menu.add(orange);
        menu.add(sparkWater2);

        //mixed
        menu.add(spritzerRed);
        menu.add(tequilaSunrise);
        menu.add(martini);
        menu.add(bronxCocktail);

        //hot
        menu.add(hotChocolate);
        menu.add(espresso);
        menu.add(latteMacchiatto);
        menu.add(cappuccino);
        menu.add(irishCoffee);
        menu.add(longBlack);
        menu.add(mochaccino);
        
        //printing the menu
        System.out.println("This is our menu:\n");
        for (Drink d : menu) {
            System.out.println(d.toString() + "\n");
        }
        /*
        List <Drink> wronglyFilled = new ArrayList<Drink>();
        wronglyFilled = isSmallEnough(menu);
        if (wronglyFilled.size() != 0){
            System.out.println("The following drinks are filled wrongly! Please contact the manager!");
            for(Drink drinkWrong : wronglyFilled){
                System.out.println(drinkWrong.getName());
            }
        }
          */

        //testing the drinks for size
        List<Drink> wrong = new ArrayList<Drink>();
        boolean thrown = false;
        for (Drink d : menu) {
            try {
                TestMyException.smallEnough(d.getVolume());
            } catch (Exception m) {
                thrown = TestMyException.gotThrown();
                wrong.add(d);
            }
        }
        if (thrown) {
            System.out.println("The following drinks are filled wrongly! Please contact the manager!");
            for (Drink drinkWrong : wrong) {
                System.out.println(drinkWrong.getName());
            }


        }
    }

    /*
    //this method checks, if all the drinks fit in the glasses; the biggest glass is 0.75l big
    public static List <Drink> isSmallEnough(List<Drink> list){
        List <Drink> wrong = new ArrayList<Drink>();
        for(Drink d : list){
            if(d.getVolume() > 0.75){
               wrong.add(d);
            }
        }
        return wrong;
    }
*/
}



