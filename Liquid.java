/**
 * Class represents a liquid which can be used in
 * drinks
 */
public class Liquid {
    /**
     * name of liquid
     */
    private String name;
    /**
     * volume of liquid (in liter)
     */
    private double volume;

    /**
     * alcoholPercent of liquid (in percent eg. 42)
     */
    private double alcoholPercent;

    /**
     * Creates new liquid with given name, volume and
     * alcoholPercent
     *
     * @param name name of liquid
     * @param volume volume of liquid
     * @param alcoholPercent of liquid
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Getter for name
     *
     * @return name of liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     *
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for volume
     *
     * @return volume of liquid (in liter)
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Setter for volume
     *
     * @param volume new volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Getter for alcoholPercent
     *
     * @return alcoholPercent (e.g. 40)
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }
    /**
     * Setter for alcoholPercent
     *
     * @param alcoholPercent new alcoholPercent
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}