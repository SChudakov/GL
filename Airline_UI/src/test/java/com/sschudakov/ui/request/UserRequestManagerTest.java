package com.sschudakov.ui.request;

import com.sschudakov.airline.Airline;
import com.sschudakov.airline.manager.AirlineManager;
import org.junit.Before;
import org.junit.Test;

/**
 * Test case for the UserRequestManager class.
 *
 * @author Semen Chudakov
 */
public class UserRequestManagerTest {

    /**
     * An UserRequestManager object that will be tested.
     */
    private UserRequestManager userRequestManager;


    /**
     * Method that does initializations.
     */
    @Before
    public void init() {
        this.userRequestManager = new UserRequestManager(
                new AirlineManager(new Airline()));
    }


    /**
     * Method that tests the condition that
     * formCapacityInformationString() methods should not
     * throw any exceptions
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void formCapacityInformationStringNoExceptions() {
        try {
            this.userRequestManager.formCapacityInformationString();
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("the method formCapacityInformationString() " +
                    "should not throw any exceptions");
        }
    }


    /**
     * Method that tests the condition that
     * formPlanesSortedListInfo() methods should not
     * throw any exceptions
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void formPlanesSortedListInfoNoExceptions() {
        try {
            this.userRequestManager.formPlanesSortedListInfo();
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("the method " +
                    "should not throw any exceptions");
        }
    }


    /**
     * Method that tests the condition that
     * formFittingPlanesInfo() methods should not
     * throw any exceptions when given a correct
     * fuel consumption span.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void formFittingPlanesInfoCorrectSpanNoExceptions() {
        try {
            this.userRequestManager.formFittingPlanesInfo("0", "1000");
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("the method formPlanesSortedListInfo() " +
                    "should not throw any exceptions when given a correct fuel consumption span");
        }
    }

    /**
     * Method that tests the condition that
     * formFittingPlanesInfo() methods should not
     * throw any exceptions when given a fuel consumption span
     * with equal endpoints.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void formFittingPlanesInfoEqualEndpoints() {
        try {
            this.userRequestManager.formFittingPlanesInfo("1000", "1000");
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("the method should not " +
                    "throw any exceptions when given a fuel consumption span " +
                    "with equal endpoints");
        }
    }

    /**
     * Method that tests the condition that
     * formFittingPlanesInfo() methods should
     * throw an IllegalArgumentException when given a
     * span with negative from span
     *
     * @throws AssertionError if and only if no exception is thrown
     *                        or thrown exception has another type
     */
    @Test
    public void formFittingPlanesInfoNegativeFromEndpoints() {
        try {
            this.userRequestManager.formFittingPlanesInfo("-1000", "1000");
            throw new AssertionError("method should " +
                    "throw an IllegalArgumentException when given a " +
                    "span with negative from span");
        } catch (IllegalArgumentException e) {
            /*NOP*/
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("the method should " +
                    "throw an IllegalArgumentException when given a " +
                    "span with negative from span");
        }
    }

    /**
     * Method that tests the condition that
     * formFittingPlanesInfo() methods should
     * throw an IllegalArgumentException when
     * given a span where from endpoint is greater
     * than to endpoint
     *
     * @throws AssertionError if and only if no exception is thrown
     *                        or thrown exception has another type
     */
    @Test
    public void formFittingPlanesInfoFromGreaterThanTo() {
        try {
            this.userRequestManager.formFittingPlanesInfo("1000", "0");
            throw new AssertionError("method should throw " +
                    "an IllegalArgumentException when given a " +
                    "span where from endpoint is greater than to endpoint");
        } catch (IllegalArgumentException e) {
            /*NOP*/
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("method should throw " +
                    "an IllegalArgumentException when given a " +
                    "span where from endpoint is greater than to endpoint");
        }
    }

    /**
     * Method that tests the condition that
     * formFittingPlanesInfo() methods should
     * throw an IllegalArgumentException when
     * given a span where endpoints have illegal
     * number format.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void formFittingPlanesInfoIncorrectNumbers() {
        try {
            this.userRequestManager.formFittingPlanesInfo("abc", "def");
            throw new AssertionError("method should throw " +
                    "an IllegalArgumentException when given a " +
                    "span where endpoints have illegal number format");
        } catch (IllegalArgumentException e) {
            /*NOP*/
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("the method should " +
                    "throw an IllegalArgumentException when given a " +
                    "span where endpoints have illegal number format");
        }
    }
}