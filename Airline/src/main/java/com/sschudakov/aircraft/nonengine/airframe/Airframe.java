package com.sschudakov.aircraft.nonengine.airframe;

import com.sschudakov.aircraft.nonengine.NonEngineAircraft;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Here is defined a class Airframe
 * that represent an airframe in an
 * airline company.
 *
 * @author Semen Chudakov
 */
public class Airframe extends NonEngineAircraft {

    /**
     * The airframe class.
     * In general there are following airframe classes:
     * "club", "standard", "15-meters", "18-meters",
     * "world class", "superlight" etc.
     */
    private String airframeClass;


    /**
     * Getters and setters.
     */
    public String getAirframeClass() {
        return airframeClass;
    }

    public void setAirframeClass(String airframeClass) {
        this.airframeClass = airframeClass;
    }


    /**
     * The non-arg constructor
     */
    public Airframe() {
    }

    /**
     * The constructor that initializes
     * all fields of an airframe object.
     */
    public Airframe(String name, int flightRange,
                    int fuelConsumption, int passengerCapacity,
                    int cargoCapacity, String typeOfDraft,
                    String airframeClass) {
        super(name, flightRange, fuelConsumption, passengerCapacity, cargoCapacity, typeOfDraft);
        this.airframeClass = airframeClass;
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
                .append("airframe class: " + this.airframeClass + "\n")
                .build();
    }

    /**
     * Here is defined the AirframeBuilder class
     * that applies the Builder pattern to the
     * Airframe class.
     *
     * @author Semen Chudakov
     */
    public static class AirframeBuilder {

        /**
         * Fields to be initialized.
         */
        private String name;
        private int flightRange;
        private int fuelConsumption;
        private int passengerCapacity;
        private int cargoCapacity;
        private String typeOfDraft;
        private String airframeClass;


        /**
         * Setters in Builder template.
         */
        public Airframe.AirframeBuilder setFlightRange(int flightRange) {
            this.flightRange = flightRange;
            return this;
        }

        public Airframe.AirframeBuilder setFuelConsumption(int fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
            return this;
        }

        public Airframe.AirframeBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public Airframe.AirframeBuilder setCargoCapacity(int cargoCapacity) {
            this.cargoCapacity = cargoCapacity;
            return this;
        }

        public Airframe.AirframeBuilder setTypeOfDraft(String typeOfDraft) {
            this.typeOfDraft = typeOfDraft;
            return this;
        }

        public AirframeBuilder setAirframeClass(String airframeClass) {
            this.airframeClass = airframeClass;
            return this;
        }


        /**
         * Constructor that initializes the name field.
         *
         * @param name the name of a airframe
         */
        public AirframeBuilder(String name) {
            this.name = name;
        }


        /**
         * Method that ends building of a airframe.
         *
         * @return built airframe
         */
        public Airframe build() {
            Airframe result = new Airframe();
            result.setName(name);
            result.setFlightRange(flightRange);
            result.setFuelConsumption(fuelConsumption);
            result.setPassengerCapacity(passengerCapacity);
            result.setCargoCapacity(cargoCapacity);
            result.setTypeOfDraft(typeOfDraft);
            result.setAirframeClass(airframeClass);
            return result;
        }
    }

}
