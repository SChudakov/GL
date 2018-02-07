package com.sschudakov.aircraft;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Here is defined an abstract class
 * Aircraft that represent an aircraft
 * int an airline company.
 *
 * @author Semen Chudakov
 */
public abstract class Aircraft {

    /**
     * The name of an aircraft.
     */
    protected String name;
    /**
     * The flight range rate of an aircraft.
     */
    protected int flightRange;
    /**
     * The fuel consumption rate of an aircraft.
     */
    protected int fuelConsumption;
    /**
     * The passenger capacity rate of an aircraft.
     */
    protected int passengerCapacity;
    /**
     * The cargo capacity rate of an aircraft.
     */
    protected int cargoCapacity;


    /**
     * Getters amd setters.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * The non-arg constructor
     */
    protected Aircraft() {
    }

    /**
     * The constructor that initializes
     * all fields of an aircraft.
     */
    public Aircraft(String name, int flightRange, int fuelConsumption, int passengerCapacity, int cargoCapacity) {
        this.name = name;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * This overridden toString() method
     * considers all field of this class
     * and uses MULTI_LINE_STYLE as a string style.
     *
     * @see ToStringStyle
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("name: " + this.name)
                .append("flight range: " + this.flightRange)
                .append("fuel consumption: " + this.fuelConsumption)
                .append("passengerCapacity: " + this.passengerCapacity)
                .append("carrying passengerCapacity: " + this.cargoCapacity)
                .toString();
    }
}
