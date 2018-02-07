package com.sschudakov.airline;

import com.sschudakov.aircraft.Aircraft;
import com.sschudakov.aircraft.engine.helicopter.Helicopter;
import com.sschudakov.aircraft.engine.plane.Plane;

import java.util.ArrayList;
import java.util.List;


/**
 * Here is defined the Airline class
 * that represents an Airline company.
 * The class contains collection of
 * Freighters and collections of airliners.
 * There are getters on the fields.
 * There are also addFreighter() and
 * addAirliner() methods that encapsulate
 * work with aircraft and airliners so that
 * they are not directly accessed from outside.
 *
 * @author Semen Chudakov
 */
public class Airline {

    private List<Aircraft> aircraft;

    public Airline() {
        this.aircraft = new ArrayList<>();
    }

    public List<Aircraft> getAircraft() {
        return aircraft;
    }

    /**
     * Methods that enables adding
     * aircraft to an Airline company
     */
    public void addPlane(Plane plane) {
        this.aircraft.add(plane);
    }

    public void addHelicopter(Helicopter helicopter) {
        this.aircraft.add(helicopter);
    }

}
