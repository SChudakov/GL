package com.sschudakov.aircraft.engineless.balloon;

import com.sschudakov.aircraft.engineless.EnginelessAircraft;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Balloon extends EnginelessAircraft {

    private int numOfBindings;
    private int freight;

    public int getNumOfBindings() {
        return numOfBindings;
    }

    public void setNumOfBindings(int numOfBindings) {
        this.numOfBindings = numOfBindings;
    }

    public int getFreight() {
        return freight;
    }

    public void setFreight(int freight) {
        this.freight = freight;
    }


    protected Balloon() {
    }

    public Balloon(String name, int flightRange, int fuelConsumption, int passengerCapacity,
                   int cargoCapacity, String typeOfDraft,
                   int numOfBindings, int freight) {
        super(name, flightRange, fuelConsumption, passengerCapacity, cargoCapacity, typeOfDraft);
        this.numOfBindings = numOfBindings;
        this.freight = freight;
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
                .append("num of bindings: " + this.numOfBindings)
                .append("freight: " + this.freight)
                .toString();
    }

    public static class BalloonBuilder {
        private String name;
        private int flightRange;
        private int fuelConsumption;
        private int passengerCapacity;
        private int cargoCapacity;
        private String typeOfDraft;
        private int numOfBindings;
        private int freight;

        public BalloonBuilder(String name) {
            this.name = name;
        }

        public BalloonBuilder setFlightRange(int flightRange) {
            this.flightRange = flightRange;
            return this;
        }

        public BalloonBuilder setFuelConsumption(int fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
            return this;
        }

        public BalloonBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public BalloonBuilder setCargoCapacity(int cargoCapacity) {
            this.cargoCapacity = cargoCapacity;
            return this;
        }

        public BalloonBuilder setTypeOfDraft(String typeOfDraft) {
            this.typeOfDraft = typeOfDraft;
            return this;
        }

        public BalloonBuilder setNumOfBindings(int numOfBindings) {
            this.numOfBindings = numOfBindings;
            return this;
        }

        public BalloonBuilder setFreight(int freight) {
            this.freight = freight;
            return this;
        }

        public Balloon build() {
            Balloon result = new Balloon();
            result.setName(name);
            result.setFlightRange(flightRange);
            result.setFuelConsumption(fuelConsumption);
            result.setPassengerCapacity(passengerCapacity);
            result.setCargoCapacity(cargoCapacity);
            result.setTypeOfDraft(typeOfDraft);
            result.setNumOfBindings(numOfBindings);
            result.setFreight(freight);
            return result;
        }
    }
}
