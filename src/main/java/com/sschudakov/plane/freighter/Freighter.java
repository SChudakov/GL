package com.sschudakov.plane.freighter;

import com.sschudakov.plane.Plane;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Here is defined an abstract class Freighter
 * that stands for the type of airplanes
 * that can transfer a cargo of big weight.
 * Therefore a field carryingCapacity is added
 * that stands for the maximum weight of cargo
 * a freighter can transfer
 *
 * @author Semen Chudakov
 */
public abstract class Freighter implements Plane {

    protected String name;

    protected int flightRange;
    protected int fuelConsumption;
    protected double carryingCapacity;

    @Override
    public int getFlightRange() {
        return this.flightRange;
    }

    @Override
    public double getFuelConsumption() {
        return this.fuelConsumption;
    }


    /**
     * Getter on the carryingCapacity field.
     *
     * @return carrying capacity of the plane
     */
    public double getCarryingCapacity() {
        return this.carryingCapacity;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * This overridden toString() method
     * considers all four field of the Freighter
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
                .append(this.carryingCapacity)
                .toString();
    }
}
