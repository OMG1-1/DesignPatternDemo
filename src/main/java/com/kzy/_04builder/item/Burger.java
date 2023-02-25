package com.kzy._04builder.item;

import com.kzy._04builder.packing.Packing;
import com.kzy._04builder.packing.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}