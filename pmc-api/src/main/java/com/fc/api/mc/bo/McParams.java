package com.fc.api.mc.bo;

import com.fc.api.portfolio.bo.Portfolio;
import java.time.Instant;
import java.time.Period;

/**
 *
 * @author Andrey Nakin
 */
public class McParams {

    private Portfolio portfolio;
    private Period valuePeriod;
    private Instant startTime, endTime;
    private Instant observationStartTime, observationEndTime;

    protected McParams() {
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    protected void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Period getValuePeriod() {
        return valuePeriod;
    }

    protected void setValuePeriod(Period valuePeriod) {
        this.valuePeriod = valuePeriod;
    }

    public Instant getStartTime() {
        return startTime;
    }

    protected void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    protected void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }

    public Instant getObservationStartTime() {
        return observationStartTime;
    }

    protected void setObservationStartTime(Instant observationStartTime) {
        this.observationStartTime = observationStartTime;
    }

    public Instant getObservationEndTime() {
        return observationEndTime;
    }

    protected void setObservationEndTime(Instant observationEndTime) {
        this.observationEndTime = observationEndTime;
    }

}
