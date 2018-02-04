package com.sschudakov.plane.airliner;

import com.sschudakov.plane.Plane;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public abstract class Airliner implements Plane {

    protected String name;

    protected int flightRange;
    protected double fuelConsumption;
    protected int capacity;


    @Override
    public int getFlightRange() {
        return this.flightRange;
    }

    @Override
    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public int getCapacity() {
        return this.capacity;
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
                .append(this.capacity)
                .toString();
    }
}
