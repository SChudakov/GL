package com.sschudakov.aircraft.engineless.airframe;

import com.sschudakov.aircraft.engineless.EnginelessAircraft;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Airframe extends EnginelessAircraft {
    private String airframeClass; // club, standard, 15-meters, 18-meters, superlight

    public String getAirframeClass() {
        return airframeClass;
    }

    public void setAirframeClass(String airframeClass) {
        this.airframeClass = airframeClass;
    }

    public Airframe() {
    }

    public Airframe(String name, int flightRange,
                    int fuelConsumption, int passengerCapacity,
                    int cargoCapacity, String typeOfDraft,
                    String airframeClass) {
        super(name, flightRange, fuelConsumption, passengerCapacity, cargoCapacity, typeOfDraft);
        this.airframeClass = airframeClass;
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
                .append("airframe class: " + this.airframeClass)
                .toString();
    }


    public static class AirframeBuilder {
        private String name;
        private int flightRange;
        private int fuelConsumption;
        private int passengerCapacity;
        private int cargoCapacity;
        private String typeOfDraft;
        private String airframeClass;

        public AirframeBuilder(String name) {
            this.name = name;
        }

        public Airframe.AirframeBuilder setFlightRange(int flightRange) {
            this.flightRange = flightRange;
            return this;
        }

        public Airframe.AirframeBuilder setFuelConsumption(int fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
            return this;
        }

        public Airframe.AirframeBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public Airframe.AirframeBuilder setCargoCapacity(int cargoCapacity) {
            this.cargoCapacity = cargoCapacity;
            return this;
        }

        public Airframe.AirframeBuilder setTypeOfDraft(String typeOfDraft) {
            this.typeOfDraft = typeOfDraft;
            return this;
        }

        public AirframeBuilder setAirframeClass(String airframeClass) {
            this.airframeClass = airframeClass;
            return this;
        }

        public Airframe build() {
            Airframe result = new Airframe();
            result.setName(name);
            result.setFlightRange(flightRange);
            result.setFuelConsumption(fuelConsumption);
            result.setPassengerCapacity(passengerCapacity);
            result.setCargoCapacity(cargoCapacity);
            result.setTypeOfDraft(typeOfDraft);
            result.setAirframeClass(airframeClass);
            return result;
        }
    }

}
