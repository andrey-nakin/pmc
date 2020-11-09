package com.fc.util;

import java.util.Optional;
import java.util.function.Supplier;
import javax.validation.constraints.NotNull;

/**
 *
 * @author andrey
 */
public class CachingSupplier<T> implements Supplier<T> {

    private final Supplier<T> dataSrc;
    private Optional<T> value = null;

    public CachingSupplier(
            @NotNull final Supplier<T> dataSrc
    ) {
        this.dataSrc = dataSrc;
    }

    @Override
    public T get() {
        if (value == null) {
            value = Optional.ofNullable(dataSrc.get());
        }
        return value.get();
    }

}
