package com.kzy._04builder.item;

import com.kzy._04builder.packing.Packing;

public interface Item {
   public String name();
   public Packing packing();
   public float price();    
}