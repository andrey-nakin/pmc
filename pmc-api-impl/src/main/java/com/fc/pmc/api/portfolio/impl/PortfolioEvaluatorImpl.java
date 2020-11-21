package com.fc.pmc.api.portfolio.impl;

import com.fc.pmc.api.portfolio.PortfolioEvaluationResult;
import com.fc.pmc.api.portfolio.PortfolioEvaluator;
import com.fc.pmc.api.portfolio.bo.PeParams;
import com.fc.pmc.api.security.SecurityContext;
import java.util.function.Function;
import javax.validation.constraints.NotNull;

/**
 *
 * @author andrey
 */
public class PortfolioEvaluatorImpl implements PortfolioEvaluator {

    @Override
    public <T> T evaluate(
            @NotNull final SecurityContext securityContext,
            @NotNull final PeParams params,
            @NotNull final Function<PortfolioEvaluationResult, T> mapper
    ) {
        return mapper.apply(new PortfolioEvaluationResultImpl(params));
    }

}
