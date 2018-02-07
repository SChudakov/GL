package com.sschudakov.aircraft.engine;

import com.sschudakov.aircraft.Aircraft;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("name: " + this.name)
                .append("flight range: " + this.flightRange)
                .append("fuel consumption: " + this.fuelConsumption)
                .append("passengerCapacity: " + this.passengerCapacity)
                .append("carrying passengerCapacity: " + this.cargoCapacity)
                .append("hover take off: " + this.hoverTakeoff)
                .append("engine: " + this.engine)
                .toString();
    }
}
