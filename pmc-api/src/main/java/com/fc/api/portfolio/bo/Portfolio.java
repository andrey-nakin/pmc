package com.fc.api.portfolio.bo;

import java.util.Collection;

/**
 *
 * @author Andrey Nakin
 */
public class Portfolio {

    private final Collection<PortfolioAsset> assets;

    public Portfolio(Collection<PortfolioAsset> assets) {
        this.assets = assets;
    }

    public Collection<PortfolioAsset> getAssets() {
        return assets;
    }

}
