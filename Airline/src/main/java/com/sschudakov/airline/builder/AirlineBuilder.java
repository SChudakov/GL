package com.sschudakov.airline.builder;


import com.sschudakov.aircraft.engine.helicopter.Helicopter;
import com.sschudakov.aircraft.engine.plane.Plane;
import com.sschudakov.airline.Airline;

/**
 * Here is defined AirlineBuilder class
 * that applies Builder pattern to Airline
 * class.
 *
 * @author Semen Chudakov
 */
public class AirlineBuilder {

    private static final String BOEING777_NAME = "Boeing 777";
    private static final int BOEING777_FLIGHT_RANGE = 17_500;
    private static final int BOEING777_FUEL_CONSUMPTION = 6080;
    private static final int BOEING777_PASSENGERS_CAPACITY = 550;
    private static final int BOEING777_CARGO_CAPACITY = 60_000;
    private static final boolean BOEING777_HOVER_TAKEOFF = false;
    private static final String BOEING777_ENGINE = "Rolls-Royce Trent 800";

    private static final String BOEING767_NAME = "Boeing 767";
    private static final int BOEING767_FLIGHT_RANGE = 10_000;
    private static final int BOEING767_FUEL_CONSUMPTION = 4800;
    private static final int BOEING767_PASSENGERS_CAPACITY = 375;
    private static final int BOEING767_CARGO_CAPACITY = 42_000;
    private static final boolean BOEING767_HOVER_TAKEOFF = false;
    private static final String BOEING767_ENGINE = "General Electric GE90";

    private static final String BOEING737_NAME = "Boeing 737";
    private static final int BOEING737_FLIGHT_RANGE = 5_000;
    private static final int BOEING737_FUEL_CONSUMPTION = 2400;
    private static final int BOEING737_PASSENGERS_CAPACITY = 200;
    private static final int BOEING737_CARGO_CAPACITY = 20_000;
    private static final boolean BOEING737_HOVER_TAKEOFF = false;
    private static final String BOEING737_ENGINE = "CFMI CFM56-3";

    private static final String CHINOOK_NAME = "Boeing CH-47 Chinook";
    private static final int CHINOOK_FLIGHT_RANGE = 600;
    private static final int CHINOOK_FUEL_CONSUMPTION = 250;
    private static final int CHINOOK_PASSENGERS_CAPACITY = 7;
    private static final int CHINOOK_CARGO_CAPACITY = 350;
    private static final boolean CHINOOK_HOVER_TAKEOFF = true;
    private static final String CHINOOK_ENGINE = "Pratt&Whitney PW4000";
    private static final String CHINOOK_ROTOR = "Kopp-Etchells";

    private static final String SIKORSKY_NAME = "Sikorsky HH-60J Jayhawk";
    private static final int SIKORSKY_FLIGHT_RANGE = 600;
    private static final int SIKORSKY_FUEL_CONSUMPTION = 380;
    private static final int SIKORSKY_PASSENGERS_CAPACITY = 4;
    private static final int SIKORSKY_CARGO_CAPACITY = 100;
    private static final boolean SIKORSKY_HOVER_TAKEOFF = true;
    private static final String SIKORSKY_ENGINE = "Pratt&Whitney PW4000";
    private static final String SIKORSKY_ROTOR = "MH-60R Sea Hawk";

    private static final String WITH_FRONT_WHEEL_CHASSIS_TYPE = "with front wheel";
    private static final String WITH_BACK_WHEEL_CHASSIS_TYPE = "with back wheel";

    /**
     * Field that stands for the
     * company to be build
     */
    private Airline airline;

    public Airline getAirline() {
        return airline;
    }

    public AirlineBuilder(Airline airline) {
        this.airline = airline;
    }


    /**
     * Method that adds airliners
     * to an airline company.
     *
     * @return reference to itself
     */
    public AirlineBuilder addHelicopters() {

        this.airline.addHelicopter(new Helicopter.HelicopterBuilder(CHINOOK_NAME)
                .setFlightRange(CHINOOK_FLIGHT_RANGE)
                .setFuelConsumption(CHINOOK_FUEL_CONSUMPTION)
                .setPassengerCapacity(CHINOOK_PASSENGERS_CAPACITY)
                .setCargoCapacity(CHINOOK_CARGO_CAPACITY)
                .setHoverTakeoff(CHINOOK_HOVER_TAKEOFF)
                .setEngine(CHINOOK_ENGINE)
                .setHelicopterRotor(CHINOOK_ROTOR)
                .build());

        this.airline.addHelicopter(new Helicopter.HelicopterBuilder(SIKORSKY_NAME)
                .setFlightRange(SIKORSKY_FLIGHT_RANGE)
                .setFuelConsumption(SIKORSKY_FUEL_CONSUMPTION)
                .setPassengerCapacity(SIKORSKY_PASSENGERS_CAPACITY)
                .setCargoCapacity(SIKORSKY_CARGO_CAPACITY)
                .setHoverTakeoff(SIKORSKY_HOVER_TAKEOFF)
                .setEngine(SIKORSKY_ENGINE)
                .setHelicopterRotor(SIKORSKY_ROTOR)
                .build());

        return this;
    }

    /**
     * Method that adds airliners
     * to an freighters company.
     *
     * @return reference to itself
     */
    public AirlineBuilder addPlanes() {
        this.airline.addPlane(new Plane.PlaneBuilder(BOEING777_NAME)
                .setFlightRange(BOEING777_FLIGHT_RANGE)
                .setFuelConsumption(BOEING777_FUEL_CONSUMPTION)
                .setPassengerCapacity(BOEING777_PASSENGERS_CAPACITY)
                .setCargoCapacity(BOEING777_CARGO_CAPACITY)
                .setHoverTakeoff(BOEING777_HOVER_TAKEOFF)
                .setEngine(BOEING777_ENGINE)
                .setChassisType(WITH_BACK_WHEEL_CHASSIS_TYPE)
                .build());
        this.airline.addPlane(new Plane.PlaneBuilder(BOEING767_NAME)
                .setFlightRange(BOEING767_FLIGHT_RANGE)
                .setFuelConsumption(BOEING767_FUEL_CONSUMPTION)
                .setPassengerCapacity(BOEING767_PASSENGERS_CAPACITY)
                .setCargoCapacity(BOEING767_CARGO_CAPACITY)
                .setHoverTakeoff(BOEING767_HOVER_TAKEOFF)
                .setEngine(BOEING767_ENGINE)
                .setChassisType(WITH_BACK_WHEEL_CHASSIS_TYPE)
                .build());
        this.airline.addPlane(new Plane.PlaneBuilder(BOEING737_NAME)
                .setFlightRange(BOEING737_FLIGHT_RANGE)
                .setFuelConsumption(BOEING737_FUEL_CONSUMPTION)
                .setPassengerCapacity(BOEING737_PASSENGERS_CAPACITY)
                .setCargoCapacity(BOEING737_CARGO_CAPACITY)
                .setHoverTakeoff(BOEING737_HOVER_TAKEOFF)
                .setEngine(BOEING737_ENGINE)
                .setChassisType(WITH_FRONT_WHEEL_CHASSIS_TYPE)
                .build());


        return this;
    }

}
