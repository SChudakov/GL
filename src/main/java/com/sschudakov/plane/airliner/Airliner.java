package com.sschudakov.plane.airliner;

import com.sschudakov.plane.Plane;

public abstract class Airliner implements Plane {

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
}
