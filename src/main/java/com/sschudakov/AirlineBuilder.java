package com.sschudakov;

import com.sschudakov.plane.airliner.BeechcraftStarship;
import com.sschudakov.plane.airliner.BristolBritannia;
import com.sschudakov.plane.freighter.AeroSpacelinesSuperGuppy;
import com.sschudakov.plane.freighter.AirbusBeluga;


/**
 * Here is defined AirlineBuilder class
 * that applies Builder pattern to Airline
 * class.
 *
 * @author Semen Chudakov
 */
public class AirlineBuilder {

    /**
     * Field that stands for the
     * company to be build
     */
    private Airline airline;

    public Airline getAirline() {
        return airline;
    }

    public AirlineBuilder(Airline airline) {
        this.airline = airline;
    }


    /**
     * Method that adds airliners
     * to an airline company.
     *
     * @return reference to itself
     */
    public AirlineBuilder addAirliners() {
        this.airline.addAirliner(new BeechcraftStarship());
        this.airline.addAirliner(new BristolBritannia());
        return this;
    }

    /**
     * Method that adds airliners
     * to an freighters company.
     *
     * @return reference to itself
     */
    public AirlineBuilder addFreighters() {
        this.airline.addFreighter(new AirbusBeluga());
        this.airline.addFreighter(new AeroSpacelinesSuperGuppy());
        return this;
    }

}
