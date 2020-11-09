package com.fc.api.portfolio.bo;

import com.fc.api.portfolio.PortfolioValues;

/**
 *
 * @author Andrey Nakin
 */
public class PeParams {

    private Portfolio portfolio;
    private PortfolioValues portfolioValues;

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

}
