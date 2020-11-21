package com.fc.pmc.api.mc.bo;

import com.fc.pmc.api.portfolio.bo.Portfolio;
import java.time.Instant;
import java.time.Period;
import java.time.temporal.ValueRange;
import java.util.Objects;
import javax.validation.constraints.NotNull;

/**
 *
 * @author andrey
 */
public class McParamsBuilder {

    private static final int DEF_VALUE_PERIOD_IN_YEARS = 1;

    private final McParams result;

    public McParamsBuilder() {
        result = new McParams();

        result.setValuePeriod(Period.ofYears(DEF_VALUE_PERIOD_IN_YEARS));
        result.setStartTime(Instant.now());
    }

    @NotNull
    public McParams build() {
        if (result.getEndTime() == null) {
            throw new IllegalStateException("End time is not set");
        }
        return result;
    }

    @NotNull
    public McParamsBuilder portfolio(
            @NotNull final Portfolio portfolio
    ) {
        result.setPortfolio(Objects.requireNonNull(portfolio));
        return this;
    }

    @NotNull
    public McParamsBuilder valuePeriod(
            @NotNull final Period period
    ) {
        result.setValuePeriod(Objects.requireNonNull(period));
        return this;
    }

    @NotNull
    public McParamsBuilder timeHorizon(
            @NotNull final Instant startTime,
            @NotNull final Instant endTime
    ) {
        if (!Objects.requireNonNull(startTime).isBefore(Objects.requireNonNull(endTime))) {
            throw new IllegalArgumentException("start time must be before end time");
        }
        result.setStartTime(startTime);
        result.setEndTime(endTime);
        return this;
    }

    @NotNull
    public McParamsBuilder observationTimeHorizon(
            @NotNull final Instant startTime,
            @NotNull final Instant endTime
    ) {
        if (!Objects.requireNonNull(startTime).isBefore(Objects.requireNonNull(endTime))) {
            throw new IllegalArgumentException("start time must be before end time");
        }
        result.setObservationStartTime(startTime);
        result.setObservationEndTime(endTime);
        return this;
    }

}
