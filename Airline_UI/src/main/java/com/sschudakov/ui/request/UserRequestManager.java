package com.sschudakov.ui.request;


import com.sschudakov.aircraft.Aircraft;
import com.sschudakov.airline.manager.AirlineManager;

import java.util.List;

/**
 * Here is defined UserRequestManager class that represents
 * an intermediate lair between UI and AirlineManager
 * in which all user requests are validated and then
 * delegated to AirlineManager.
 *
 * @author Semen Chudakov
 */

public class UserRequestManager {

    /**
     * Constants that contain strings
     * used while forming response for the user.
     */
    private static final String TOTAL_PASSENGER_CAPACITY = "total passenger capacity: ";
    private static final String TOTAL_CARGO_CAPACITY = "total cargo capacity: ";

    /**
     * An AirlineManager object to which
     * user requests will be delegated.
     */
    private AirlineManager airlineManager;


    /**
     * Constructor that initializes airlineManager field
     *
     * @param airlineManager AirlineManager object
     */
    public UserRequestManager(AirlineManager airlineManager) {
        this.airlineManager = airlineManager;
    }

    /**
     * Method that forms a string to be rendered
     * to the user as a response about planes in
     * a fuel consumption span.
     *
     * @param from begin point of the span
     * @param to   end point of the span
     * @return string that contains information
     * about planes that fir given fuel consumption span.
     */
    public String formFittingPlanesInfo(String from, String to) {
        return formStringFromList(
                planesInFuelConsumptionSpan(from, to)
        );
    }


    /**
     * Method that validate and convert input
     * by user from and to parameters and
     * delegate request to AirlineManager
     *
     * @param from begin point of the span
     * @param to   end point of the span
     * @return list of planes in given fuel consumption span
     * @throws NumberFormatException if the string does not contain a
     *                               parsable number.
     */
    private List<Aircraft> planesInFuelConsumptionSpan(String from, String to) {
        int parsedFrom = parseDouble(from);
        int parsedTo = parseDouble(to);
        validateParameters(parsedFrom, parsedTo);
        return this.airlineManager.planesInFuelConsumptionSpan(parsedFrom, parsedTo);
    }

    /**
     * Method that converts given string
     * to a integer number.
     *
     * @param num string to be parsed
     * @return parsed integer number
     * @throws NumberFormatException    if the string does not contain a
     *                                  parsable number.
     * @throws IllegalArgumentException if: either from or to
     *                                  is less the 0, from is greater than to
     */
    private int parseDouble(String num) {
        return Integer.valueOf(num);
    }

    /**
     * Method that validates parsed endpoints of a span.
     *
     * @param from from endpoint of a span
     * @param to   to endpoint of a span
     * @throws IllegalArgumentException if: either from or to
     *                                  is less the 0, from is greater than to
     */
    private void validateParameters(int from, int to) {
        if (from < 0 || to < 0) {
            throw new IllegalArgumentException("endpoints of an " +
                    "fuel consumption span cannot be negative");
        }

        if (from > to) {
            throw new IllegalArgumentException("in a fuel consumption " +
                    "span the from endpoint should be less than or " +
                    "equal to to endpoint");
        }
    }

    /**
     * Method that forms string that contains about
     * entire passengerCapacity and carrying passengerCapacity of all
     * airliners and freighters in an airline company
     *
     * @return string with information.
     */
    public String formCapacityInformationString() {
        return TOTAL_PASSENGER_CAPACITY + this.airlineManager.calculateTotalPassengerCapacity() + "\n"
                + TOTAL_CARGO_CAPACITY + this.airlineManager.calculateTotalCargoCapacity();
    }


    /**
     * Method that forms string with information
     * about all planes in an airline company
     * sorted by their flight range.
     *
     * @return string with information
     */
    public String formPlanesSortedListInfo() {
        return formStringFromList(this.airlineManager.sortPlanesByFlightRange());
    }

    /**
     * Method that converts a given list into a string.
     *
     * @param list list to be converted
     * @return string with elements of the list
     */
    private String formStringFromList(List<Aircraft> list) {
        StringBuilder result = new StringBuilder("");
        for (Aircraft plane : list) {
            result.append(plane + "\n");
        }

        if (result.toString().length() == 0) {
            return result.toString();
        }

        return result.deleteCharAt(result.length() - 1).toString();
    }

}
