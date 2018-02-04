package com.sschudakov.plane.freighter;

import com.sschudakov.plane.Plane;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public abstract class Freighter implements Plane {

    protected String name;

    protected int flightRange;
    protected int fuelConsumption;
    protected double carryingCapacity;

    @Override
    public int getFlightRange() {
        return this.flightRange;
    }

    @Override
    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public double getCarryingCapacity() {
        return this.carryingCapacity;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE)
                .append(this.name)
                .append(this.flightRange)
                .append(this.fuelConsumption)
                .append(this.carryingCapacity)
                .toString();
    }
}
