package com.sschudakov.plane;

/**
 * An interface that represent
 * the plane entity of airline.
 * It declares three methods that
 * stand for corresponding properties
 * a plane should have: flight range,
 * fuel consumption rate and name
 *
 * @author Semen Chudakov
 */
public interface Plane {

    /**
     * Getter on the flight range rate.
     *
     * @return flight range of the plane
     */
    int getFlightRange();

    /**
     * Getter on the fuel consumption rate.
     *
     * @return fuel consumption of the plane
     */
    double getFuelConsumption();

    /**
     * Getter on the name rate.
     *
     * @return name of the plane
     */
    String getName();
}
