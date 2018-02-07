package com.sschudakov.airline.manager;

import com.sschudakov.aircraft.Aircraft;
import com.sschudakov.airline.Airline;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Test case for the AirlineManage class.
 *
 * @author Semen Chudakov
 */
public class AirlineManagerTest {
    /**
     * An AirlineManager object that will be tested.
     */
    private AirlineManager airlineManager;

    /**
     * Method that does initializations.
     */
    @Before
    public void init() {
        this.airlineManager = new AirlineManager(new Airline());
    }


    /**
     * Method that tests the condition that
     * calculateTotalCargoCapacity() methods should not
     * throw any exceptions
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void calculateTotalCargoCapacityNoExceptions() {
        try {
            this.airlineManager.calculateTotalCargoCapacity();
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("method should not throw any exceptions");
        }
    }

    /**
     * Method that tests the condition that
     * calculateTotalCargoCapacity() methods should
     * return a positive number.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void calculateTotalCargoCapacityPositiveCapacity() {
        int calculatedCapacity = this.airlineManager.calculateTotalCargoCapacity();

        if (calculatedCapacity < 0) {
            throw new AssertionError("the cargo capacity cannot be negative");
        }
    }


    /**
     * Method that tests the condition that
     * calculateTotalPassengerCapacity() methods should not
     * throw any exceptions
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void calculateTotalPassengerCapacityNoExceptions() {
        try {
            this.airlineManager.calculateTotalPassengerCapacity();
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("method should not throw any exceptions");
        }
    }

    /**
     * Method that tests the condition that
     * calculateTotalPassengerCapacity() methods should
     * return a positive number.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void calculateTotalPassengerCapacityPositiveCapacity() {
        int calculatedCapacity = this.airlineManager.calculateTotalPassengerCapacity();

        if (calculatedCapacity < 0) {
            throw new AssertionError("the passenger capacity cannot be negative");
        }
    }


    /**
     * Method that tests the condition that
     * sortPlanesByFlightRange() methods should not
     * throw any exceptions
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void sortPlanesByFlightRangeNoExceptions() {
        try {
            this.airlineManager.sortPlanesByFlightRange();
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("method should not throw any exceptions");
        }
    }

    /**
     * Method that tests the condition that
     * sortPlanesByFlightRange() sorts the
     * aircraft by its flight range correctly:
     * in a descending sorting order.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void sortPlanesByFlightRangeCorrectSorting() {
        List<Aircraft> methodList = this.airlineManager.sortPlanesByFlightRange();
        List<Aircraft> sortedList = new ArrayList<>(methodList);
        Collections.sort(sortedList, (o1, o2) -> {
            if (o1.getFlightRange() - o2.getFlightRange() > 0) {
                return 1;
            }
            if (o1.getFlightRange() - o2.getFlightRange() < 0) {
                return -1;
            }
            return 0;
        });
        if (!methodList.equals(sortedList)) {
            throw new AssertionError("list is sorted incorrectly");
        }
    }


    /**
     * Method that tests the condition that
     * planesInFuelConsumptionSpan() methods should not
     * throw any exceptions
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void planesInFuelConsumptionSpanNoExceptions() {
        try {
            this.airlineManager.planesInFuelConsumptionSpan(0, 1000);
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("method should not throw any exceptions");
        }
    }

    /**
     * Method that tests the condition that
     * sortPlanesByFlightRange() should not
     * throw any exception when been given a
     * span where endpoints are equal.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void planesInFuelConsumptionSpanEqualEndpoints() {
        try {
            this.airlineManager.planesInFuelConsumptionSpan(1000, 1000);
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("method should not throw any exceptions" +
                    "when given a span where endpoints are equal");
        }
    }
}