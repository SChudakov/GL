package com.sschudakov;

import com.sschudakov.plane.Plane;
import com.sschudakov.plane.airliner.Airliner;
import com.sschudakov.plane.freighter.Freighter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AirlineManager {

    private Airline airline;
    private AirlineBuilder airlineBuilder;

    public AirlineManager(Airline airline) {
        this.airline = airline;
        this.airlineBuilder = new AirlineBuilder(airline);
        init();
    }

    private void init() {
        this.airlineBuilder.addAirliners().addFreighters();
    }

    public int calculateTotalCarryingCapacity() {
        int result = 0;
        for (Freighter freighter : this.airline.getFreighters()) {
            result += freighter.getCarryingCapacity();
        }
        return result;
    }

    public int calculateTotalCapacity() {
        int result = 0;
        for (Airliner airliner : this.airline.getAirliners()) {
            result += airliner.getCapacity();
        }
        return result;
    }

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
