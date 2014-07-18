package com.egt.test;

import com.egt.enums.CarType;
import com.egt.factory.CarFactory;

public class TestFactoryPattern {

    public static void main(String[] args) {

	System.out.println(CarFactory.buildCad(CarType.LUXURY));
	System.out.println(CarFactory.buildCad(CarType.SEDAN));
	System.out.println(CarFactory.buildCad(CarType.SPORT));

    }

}
