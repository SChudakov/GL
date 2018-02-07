package com.sschudakov.aircraft.nonengine.balloon;

import com.sschudakov.aircraft.nonengine.NonEngineAircraft;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Here is defined a class Balloon
 * that represent a balloon in an
 * airline company.
 *
 * @author Semen Chudakov
 */
public class Balloon extends NonEngineAircraft {

    /**
     * The number of bindings in a balloon.
     * Balloons are usually tied to the ground
     * so that they cannot simply fly away.
     * There are also free balloons in which
     * this number is 0.
     */
    private int numOfBindings;

    /**
     * The additional freight in kilograms.
     * Balloons are supplied with certain freight
     * which cutting off enables them to ascend under
     * different weather conditions.
     */
    private int freight;


    /**
     * Getters and setters.
     */
    public int getNumOfBindings() {
        return numOfBindings;
    }

    public void setNumOfBindings(int numOfBindings) {
        this.numOfBindings = numOfBindings;
    }

    public int getFreight() {
        return freight;
    }

    public void setFreight(int freight) {
        this.freight = freight;
    }


    /**
     * The non-arg constructor
     */
    protected Balloon() {
    }

    /**
     * The constructor that initializes
     * all fields of an balloon object.
     */
    public Balloon(String name, int flightRange, int fuelConsumption, int passengerCapacity,
                   int cargoCapacity, String typeOfDraft,
                   int numOfBindings, int freight) {
        super(name, flightRange, fuelConsumption, passengerCapacity, cargoCapacity, typeOfDraft);
        this.numOfBindings = numOfBindings;
        this.freight = freight;
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
                .append("type of draft: " + this.typeOfDraft + "\n")
                .append("num of bindings: " + this.numOfBindings + "\n")
                .append("freight: " + this.freight + "\n")
                .build();
    }


    /**
     * Here is defined the BalloonBuilder class
     * that applies the Builder pattern to the
     * Balloon class.
     *
     * @author Semen Chudakov
     */
    public static class BalloonBuilder {

        /**
         * Fields to be initialized.
         */
        private String name;
        private int flightRange;
        private int fuelConsumption;
        private int passengerCapacity;
        private int cargoCapacity;
        private String typeOfDraft;
        private int numOfBindings;
        private int freight;


        /**
         * Setters in Builder template.
         */
        public BalloonBuilder setFlightRange(int flightRange) {
            this.flightRange = flightRange;
            return this;
        }

        public BalloonBuilder setFuelConsumption(int fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
            return this;
        }

        public BalloonBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public BalloonBuilder setCargoCapacity(int cargoCapacity) {
            this.cargoCapacity = cargoCapacity;
            return this;
        }

        public BalloonBuilder setTypeOfDraft(String typeOfDraft) {
            this.typeOfDraft = typeOfDraft;
            return this;
        }

        public BalloonBuilder setNumOfBindings(int numOfBindings) {
            this.numOfBindings = numOfBindings;
            return this;
        }

        public BalloonBuilder setFreight(int freight) {
            this.freight = freight;
            return this;
        }


        /**
         * Constructor that initializes the name field.
         *
         * @param name the name of a balloon
         */
        public BalloonBuilder(String name) {
            this.name = name;
        }


        /**
         * Method that ends building of a balloon.
         *
         * @return built balloon
         */
        public Balloon build() {
            Balloon result = new Balloon();
            result.setName(name);
            result.setFlightRange(flightRange);
            result.setFuelConsumption(fuelConsumption);
            result.setPassengerCapacity(passengerCapacity);
            result.setCargoCapacity(cargoCapacity);
            result.setTypeOfDraft(typeOfDraft);
            result.setNumOfBindings(numOfBindings);
            result.setFreight(freight);
            return result;
        }
    }
}
