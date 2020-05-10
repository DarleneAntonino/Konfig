/*
Name: MixedDrink
Created: Darlene Antonino
Last changed: 10.05.2020; Darlene Antonino
Description: this class is a subclass from the "Drink" class; it contains more complex drinks, which consist of more
then one liquid; the liquids are named in the List "ingredients"
 */

import java.util.ArrayList;
import java.util.List;

public class MixedDrink extends Drink{

    /**
     * uses multiple liquids
     * shaken, stirred or poured
     * different decorations
     */
    List <Liquid> ingredients = new ArrayList<Liquid>();
    String kind;
    String decoration;


    /**
     * Creates a MixedDrink object
     *
     * @param name name of drink
     * @param ingredients list of liquids
     * @param kind if it is shaken, stirred or poured
     * @param decoration what the drink is served with
     */
    MixedDrink(String name, List<Liquid> ingredients, String kind, String decoration){
        super(name);
        this.ingredients = ingredients;
        this.kind = kind;
        this.decoration = decoration;
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
     * Gives information if drink is alcoholic or not
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
    * Gives a String about the current drink containing information
    *
    * @return String regarding the drinks info
     */
    @Override
    public String toString() {
        String out = "This mixed drink is a \"" + this.getName() + "\" and has the following ingredients:\n";
        for (Liquid l : ingredients) {
            out = out.concat("- " + l.getName() + "\n");
        }
        out = out.concat("The drink is a " + this.kind + "-drink.\nIt is served with a " + this.decoration + ".\nThis is a");
        if(this.isAlcoholic()){
            out = out.concat("n alcoholic mixed drink. It has " + String.format("%.2f", getAlcoholPercent()) + "% alcohol in it.");
        }else{
            out = out.concat(" non-alcoholic mixed drink.");
        }
        return out;
    }
}
