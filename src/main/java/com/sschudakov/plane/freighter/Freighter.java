package com.sschudakov.plane.freighter;

import com.sschudakov.plane.Plane;

public abstract class Freighter implements Plane {

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

    public abstract void loadCargo();

    public abstract void unloadCargo();
}
