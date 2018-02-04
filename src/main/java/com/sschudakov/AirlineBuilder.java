package com.sschudakov;

import com.sschudakov.plane.airliner.BeechcraftStarship;
import com.sschudakov.plane.airliner.BristolBritannia;
import com.sschudakov.plane.freighter.AeroSpacelinesSuperGuppy;
import com.sschudakov.plane.freighter.AirbusBeluga;

public class AirlineBuilder {

    private Airline airline;

    public Airline getAirline() {
        return airline;
    }

    public AirlineBuilder(Airline airline) {
        this.airline = airline;
    }

    public AirlineBuilder addAirliners() {
        this.airline.addAirliner(new BeechcraftStarship());
        this.airline.addAirliner(new BristolBritannia());
        return this;
    }

    public AirlineBuilder addFreighters() {
        this.airline.addFreighter(new AirbusBeluga());
        this.airline.addFreighter(new AeroSpacelinesSuperGuppy());
        return this;
    }

}
