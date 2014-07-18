package com.egt.factory;

import com.egt.enums.CarType;

public abstract class Car {

    private CarType model = null;

    protected abstract void construct();

    public Car(CarType model) {
	this.model = model;
    }

    public CarType getModel() {
	return model;
    }

    public void setModel(CarType model) {
	this.model = model;
    }

}
