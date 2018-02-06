package com.sschudakov.aircraft.engine.helicopter;

import com.sschudakov.aircraft.engine.EngineAircraft;


/**
 * Here is defined an abstract class Helicopter
 * that stands for the type of airplanes
 * that can transfer a cargo of big weight.
 * Therefore a field cargoCapacity is added
 * that stands for the maximum weight of cargo
 * a helicopter can transfer
 *
 * @author Semen Chudakov
 */
public class Helicopter extends EngineAircraft {

    private String helicopterRotor;

    public String getHelicopterRotor() {
        return helicopterRotor;
    }

    public void setHelicopterRotor(String helicopterRotor) {
        this.helicopterRotor = helicopterRotor;

    }

    protected Helicopter() {
    }

    public Helicopter(String name, int flightRange, int fuelConsumption,
                      int passengerCapacity, int cargoCapacity, boolean hoverTakeoff,
                      String engine, String helicopterRotor) {
        super(name, flightRange, fuelConsumption, passengerCapacity, cargoCapacity, hoverTakeoff, engine);
        this.helicopterRotor = helicopterRotor;
    }


    public static class HelicopterBuilder {
        private String name;
        private int flightRange;
        private int fuelConsumption;
        private int passengerCapacity;
        private int cargoCapacity;
        private boolean hoverTakeoff;
        private String engine;
        private String helicopterRotor;

        public HelicopterBuilder(String name) {
            this.name = name;
        }

        public Helicopter.HelicopterBuilder setFlightRange(int flightRange) {
            this.flightRange = flightRange;
            return this;
        }

        public Helicopter.HelicopterBuilder setFuelConsumption(int fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
            return this;
        }

        public Helicopter.HelicopterBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public Helicopter.HelicopterBuilder setCargoCapacity(int cargoCapacity) {
            this.cargoCapacity = cargoCapacity;
            return this;
        }

        public Helicopter.HelicopterBuilder setHoverTakeoff(boolean hoverTakeoff) {
            this.hoverTakeoff = hoverTakeoff;
            return this;
        }

        public Helicopter.HelicopterBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Helicopter.HelicopterBuilder setHelicopterRotor(String helicopterRotor) {
            this.helicopterRotor = helicopterRotor;
            return this;
        }

        public Helicopter build() {
            Helicopter result = new Helicopter();
            result.setName(name);
            result.setFlightRange(flightRange);
            result.setFuelConsumption(fuelConsumption);
            result.setPassengerCapacity(passengerCapacity);
            result.setCargoCapacity(cargoCapacity);
            result.setHoverTakeoff(hoverTakeoff);
            result.setEngine(engine);
            result.setHelicopterRotor(helicopterRotor);
            return result;
        }
    }
}
