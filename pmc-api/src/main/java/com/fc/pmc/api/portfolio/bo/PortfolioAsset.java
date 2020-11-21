package com.fc.pmc.api.portfolio.bo;

/**
 *
 * @author Andrey Nakin
 */
public class PortfolioAsset {

    private final AssetInfo assetInfo;

    public PortfolioAsset(AssetInfo assetInfo) {
        this.assetInfo = assetInfo;
    }

    public AssetInfo getAssetInfo() {
        return assetInfo;
    }

}
