package com.egt.concrete;

import com.egt.enums.CarType;
import com.egt.factory.Car;

public class SportCar extends Car {

    public SportCar() {
	super(CarType.SPORT);
	construct();
    }

    @Override
    protected void construct() {
	System.out.println("Sport car is created!");
    }

}
