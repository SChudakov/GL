package com.sschudakov.aircraft.engine;

import com.sschudakov.aircraft.Aircraft;

public class EngineAircraft extends Aircraft {

    protected boolean hoverTakeoff;
    protected String engine;

    public boolean isHoverTakeoff() {
        return hoverTakeoff;
    }

    public void setHoverTakeoff(boolean hoverTakeoff) {
        this.hoverTakeoff = hoverTakeoff;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public EngineAircraft() {
    }

    public EngineAircraft(String name, int flightRange, int fuelConsumption,
                          int passengerCapacity, int cargoCapacity,
                          boolean hoverTakeoff, String engine) {
        super(name, flightRange, fuelConsumption, passengerCapacity, cargoCapacity);
        this.hoverTakeoff = hoverTakeoff;
        this.engine = engine;
    }
}
