
/*
Name: HotBeverage
Creator: Viola Schlocker
Last changed: 10.05.2020; Viola Schlocker
Description: this class is a subclass from the "Drink" class; it contains hot beverage drinks, which some of them consist of more
then one liquid; the liquids are named in the List "ingredients"
 */

import java.util.ArrayList;
import java.util.List;

public class HotBeverage extends Drink{

    /**
     * uses multiple liquids
     */
    List <Liquid> ingredients = new ArrayList<Liquid>();
   


   /**
     * Creates a HotBeverage object
     *
     * @param name name of drink
     * @param ingredients list of liquids
     */
    HotBeverage(String name, List<Liquid> ingredients){
        super(name);
        this.ingredients = ingredients;
    }

    /**
     * Returns volume of liquids in the list combined
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid l : ingredients) {
            volume += l.getVolume();
        }
        return volume;
    }

    /**
     * with the help of the following website
     * (https://www.breath-tester.com/was-bedeutet-volumenprozent-auf-flaschenetiketten/) we calculated the mg of alcohol
     * in the mixed drink; we further calculate the percentage
     *
     * @return the percentage of alcohol in a drink
    */
    @Override
    public double getAlcoholPercent() {
        double alc = 0;
        for (Liquid l : ingredients) {
            alc += l.getVolume() * l.getAlcoholPercent() / 100 * 0.8;
        }
        return alc / this.getVolume() * 100;
    }

    /**
     * Gives information if hot beverage is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        for (Liquid l : ingredients) {
            if (l.getAlcoholPercent() > 0) {
                return true;
            }
        }
        return false;
    }
    
    /**
    * Gives a String about the current beverage containing information
    *
    * @return String regarding the beverages info
     */
    @Override
    public String toString() {
        String out = ("This hot beverage is a " + this.getName() + "and has the following ingredients: \n");
        for (Liquid l : ingredients) {
            out = out.concat("- " + l.getName() + "\n");
        }
        out = out.concat("This is a");
        if(this.isAlcoholic()){
            out = out.concat("n alcoholic hot beverage. It has " + String.format("%.2f", getAlcoholPercent()) + "% alcohol in it.");
        }else{
            out = out.concat(" non-alcoholic hot beverage.");
        }
        return out;
    }
}
