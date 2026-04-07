package edu.norcocollege.cis18b.week6.mini05;

import java.util.function.Supplier;

public class FactoryBox<T> {

    private final Supplier<T> supplier;

    public FactoryBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T create() {
        return supplier.get();
    }
}
