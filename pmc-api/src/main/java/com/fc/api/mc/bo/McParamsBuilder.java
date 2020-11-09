package com.fc.api.mc.bo;

import com.fc.api.portfolio.bo.Portfolio;
import java.time.Period;
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
    }

    @NotNull
    public McParams build() {
        return result;
    }

    @NotNull
    public McParamsBuilder portfolio(
            @NotNull final Portfolio portfolio
    ) {
        result.setPortfolio(Objects.requireNonNull(portfolio));
        return this;
    }

}
