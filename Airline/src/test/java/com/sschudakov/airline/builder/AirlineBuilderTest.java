package com.sschudakov.airline.builder;

import com.sschudakov.airline.Airline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test case for the AirlineBuilder class.
 *
 * @author Semen Chudakov
 */
public class AirlineBuilderTest {
    /**
     * An AirlineBuilder object that will be tested.
     */
    private AirlineBuilder airlineBuilder;

    /**
     * Method that does initializations.
     */
    @Before
    public void init() {
        this.airlineBuilder = new AirlineBuilder(new Airline());
    }

    /**
     * Method that tests the condition that
     * addHelicopters() methods should not
     * throw any exceptions
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addHelicoptersNoExceptions() {
        try {
            this.airlineBuilder.addHelicopters();
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("method should not throw any exceptions");
        }
    }

    /**
     * Method that tests the condition that
     * addHelicopters() methods return a reference
     * to its object.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addHelicoptersReferenceToItself() {
        AirlineBuilder returnedReference = this.airlineBuilder.addHelicopters();
        if(!this.airlineBuilder.equals(returnedReference)){
            throw new AssertionError("method should return a reference to itself");
        }
    }

    /**
     * Method that tests the condition that
     * addPlanes() methods should not
     * throw any exceptions
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addPlanesNoExceptions() {
        try {
            this.airlineBuilder.addPlanes();
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("method should not throw any exceptions");
        }
    }

    /**
     * Method that tests the condition that
     * addPlanes() methods return a reference
     * to its object.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addPlanesReferenceToItself() {
        AirlineBuilder returnedReference = this.airlineBuilder.addPlanes();
        if(!this.airlineBuilder.equals(returnedReference)){
            throw new AssertionError("method should return a reference to itself");
        }
    }
}