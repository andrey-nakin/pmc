package com.fc.api.portfolio.bo;

import com.fc.api.mc.bo.McParamsBuilder;
import com.fc.api.portfolio.PortfolioValues;
import java.time.Instant;
import java.time.Period;
import java.util.Objects;
import javax.validation.constraints.NotNull;

/**
 *
 * @author andrey
 */
public class PeParamsBuilder {

    private static final int DEF_EVAL_PERIOD_IN_YEARS = 1;

    private final PeParams result;

    public PeParamsBuilder() {
        result = new PeParams();

        result.setEvaluationPeriod(Period.ofYears(DEF_EVAL_PERIOD_IN_YEARS));
    }

    @NotNull
    public PeParamsBuilder portfolio(
            @NotNull final Portfolio portfolio,
            @NotNull final PortfolioValues portfolioValues
    ) {
        result.setPortfolio(Objects.requireNonNull(portfolio));
        result.setPortfolioValues(Objects.requireNonNull(portfolioValues));
        return this;
    }

    @NotNull
    public PeParams build() {
        return result;
    }

    @NotNull
    public PeParamsBuilder timeHorizon(
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
    public PeParamsBuilder evaluationPeriod(
            @NotNull final Period period
    ) {
        result.setEvaluationPeriod(Objects.requireNonNull(period));
        return this;
    }

}
