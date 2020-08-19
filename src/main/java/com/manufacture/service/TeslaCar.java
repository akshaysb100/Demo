package com.manufacture.service;

import com.manufacture.adapter.CarInterface;
import com.manufacture.enums.CarFeatures;
import com.manufacture.enums.ModelName;
import com.manufacture.model.Car;

public class TeslaCar implements CarInterface {
    @Override
    public Car manufactureCar(Car car) {
        car.setModelName(ModelName.TESLA);
        car.setCarFeatures(CarFeatures.RUNING_ON_BATTERY);
        return car;
    }
}
