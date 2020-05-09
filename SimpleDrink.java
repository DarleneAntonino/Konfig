/**
 * Class represents a simple drink liquid which can be used in
 * drinks
 */
public class SimpleDrink extends Drink{
    /**
     * uses only one liquid
     */
    protected Liquid l;
    /**
     * Creates a SimpleDrink object with given age and
     * liquid
     *
     * @param name name of drink
     * @param l only liquid in drink
     */
    SimpleDrink(String name, Liquid l){
        super(name);
        this.l = l;
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }
    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String out = "This simple drink is a \"" + this.getName() + "\" and has the following ingredient:\n" +
                this.l.getName() + ".\nThis is a";
        if(this.isAlcoholic()){
            out = out.concat("n alcoholic simple drink. It has " + String.format("%.2f", getAlcoholPercent()) + "% alcohol in it.");
        }else{
            out = out.concat(" non-alcoholic simple drink.");
        }
        return out;
    }

}
