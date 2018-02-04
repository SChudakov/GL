package com.sschudakov;

import com.sschudakov.plane.Plane;

import java.util.List;

public class UserRequestManager {

    private static final String TOTAL_CAPACITY = "total capacity: ";
    private static final String TOTAL_CARRYING_CAPACITY = "total carrying capacity: ";

    private AirlineManager airlineManager;

    public UserRequestManager(AirlineManager airlineManager) {
        this.airlineManager = airlineManager;
    }

    public String formFittingPlanesInfo(String from, String to) {
        return formStringFromList(
                planesInFuelConsumptionSpan(from, to)
        );
    }

    private List<Plane> planesInFuelConsumptionSpan(String from, String to) {
        double parsedFrom = parseDouble(from);
        double parsedTo = parseDouble(to);
        return this.airlineManager.planesInFuelConsumptionSpan(parsedFrom, parsedTo);
    }

    private double parseDouble(String num) {
        return Double.valueOf(num);
    }

    public String formCapacityInformationString() {
        return TOTAL_CAPACITY + this.airlineManager.calculateTotalCapacity() + "\n"
                + TOTAL_CARRYING_CAPACITY + this.airlineManager.calculateTotalCarryingCapacity();
    }

    public String formPlanesSortedListInfo() {
        return formStringFromList(this.airlineManager.sortPlanesByFlightRange());
    }

    private String formStringFromList(List<Plane> list) {
        StringBuilder result = new StringBuilder("");
        for (Plane plane : list) {
            result.append(plane + "\n");
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }

}
