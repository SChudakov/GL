package com.sschudakov.aircraft.engine.plane;

import com.sschudakov.aircraft.engine.EngineAircraft;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Here is defined a class Plane that
 * represent a usual plane in an
 * airline company.
 *
 * @author Semen Chudakov
 */
public class Plane extends EngineAircraft {

    /**
     * The chassis type of a plane.
     * In general there are three chassis types:
     * "with front wheel", "with back wheel"
     * and "bicycle".
     */
    private String chassisType;


    /**
     * Getters and setters.
     */
    public String getChassisType() {
        return chassisType;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }


    /**
     * The non-arg constructor
     */
    protected Plane() {
    }

    /**
     * The constructor that initializes
     * all fields of a plane object.
     */
    public Plane(String name, int flightRange, int fuelConsumption, int capacity, int carryingCapacity, boolean hoverTakeoff, String engine, String chassisType) {
        super(name, flightRange, fuelConsumption, capacity, carryingCapacity, hoverTakeoff, engine);
        this.chassisType = chassisType;
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
                .append("chassis type: " + this.chassisType + "\n")
                .build();
    }

    /**
     * Here is defined the PlaneBuilder class
     * that applies the Builder pattern to the
     * Plane class.
     *
     * @author Semen Chudakov
     */
    public static class PlaneBuilder {

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
        private String chassisType;


        /**
         * Setters in Builder template.
         */
        public PlaneBuilder setFlightRange(int flightRange) {
            this.flightRange = flightRange;
            return this;
        }

        public PlaneBuilder setFuelConsumption(int fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
            return this;
        }

        public PlaneBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public PlaneBuilder setCargoCapacity(int cargoCapacity) {
            this.cargoCapacity = cargoCapacity;
            return this;
        }

        public PlaneBuilder setHoverTakeoff(boolean hoverTakeoff) {
            this.hoverTakeoff = hoverTakeoff;
            return this;
        }

        public PlaneBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public PlaneBuilder setChassisType(String chassisType) {
            this.chassisType = chassisType;
            return this;
        }


        /**
         * Constructor that initializes the name field.
         *
         * @param name the name of a plane
         */
        public PlaneBuilder(String name) {
            this.name = name;
        }

        /**
         * Method that ends building of a plane.
         *
         * @return built plane
         */
        public Plane build() {
            Plane result = new Plane();
            result.setName(name);
            result.setFlightRange(flightRange);
            result.setFuelConsumption(fuelConsumption);
            result.setPassengerCapacity(passengerCapacity);
            result.setCargoCapacity(cargoCapacity);
            result.setHoverTakeoff(hoverTakeoff);
            result.setEngine(engine);
            result.setChassisType(chassisType);
            return result;
        }
    }
}
