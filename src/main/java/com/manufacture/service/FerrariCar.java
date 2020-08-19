package com.manufacture.service;

import com.manufacture.adapter.CarInterface;
import com.manufacture.enums.CarFeatures;
import com.manufacture.enums.ModelName;
import com.manufacture.model.Car;

public class FerrariCar implements CarInterface {
    @Override
    public Car manufactureCar(Car car) {
        car.setModelName(ModelName.FERRARI);
        car.setCarFeatures(CarFeatures.FLY);
        return car;
    }
}
