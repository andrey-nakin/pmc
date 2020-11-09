package com.fc.api.portfolio.bo;

import com.fc.api.security.SecurityContext;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Andrey Nakin
 */
public interface PortfolioEvaluator {

    @NotNull
    PeResult evaluate(
            @NotNull SecurityContext securityContext,
            @NotNull Portfolio portfolio,
            @NotNull PeParams params
    );

}
