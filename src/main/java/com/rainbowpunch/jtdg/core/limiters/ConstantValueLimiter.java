package com.rainbowpunch.jtdg.core.limiters;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * This limiter allows you to set a single value to be used instead of any random value.
 */
public class ConstantValueLimiter<T> extends ObjectLimiter<T> {

    private T object;

    public ConstantValueLimiter(T object) {
        this.object = object;
    }

    @Override
    protected final List<T> configureObjectList() {
        return null;
    }

    @Override
    public Supplier<T> generateSupplier(Random random) {
        return () -> this.object;
    }
}
