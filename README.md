# Konfig
Kofig Abgabe 13.05

1. This project lists drinks form a menu. Given we had a *SimpleDrink.java*, *Drink.java* and *Liquid.java*.
2. The class *SimpleDrink.java* didn't hold a main, so we have to include one.
3. Next, we implement a class for *MixedDrink.java* and *HotBeverage.java*.
4. For testing, if everything is working, we make the *main.java* that includes the list with the drinks.
5. The method *TestMyException.smallEnough()* throws if the drink is too big for a glass.


Code sample from *MixedDrink.java*:\
This is an important piece of code because it gives an example of what the printed menu looks like. Every drink gets called in a for:each loop in the main and this string (slightly altered for *SimpleDrink* and *HotBeverages*) is returned and printed in the console.

**Syntax Highlighting**

```java
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
