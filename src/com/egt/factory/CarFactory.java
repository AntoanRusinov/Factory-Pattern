package com.egt.factory;

import com.egt.concrete.LuxuryCar;
import com.egt.concrete.SedanCar;
import com.egt.concrete.SportCar;
import com.egt.enums.CarType;

public class CarFactory {

    public static Car buildCad(CarType model) {

	Car car = null;

	switch (model) {
	case SPORT:
	    car = new SportCar();
	    break;

	case SEDAN:
	    car = new SedanCar();
	    break;

	case LUXURY:
	    car = new LuxuryCar();
	    break;

	default:
	    throw new RuntimeException();
	}
	return car;
    }
}
