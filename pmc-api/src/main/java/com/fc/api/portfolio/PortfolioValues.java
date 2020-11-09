package com.fc.api.portfolio;

import java.time.Instant;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Andrey Nakin
 */
public interface PortfolioValues {

    double assetFloorValue(
            @NotNull Object assetId,
            @NotNull Instant time
    );

}
