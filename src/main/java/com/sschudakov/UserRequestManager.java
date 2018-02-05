package com.sschudakov;

import com.sschudakov.plane.Plane;
import org.jetbrains.annotations.NotNull;

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
     * Constants.
     */
    private static final String TOTAL_CAPACITY = "total capacity: ";
    private static final String TOTAL_CARRYING_CAPACITY = "total carrying capacity: ";

    /**
     * An AirlineManager object to which
     * user requests will be delegated.
     */
    @NotNull
    private AirlineManager airlineManager;


    /**
     * Constructor.
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
     */
    private List<Plane> planesInFuelConsumptionSpan(String from, String to) {
        double parsedFrom = parseDouble(from);
        double parsedTo = parseDouble(to);
        return this.airlineManager.planesInFuelConsumptionSpan(parsedFrom, parsedTo);
    }

    /**
     * Method that converts given string
     * to a double number.
     *
     * @param num
     * @return
     * @throws NumberFormatException if the string does not contain a
     *                               parsable number.
     */
    private double parseDouble(String num) {
        return Double.valueOf(num);
    }

    /**
     * Method that forms string that contains about
     * entire capacity and carrying capacity of all
     * airliners and freighters in an airline company
     *
     * @return string with information.
     */
    public String formCapacityInformationString() {
        return TOTAL_CAPACITY + this.airlineManager.calculateTotalCapacity() + "\n"
                + TOTAL_CARRYING_CAPACITY + this.airlineManager.calculateTotalCarryingCapacity();
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
     * Method that converts a given list into string.
     *
     * @param list list to be converted
     * @return string with elements of the list
     */
    private String formStringFromList(List<Plane> list) {
        StringBuilder result = new StringBuilder("");
        for (Plane plane : list) {
            result.append(plane + "\n");
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }

}
