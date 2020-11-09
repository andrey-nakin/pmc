package com.fc.api.mc.bo;

import com.fc.api.portfolio.bo.Portfolio;
import java.util.Objects;
import javax.validation.constraints.NotNull;

/**
 *
 * @author andrey
 */
public class McParamsBuilder {

    private final McParams result = new McParams();

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
