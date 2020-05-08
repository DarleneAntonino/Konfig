/*
Name: MixedDrink
Created: Darlene Antonino
Last changed: 08.05.2020; Darlene Antonino
Description: this class is a subclass from the "Drink" class; it contains more complex drinks, which consist of more
then one liquid; the liquids are named in the List "ingredients"
 */

import java.util.ArrayList;
import java.util.List;

public class MixedDrink extends Drink{

    //attributes
    List <Liquid> ingredients = new ArrayList<Liquid>();
    String kind;
    String decoration;


//constructor
    MixedDrink(String name, List<Liquid> ingredients, String kind, String decoration){
        super(name);
        this.ingredients = ingredients;
        this.kind = kind;
        this.decoration = decoration;
    }

    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid l : ingredients) {
           volume += l.getVolume();
        }
        return volume;
    }

    /*with the help of the following website
    (https://www.breath-tester.com/was-bedeutet-volumenprozent-auf-flaschenetiketten/) we calculated the mg of alcohol
    in the mixed drink; we further calculate the percentage
    */
    @Override
    public double getAlcoholPercent() {
        int alc = 0;
        for (Liquid l : ingredients) {
            alc += l.getVolume() * l.getAlcoholPercent() / 100 * 0.8;
        }
        return alc / this.getVolume() * 100;
    }

    @Override
    public boolean isAlcoholic() {
        for (Liquid l : ingredients) {
            if (l.getAlcoholPercent() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String out = "This mixed drink is a " + this.getName() + " and has the following ingredients:\n";
        for (Liquid l : ingredients) {
            out = out.concat("- " + l.getName() + "\n");
        }
        out = out.concat("The drink is a " + this.kind + "-drink.\nIt is served with a " + this.decoration + ".");
        return out;
    }
}
