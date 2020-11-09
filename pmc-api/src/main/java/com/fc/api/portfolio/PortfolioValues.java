package com.fc.api.portfolio;

import java.time.Instant;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Andrey Nakin
 */
public interface PortfolioValues {

    /**
     * Asset value at very moment.
     *
     * @param assetId asset ID
     * @param time moment of time
     * @return asset value at the given moment.
     */
    double assetValue(
            @NotNull Object assetId,
            @NotNull Instant time
    );

}
