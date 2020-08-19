package com.manufacture.service;

import com.manufacture.adapter.CarInterface;
import com.manufacture.enums.CarFeatures;
import com.manufacture.enums.ModelName;
import com.manufacture.model.Car;

public class TataCar implements CarInterface {
    @Override
    public Car manufactureCar(Car car) {
        car.setModelName(ModelName.TATA);
        car.setCarFeatures(CarFeatures.TO_PULL);
        return car;
    }
}
