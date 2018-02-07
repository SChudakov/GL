package com.sschudakov.airline;

import com.sschudakov.aircraft.Aircraft;
import com.sschudakov.aircraft.engine.helicopter.Helicopter;
import com.sschudakov.aircraft.engine.plane.Plane;
import com.sschudakov.aircraft.engineless.airframe.Airframe;
import com.sschudakov.aircraft.engineless.balloon.Balloon;

import java.util.ArrayList;
import java.util.List;


/**
 * Here is defined the Airline class
 * that represents an Airline company.
 *
 * @author Semen Chudakov
 */
public class Airline {

    /**
     * The list of aircraft of the company.
     */
    private List<Aircraft> aircraft;

    /**
     * Getters on the aircraft field.
     */
    public List<Aircraft> getAircraft() {
        return aircraft;
    }

    /**
     * The non-ard constructor that
     * initializes the aircraft field.
     */
    public Airline() {
        this.aircraft = new ArrayList<>();
    }


    /**
     * Methods that adds a plane
     * to an airline company.
     *
     * @param plane plane ot be added
     */
    public void addPlane(Plane plane) {
        this.aircraft.add(plane);
    }

    /**
     * Methods that adds a helicopter
     * to an airline company.
     *
     * @param helicopter helicopter to be added
     */
    public void addHelicopter(Helicopter helicopter) {
        this.aircraft.add(helicopter);
    }

    /**
     * Methods that adds a balloon
     * to an airline company.
     *
     * @param balloon balloon to be added
     */
    public void addBalloon(Balloon balloon) {
        this.aircraft.add(balloon);
    }

    /**
     * Methods that adds an airframe
     * to an airline company.
     *
     * @param airframe airframe to be added
     */
    public void addAirframe(Airframe airframe) {
        this.aircraft.add(airframe);
    }
}
