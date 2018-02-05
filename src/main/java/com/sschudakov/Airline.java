package com.sschudakov;

import com.sschudakov.plane.airliner.Airliner;
import com.sschudakov.plane.freighter.Freighter;

import java.util.ArrayList;
import java.util.Collection;


/**
 * Here is defined the Airline class
 * that represents an Airline company.
 * The class contains collection of
 * Freighters and collections of airliners.
 * There are getters on the fields.
 * There are also addFreighter() and
 * addAirliner() methods that encapsulate
 * work with freighters and airliners so that
 * they are not directly accessed from outside.
 *
 * @author Semen Chudakov
 */
public class Airline {

    private Collection<Freighter> freighters;
    private Collection<Airliner> airliners;

    public Airline() {
        this.freighters = new ArrayList<>();
        this.airliners = new ArrayList<>();
    }

    public Collection<Freighter> getFreighters() {
        return freighters;
    }

    public Collection<Airliner> getAirliners() {
        return airliners;
    }


    /**
     * Methods that enables adding
     * freighters to an Airline company
     */
    public void addFreighter(Freighter freighter) {
        this.freighters.add(freighter);
    }

    /**
     * Methods that enables adding
     * airliners to an Airline company
     */
    public void addAirliner(Airliner airliner) {
        this.airliners.add(airliner);
    }
}
