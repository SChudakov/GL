package com.sschudakov.aircraft.nonengine;

import com.sschudakov.aircraft.Aircraft;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Here is defined an abstract class
 * NonEngineAircraft that represent a specific
 * type of aircraft that has no built-in engine.
 *
 * @author Semen Chudakov
 */
public class NonEngineAircraft extends Aircraft {

    /**
     * The field that stands for the
     * type of draft that puts an non-engine
     * aircraft in motion.
     */
    protected String typeOfDraft;


    /**
     * Getters and setters.
     */
    public String getTypeOfDraft() {
        return typeOfDraft;
    }

    public void setTypeOfDraft(String typeOfDraft) {
        this.typeOfDraft = typeOfDraft;
    }


    /**
     * The non-arg constructor
     */
    protected NonEngineAircraft() {
    }

    /**
     * The constructor that initializes
     * all fields of an non-engine aircraft.
     */
    public NonEngineAircraft(String name, int flightRange, int fuelConsumption,
                             int passengerCapacity, int cargoCapacity,
                             String typeOfDraft) {
        super(name, flightRange, fuelConsumption, passengerCapacity, cargoCapacity);
        this.typeOfDraft = typeOfDraft;
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
                .append("type of draft: " + this.typeOfDraft)
                .build();
    }
}
