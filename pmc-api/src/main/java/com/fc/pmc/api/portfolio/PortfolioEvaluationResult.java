package com.fc.pmc.api.portfolio;

import com.fc.pmc.api.portfolio.bo.PeParams;
import java.time.Instant;
import java.util.stream.Stream;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Andrey Nakin
 */
public interface PortfolioEvaluationResult {

    @NotNull
    PeParams getParams();

    @NotNull
    Stream<Instant> getSnapshots();

    double value(
            @NotNull Instant timeAsOf
    );

}
