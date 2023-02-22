package com.adibahsan.SOLID.InterfaceSegregation;

import com.adibahsan.SOLID.InterfaceSegregation.segregated.BearCleaner;
import com.adibahsan.SOLID.InterfaceSegregation.segregated.BearFeeder;

public class BearSegregated implements BearFeeder, BearCleaner {
    @Override
    public void washTheBear() {
        System.out.println("Washing Bear");
    }

    @Override
    public void feedTheBear() {
        System.out.println("Feeding Bear");

    }
}
//With Segreagation

