package com.fc.pmc.api.mc;

import com.fc.pmc.api.mc.bo.McParams;
import java.time.Instant;
import java.util.stream.Stream;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Andrey Nakin
 */
public interface McResult {

    @NotNull
    McParams getParams();

    int getNumOfRuns();

    double endingValue(
            double quantile
    );

    @NotNull
    Stream<Instant> getSnapshots();

    double value(
            @NotNull Instant timeAsOf,
            double quantile
    );

}
