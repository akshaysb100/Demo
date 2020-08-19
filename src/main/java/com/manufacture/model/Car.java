package com.manufacture.model;

import com.manufacture.enums.CarFeatures;
import com.manufacture.enums.ModelName;

public class Car {
    public ModelName modelName;
    public CarFeatures carFeatures;

    public ModelName getModelName() {
        return modelName;
    }

    public void setModelName(ModelName modelName) {
        this.modelName = modelName;
    }

    public CarFeatures getCarFeatures() {
        return carFeatures;
    }

    public void setCarFeatures(CarFeatures carFeatures) {
        this.carFeatures = carFeatures;
    }
}
