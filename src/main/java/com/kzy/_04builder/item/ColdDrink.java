package com.kzy._04builder.item;

import com.kzy._04builder.packing.Packing;
import com.kzy._04builder.packing.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}