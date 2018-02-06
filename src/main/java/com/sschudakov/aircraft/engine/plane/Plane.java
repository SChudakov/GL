package com.sschudakov.aircraft.engine.plane;

import com.sschudakov.aircraft.engine.EngineAircraft;


/**
 * Here is defined an abstract class Helicopter
 * that stands for the type of airplanes
 * that deal with passengers transfers.
 * Therefore a field passengerCapacity is added
 * that stands for the maximum amount of
 * people an plane can transfer. Also getter
 * getPassengerCapacity() is added amd method toString()
 * is overridden.
 *
 * @author Semen Chudakov
 */
public class Plane extends EngineAircraft {

    private String chassisType;

    public String getChassisType() {
        return chassisType;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    protected Plane() {
    }

    public Plane(String name, int flightRange, int fuelConsumption, int capacity, int carryingCapacity, boolean hoverTakeoff, String engine, String chassisType) {
        super(name, flightRange, fuelConsumption, capacity, carryingCapacity, hoverTakeoff, engine);
        this.chassisType = chassisType;
    }

    public static class PlaneBuilder {
        private String name;
        private int flightRange;
        private int fuelConsumption;
        private int passengerCapacity;
        private int cargoCapacity;
        private boolean hoverTakeoff;
        private String engine;
        private String chassisType;

        public PlaneBuilder(String name) {
            this.name = name;
        }

        public PlaneBuilder setFlightRange(int flightRange) {
            this.flightRange = flightRange;
            return this;
        }

        public PlaneBuilder setFuelConsumption(int fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
            return this;
        }

        public PlaneBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public PlaneBuilder setCargoCapacity(int cargoCapacity) {
            this.cargoCapacity = cargoCapacity;
            return this;
        }

        public PlaneBuilder setHoverTakeoff(boolean hoverTakeoff) {
            this.hoverTakeoff = hoverTakeoff;
            return this;
        }

        public PlaneBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public PlaneBuilder setChassisType(String chassisType) {
            this.chassisType = chassisType;
            return this;
        }

        public Plane build() {
            Plane result = new Plane();
            result.setName(name);
            result.setFlightRange(flightRange);
            result.setFuelConsumption(fuelConsumption);
            result.setPassengerCapacity(passengerCapacity);
            result.setCargoCapacity(cargoCapacity);
            result.setHoverTakeoff(hoverTakeoff);
            result.setEngine(engine);
            result.setChassisType(chassisType);
            return result;
        }
    }
}
