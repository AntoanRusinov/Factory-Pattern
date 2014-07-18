package com.egt.concrete;

import com.egt.enums.CarType;
import com.egt.factory.Car;

public class SedanCar extends Car {

    public SedanCar() {
	super(CarType.SEDAN);
	construct();
    }

    @Override
    protected void construct() {
	System.out.println("Sedan is constructed");
    }

}
