package com.fc.api.portfolio.bo;

import com.fc.api.portfolio.PortfolioValues;
import java.util.Objects;
import javax.validation.constraints.NotNull;

/**
 *
 * @author andrey
 */
public class PeParamsBuilder {

    private final PeParams result = new PeParams();

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

}
