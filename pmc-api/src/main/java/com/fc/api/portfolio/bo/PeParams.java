package com.fc.api.portfolio.bo;

import com.fc.api.portfolio.PortfolioValues;
import java.time.Instant;
import java.time.Period;

/**
 *
 * @author Andrey Nakin
 */
public class PeParams {

    private Portfolio portfolio;
    private PortfolioValues portfolioValues;
    private Instant startTime, endTime;
    private Period evaluationPeriod;

    protected PeParams() {
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    protected void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public PortfolioValues getPortfolioValues() {
        return portfolioValues;
    }

    protected void setPortfolioValues(PortfolioValues portfolioValues) {
        this.portfolioValues = portfolioValues;
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

    public Period getEvaluationPeriod() {
        return evaluationPeriod;
    }

    protected void setEvaluationPeriod(Period evaluationPeriod) {
        this.evaluationPeriod = evaluationPeriod;
    }

}
