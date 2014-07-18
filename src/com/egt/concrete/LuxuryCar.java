package com.egt.concrete;

import com.egt.enums.CarType;
import com.egt.factory.Car;

public class LuxuryCar extends Car {

    public LuxuryCar() {
	super(CarType.LUXURY);
	construct();
    }

    @Override
    protected void construct() {
	System.out.println("Constructing new lucury car");
    }

}
