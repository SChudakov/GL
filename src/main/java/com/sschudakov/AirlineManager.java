package com.sschudakov;

import com.sschudakov.plane.Plane;
import com.sschudakov.plane.airliner.Airliner;
import com.sschudakov.plane.freighter.Freighter;
import org.jetbrains.annotations.NotNull;

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
    @NotNull
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
        this.airlineBuilder.addAirliners().addFreighters();
    }

    /**
     * Method that calculates total
     * carrying capacity of all freighters
     * in the company.
     *
     * @return total carrying capacity
     */
    public int calculateTotalCarryingCapacity() {
        int result = 0;
        for (Freighter freighter : this.airline.getFreighters()) {
            result += freighter.getCarryingCapacity();
        }
        return result;
    }

    /**
     * Method that calculates total
     * capacity of all Airliners
     * in the company.
     *
     * @return total capacity
     */
    public int calculateTotalCapacity() {
        int result = 0;
        for (Airliner airliner : this.airline.getAirliners()) {
            result += airliner.getCapacity();
        }
        return result;
    }

    /**
     * Method that sorts all planes in the
     * company by their flight range.
     *
     * @return sorted list of planes
     */
    public List<Plane> sortPlanesByFlightRange() {

        List<Plane> result = new ArrayList<>();

        for (Airliner airliner : this.airline.getAirliners()) {
            result.add(airliner);
        }

        for (Freighter freighter : this.airline.getFreighters()) {
            result.add(freighter);
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
    public List<Plane> planesInFuelConsumptionSpan(double from, double to) {
        List<Plane> result = new ArrayList<>();
        for (Airliner airliner : this.airline.getAirliners()) {
            if (airliner.getFuelConsumption() <= to && airliner.getFuelConsumption() >= from) {
                result.add(airliner);
            }
        }
        for (Freighter freighter : this.airline.getFreighters()) {
            if (freighter.getFuelConsumption() <= to && freighter.getFuelConsumption() >= from) {
                result.add(freighter);
            }
        }
        return result;
    }
}
