package com.sschudakov.aircraft.engine;

import com.sschudakov.aircraft.Aircraft;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Here is defined an abstract class
 * EngineAircraft that represent a specific
 * type of aircraft that has a built-in engine.
 *
 * @author Semen Chudakov
 */
public class EngineAircraft extends Aircraft {

    /**
     * The field that stands for the
     * ability of an engine aircraft
     * to take off from a steady position.
     */
    protected boolean hoverTakeoff;
    /**
     * The engine of an engine aircraft.
     */
    protected String engine;


    /**
     * Getters and setters.
     */
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


    /**
     * The non-arg constructor
     */
    protected EngineAircraft() {
    }

    /**
     * The constructor that initializes
     * all fields of an engine aircraft.
     */
    public EngineAircraft(String name, int flightRange, int fuelConsumption,
                          int passengerCapacity, int cargoCapacity,
                          boolean hoverTakeoff, String engine) {
        super(name, flightRange, fuelConsumption, passengerCapacity, cargoCapacity);
        this.hoverTakeoff = hoverTakeoff;
        this.engine = engine;
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
                .append("hover take off: " + this.hoverTakeoff)
                .append("engine: " + this.engine)
                .build();
    }
}
