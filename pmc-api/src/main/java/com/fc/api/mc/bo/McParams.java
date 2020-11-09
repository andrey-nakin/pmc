package com.fc.api.mc.bo;

import com.fc.api.portfolio.bo.Portfolio;
import java.time.Period;

/**
 *
 * @author Andrey Nakin
 */
public class McParams {

    private Portfolio portfolio;
    private Period valuePeriod;

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

}
