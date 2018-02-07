package com.sschudakov.aircraft;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * An interface that represent
 * the aircraft entity of airline.
 * It declares three methods that
 * stand for corresponding properties
 * a aircraft should have: flight range,
 * fuel consumption rate and name
 *
 * @author Semen Chudakov
 */
public abstract class Aircraft {

    protected String name;
    protected int flightRange;
    protected int fuelConsumption;
    protected int passengerCapacity;
    protected int cargoCapacity;

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

    protected Aircraft() {
    }

    public Aircraft(String name, int flightRange, int fuelConsumption, int passengerCapacity, int cargoCapacity) {
        this.name = name;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * This overridden toString() method
     * considers all five field of this class
     * and uses SIMPLE_STYLE as a string style.
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
