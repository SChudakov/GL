package com.sschudakov.airline.manager;

import com.sschudakov.aircraft.Aircraft;
import com.sschudakov.airline.Airline;
import com.sschudakov.airline.builder.AirlineBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class deals with creating an
 * airline company and providing information
 * about it.
 *
 * @author Semen Chudakov
 */
public class AirlineManager {

    /**
     * An airline company object.
     */
    private Airline airline;

    /**
     * An AirlineBuilder object.
     */
    private AirlineBuilder airlineBuilder;

    /**
     * Constructor that initializes airline
     * and airlineBuilder field and does calls init()
     * method.
     *
     * @param airline the company this class should manage
     */
    public AirlineManager(Airline airline) {
        this.airline = airline;
        this.airlineBuilder = new AirlineBuilder(airline);
        init();
    }

    /**
     * Method that does initializations
     * after an airline company object is
     * set.
     */
    private void init() {
        this.airlineBuilder.addHelicopters().addPlanes();
    }

    /**
     * Method that calculates total
     * carrying passengerCapacity of all freighters
     * in the company.
     *
     * @return total carrying passengerCapacity
     */
    public int calculateTotalCargoCapacity() {
        int result = 0;

        for (Aircraft aircraft : this.airline.getAircraft()) {
            result += aircraft.getCargoCapacity();
        }

        return result;
    }

    /**
     * Method that calculates total
     * passengerCapacity of all Airliners
     * in the company.
     *
     * @return total passengerCapacity
     */
    public int calculateTotalPassengerCapacity() {
        int result = 0;

        for (Aircraft aircraft : this.airline.getAircraft()) {
            result += aircraft.getPassengerCapacity();
        }

        return result;
    }

    /**
     * Method that sorts all planes in the
     * company by their flight range.
     *
     * @return sorted list of planes
     */
    public List<Aircraft> sortPlanesByFlightRange() {

        List<Aircraft> result = new ArrayList<>();

        for (Aircraft aircraft : this.airline.getAircraft()) {
            result.add(aircraft);
        }

        Collections.sort(result, (o1, o2) -> {
            if (o1.getFlightRange() - o2.getFlightRange() > 0) {
                return 1;
            }
            if (o1.getFlightRange() - o2.getFlightRange() < 0) {
                return -1;
            }
            return 0;
        });

        return result;
    }

    /**
     * Method that selects planes in the
     * given fuel consumption span. Both
     * endpoints of the span are included
     * in the resulting list.
     *
     * @param from begin point of the span
     * @param to   end point of span
     * @return list of planes in given fuel consumption span
     */
    public List<Aircraft> planesInFuelConsumptionSpan(double from, double to) {
        List<Aircraft> result = new ArrayList<>();
        for (Aircraft aircraft : this.airline.getAircraft()) {
            if (aircraft.getFuelConsumption() <= to && aircraft.getFuelConsumption() >= from) {
                result.add(aircraft);
            }
        }

        return result;
    }
}
