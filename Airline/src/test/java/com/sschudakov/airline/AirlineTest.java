package com.sschudakov.airline;

import com.sschudakov.aircraft.engine.helicopter.Helicopter;
import com.sschudakov.aircraft.engine.plane.Plane;
import com.sschudakov.aircraft.nonengine.airframe.Airframe;
import com.sschudakov.aircraft.nonengine.balloon.Balloon;
import org.junit.Before;
import org.junit.Test;

/**
 * Test case for the Airline class.
 *
 * @author Semen Chudakov
 */
public class AirlineTest {

    /**
     * An Airline object that will be tested.
     */
    private Airline airline;


    /**
     * Method that does initializations.
     */
    @Before
    public void init() {
        this.airline = new Airline();
    }


    /**
     * Method that tests the condition that
     * there should not be any aircraft in an
     * airline after its creation.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void noAircraftBeforeAdding() {
        if (this.airline.getAircraft().size() != 0) {
            throw new AssertionError("the aircraft list should " +
                    "be empty after creation of an airline");
        }
    }


    /**
     * Method that tests the condition that
     * addPlane() method should not throw any exceptions.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addPlaneNoExceptions() {
        Plane plane = new Plane(null, 0,
                0, 0, 0,
                false, null, null);
        try {
            this.airline.addPlane(plane);
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("method should not throw any exceptions");
        }
    }

    /**
     * Method that tests the condition that
     * after using addPlane() one time the size
     * of aircraft list in an airline is 1.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addPlaneCorrectSize() {
        Plane plane = new Plane(null, 0,
                0, 0, 0,
                false, null, null);
        this.airline.addPlane(plane);
        if (this.airline.getAircraft().size() != 1) {
            throw new AssertionError("the size of the aircraft list after adding 1 element should be 1");
        }
    }

    /**
     * Method that tests the condition that
     * addPlane() adds the same object it was given.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addPlaneAddedCorrectObject() {
        Plane plane = new Plane(null, 0,
                0, 0, 0,
                false, null, null);
        this.airline.addPlane(plane);
        if (!this.airline.getAircraft().get(0).equals(plane)) {
            throw new AssertionError("method should add the same abject it was given");
        }
    }


    /**
     * Method that tests the condition that
     * addHelicopter() method should not throw
     * any exceptions.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addHelicopterNoExceptions() {
        Helicopter helicopter = new Helicopter(null, 0,
                0, 0, 0,
                false, null, null);
        try {
            this.airline.addHelicopter(helicopter);
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("method should not throw any exceptions");
        }
    }

    /**
     * Method that tests the condition that
     * after using addHelicopter() one time the size
     * of aircraft list in an airline is 1.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addHelicopterCorrectSize() {
        Helicopter helicopter = new Helicopter(null, 0,
                0, 0, 0,
                false, null, null);
        this.airline.addHelicopter(helicopter);
        if (this.airline.getAircraft().size() != 1) {
            throw new AssertionError("the size of the aircraft list after adding 1 element should be 1");
        }
    }

    /**
     * Method that tests the condition that
     * addHelicopter() adds the same object
     * it was given.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addHelicopterAddedCorrectObject() {
        Helicopter helicopter = new Helicopter(null, 0,
                0, 0, 0,
                false, null, null);
        this.airline.addHelicopter(helicopter);
        if (!this.airline.getAircraft().get(0).equals(helicopter)) {
            throw new AssertionError("method should add the same abject it was given");
        }
    }


    /**
     * Method that tests the condition that
     * addBalloon() method should not throw
     * any exceptions.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addBalloonNoExceptions() {
        Balloon balloon = new Balloon(null, 0,
                0, 0, 0,
                null, 0, 0);
        try {
            this.airline.addBalloon(balloon);
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("method should not throw any exceptions");
        }
    }

    /**
     * Method that tests the condition that
     * after using addBalloon() one time the size
     * of aircraft list in an airline is 1.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addBalloonAddedCorrectSize() {
        Balloon balloon = new Balloon(null, 0,
                0, 0, 0,
                null, 0, 0);
        this.airline.addBalloon(balloon);
        if (this.airline.getAircraft().size() != 1) {
            throw new AssertionError("the size of the aircraft list after adding 1 element should be 1");
        }
    }

    /**
     * Method that tests the condition that
     * addBalloon() adds the same object
     * it was given.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addBalloonAddedCorrectObject() {
        Balloon balloon = new Balloon(null, 0,
                0, 0, 0,
                null, 0, 0);
        this.airline.addBalloon(balloon);
        if (!this.airline.getAircraft().get(0).equals(balloon)) {
            throw new AssertionError("method should add the same abject it was given");
        }
    }


    /**
     * Method that tests the condition that
     * addAirframe() method should not throw
     * any exceptions.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addAirframeNoExceptions() {
        Airframe airframe = new Airframe(null, 0,
                0, 0, 0,
                null, null);
        try {
            this.airline.addAirframe(airframe);
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("method should not throw any exceptions");
        }
    }

    /**
     * Method that tests the condition that
     * after using addAirframe() one time the size
     * of aircraft list in an airline is 1.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addAirframeAddedCorrectSize() {
        Airframe airframe = new Airframe(null, 0,
                0, 0, 0,
                null, null);
        this.airline.addAirframe(airframe);
        if (this.airline.getAircraft().size() != 1) {
            throw new AssertionError("the size of the aircraft list after adding 1 element should be 1");
        }
    }

    /**
     * Method that tests the condition that
     * addAirframe() adds the same object
     * it was given.
     *
     * @throws AssertionError if and only if the condition is violated
     */
    @Test
    public void addAirframeAddedCorrectObject() {
        Airframe airframe = new Airframe(null, 0,
                0, 0, 0,
                null, null);
        this.airline.addAirframe(airframe);
        if (!this.airline.getAircraft().get(0).equals(airframe)) {
            throw new AssertionError("method should add the same abject it was given");
        }
    }
}