package com.fc.api.portfolio.impl;

import com.fc.api.portfolio.PortfolioEvaluationResult;
import com.fc.api.portfolio.bo.PeParams;
import java.time.Instant;
import java.util.stream.Stream;
import javax.validation.constraints.NotNull;

/**
 *
 * @author andrey
 */
public class PortfolioEvaluationResultImpl implements PortfolioEvaluationResult {

    @NotNull
    @Override
    public PeParams getParams() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @NotNull
    @Override
    public Stream<Instant> getSnapshots() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double value(
            @NotNull final Instant timeAsOf
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
