package com.sschudakov.aircraft.engineless;

import com.sschudakov.aircraft.Aircraft;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class EnginelessAircraft extends Aircraft {
    protected String typeOfDraft;

    public String getTypeOfDraft() {
        return typeOfDraft;
    }

    public void setTypeOfDraft(String typeOfDraft) {
        this.typeOfDraft = typeOfDraft;
    }

    protected EnginelessAircraft() {
    }

    public EnginelessAircraft(String name, int flightRange, int fuelConsumption,
                              int passengerCapacity, int cargoCapacity,
                              String typeOfDraft) {
        super(name, flightRange, fuelConsumption, passengerCapacity, cargoCapacity);
        this.typeOfDraft = typeOfDraft;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("name: " + this.name)
                .append("flight range: " + this.flightRange)
                .append("fuel consumption: " + this.fuelConsumption)
                .append("passengerCapacity: " + this.passengerCapacity)
                .append("carrying passengerCapacity: " + this.cargoCapacity)
                .append("type of draft: " + this.typeOfDraft)
                .toString();
    }
}
