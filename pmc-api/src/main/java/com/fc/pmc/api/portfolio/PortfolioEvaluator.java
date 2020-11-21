package com.fc.pmc.api.portfolio;

import com.fc.pmc.api.portfolio.bo.PeParams;
import com.fc.pmc.api.security.SecurityContext;
import java.util.function.Function;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Andrey Nakin
 */
public interface PortfolioEvaluator {

    <T> T evaluate(
            @NotNull SecurityContext securityContext,
            @NotNull PeParams params,
            @NotNull Function<PortfolioEvaluationResult, T> mapper
    );

}
