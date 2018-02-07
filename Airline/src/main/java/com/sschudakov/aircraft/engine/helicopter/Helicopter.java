package com.sschudakov.aircraft.engine.helicopter;

import com.sschudakov.aircraft.engine.EngineAircraft;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Here is defined an abstract class Helicopter
 * that stands for the type of airplanes
 * that can transfer a cargo of big weight.
 * Therefore a field cargoCapacity is added
 * that stands for the maximum weight of cargo
 * a helicopter can transfer
 *
 * @author Semen Chudakov
 */
public class Helicopter extends EngineAircraft {

    /**
     * The name of a helicopter rotor.
     */
    private String helicopterRotor;


    /**
     * Getters and setters.
     */
    public String getHelicopterRotor() {
        return helicopterRotor;
    }

    public void setHelicopterRotor(String helicopterRotor) {
        this.helicopterRotor = helicopterRotor;

    }


    /**
     * The non-arg constructor
     */
    protected Helicopter() {
    }

    /**
     * The constructor that initializes
     * all fields of a helicopter object.
     */
    public Helicopter(String name, int flightRange, int fuelConsumption,
                      int passengerCapacity, int cargoCapacity, boolean hoverTakeoff,
                      String engine, String helicopterRotor) {
        super(name, flightRange, fuelConsumption, passengerCapacity, cargoCapacity, hoverTakeoff, engine);
        this.helicopterRotor = helicopterRotor;
    }


    /**
     * This overridden toString() method
     * considers all field of this class
     * and uses SIMPLE_STYLE as a string style.
     *
     * @see ToStringStyle
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE)
                .append("name: " + this.name + "\n")
                .append("flight range: " + this.flightRange + "\n")
                .append("fuel consumption: " + this.fuelConsumption + "\n")
                .append("passengerCapacity: " + this.passengerCapacity + "\n")
                .append("carrying passengerCapacity: " + this.cargoCapacity + "\n")
                .append("hover take off: " + this.hoverTakeoff + "\n")
                .append("engine: " + this.engine + "\n")
                .append("helicopter rotor: " + this.helicopterRotor + "\n")
                .build();
    }

    /**
     * Here is defined the HelicopterBuilder class
     * that applies the Builder pattern to the
     * Helicopter class.
     *
     * @author Semen Chudakov
     */
    public static class HelicopterBuilder {

        /**
         * Fields to be initialized.
         */
        private String name;
        private int flightRange;
        private int fuelConsumption;
        private int passengerCapacity;
        private int cargoCapacity;
        private boolean hoverTakeoff;
        private String engine;
        private String helicopterRotor;


        /**
         * Setters in Builder template.
         */
        public Helicopter.HelicopterBuilder setFlightRange(int flightRange) {
            this.flightRange = flightRange;
            return this;
        }

        public Helicopter.HelicopterBuilder setFuelConsumption(int fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
            return this;
        }

        public Helicopter.HelicopterBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public Helicopter.HelicopterBuilder setCargoCapacity(int cargoCapacity) {
            this.cargoCapacity = cargoCapacity;
            return this;
        }

        public Helicopter.HelicopterBuilder setHoverTakeoff(boolean hoverTakeoff) {
            this.hoverTakeoff = hoverTakeoff;
            return this;
        }

        public Helicopter.HelicopterBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Helicopter.HelicopterBuilder setHelicopterRotor(String helicopterRotor) {
            this.helicopterRotor = helicopterRotor;
            return this;
        }


        /**
         * Constructor that initializes the name field.
         *
         * @param name the name of a helicopter
         */
        public HelicopterBuilder(String name) {
            this.name = name;
        }


        /**
         * Method that ends building of a helicopter.
         *
         * @return built helicopter
         */
        public Helicopter build() {
            Helicopter result = new Helicopter();
            result.setName(name);
            result.setFlightRange(flightRange);
            result.setFuelConsumption(fuelConsumption);
            result.setPassengerCapacity(passengerCapacity);
            result.setCargoCapacity(cargoCapacity);
            result.setHoverTakeoff(hoverTakeoff);
            result.setEngine(engine);
            result.setHelicopterRotor(helicopterRotor);
            return result;
        }
    }
}
