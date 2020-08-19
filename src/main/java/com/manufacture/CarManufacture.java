package com.manufacture;

import com.manufacture.adapter.CarInterface;
import com.manufacture.enums.ModelName;
import com.manufacture.factory.CarFactory;
import com.manufacture.model.Car;

public class CarManufacture {

    public Car manufactureCar(ModelName modelName) {
        CarInterface carInterface = CarFactory.getCarObject(modelName);
        Car car = new Car();
        return carInterface.manufactureCar(car);
    }
}
