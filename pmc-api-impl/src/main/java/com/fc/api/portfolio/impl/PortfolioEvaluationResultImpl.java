package com.fc.api.portfolio.impl;

import com.fc.api.portfolio.PortfolioEvaluationResult;
import com.fc.api.portfolio.bo.PeParams;
import com.fc.util.CachingSupplier;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.validation.constraints.NotNull;

/**
 *
 * @author andrey
 */
public class PortfolioEvaluationResultImpl implements PortfolioEvaluationResult {

    private final PeParams params;
    private final CachingSupplier<List<Instant>> snapshots;

    public PortfolioEvaluationResultImpl(PeParams params) {
        this.params = params;
        this.snapshots = new CachingSupplier<>(this::makeSnapshots);
    }

    @NotNull
    @Override
    public PeParams getParams() {
        return params;
    }

    @NotNull
    @Override
    public Stream<Instant> getSnapshots() {
        return snapshots.get().stream();
    }

    @Override
    public double value(
            @NotNull final Instant timeAsOf
    ) {
        return params.getPortfolio().getAssets()
                .stream()
                .mapToDouble(a -> params.getPortfolioValues().assetValue(a.getAssetInfo(), timeAsOf))
                .sum();

    }

    private List<Instant> makeSnapshots() {
        final List<Instant> result = new ArrayList<>();

        result.add(params.getStartTime());

        Instant t = params.getStartTime();
        for (;;) {

            t = t.plus(params.getEvaluationPeriod());
            if (t.isBefore(params.getEndTime())) {
                result.add(t);
            } else {
                break;
            }
        }

        result.add(params.getEndTime());

        return result;
    }

}
