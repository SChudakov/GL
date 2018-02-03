package com.sschudakov;

import com.sschudakov.plane.airliner.Airliner;
import com.sschudakov.plane.freighter.Freighter;

import java.util.Collection;

public class Airline {

    private Collection<Freighter> freighters;
    private Collection<Airliner> airliners;

    public Collection<Freighter> getFreighters() {
        return freighters;
    }

    public Collection<Airliner> getAirliners() {
        return airliners;
    }

    public void setFreighters(Collection<Freighter> freighters) {
        this.freighters = freighters;
    }

    public void setAirliners(Collection<Airliner> airliners) {
        this.airliners = airliners;
    }

    public void addFreighter(Freighter freighter) {
        this.freighters.add(freighter);
    }

    public void addAirliner(Airliner airliner) {
        this.airliners.add(airliner);
    }
}
