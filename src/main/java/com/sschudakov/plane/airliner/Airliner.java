package com.sschudakov.plane.airliner;

import com.sschudakov.plane.Plane;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**Here is defined an abstract class Freighter
 * that stands for the type of airplanes
 * that deal with passengers transfers.
 * Therefore a field capacity is added
 * that stands for the maximum amount of
 * people an airliner can transfer. Also getter
 * getCapacity() is added amd method toString()
 * is overridden.
 *
 * @author Semen Chudakov
 */
public abstract class Airliner implements Plane {

    protected String name;
    protected int flightRange;
    protected double fuelConsumption;
    protected int capacity;


    @Override
    public int getFlightRange() {
        return this.flightRange;
    }

    @Override
    public double getFuelConsumption() {
        return this.fuelConsumption;
    }


    /**
     * Getter on the capacity field.
     *
     * @return capacity of the plane
     */
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public String getName() {
        return this.name;
    }


    /**
     * This overridden toString() method
     * considers all four field of the Airliner
     * class and uses SIMPLE_STYLE as a string style.
     *
     * @see ToStringStyle
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE)
                .append(this.name)
                .append(this.flightRange)
                .append(this.fuelConsumption)
                .append(this.capacity)
                .toString();
    }
}
