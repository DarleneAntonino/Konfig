/**
 * Abstract base class for concrete drink classes
 */
        public abstract class Drink {
        /**
         * name of the drink
         */
        protected String name;
        /**
         * Creates a Drink object with given name
         *
         * @param name name of the drink
         *
         */
        public Drink(String name) {
        this.name = name;
        }
        /**
         * Calculates and returns volume of drink
         *
         * @return the volume of drink in liter
         */
        public abstract double getVolume();
        /**
         * Calculates and returns the alcohol percentage
         *
         * @return alcohol volume percent (e.g. 50)
         */
        public abstract double getAlcoholPercent();
        /**
         * Gives information if drink is alcoholic or not
         *
         * @return true when alcoholic liquids are present, otherwise false
         */
        public abstract boolean isAlcoholic();
        }
