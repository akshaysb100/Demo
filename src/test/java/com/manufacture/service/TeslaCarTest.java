package com.manufacture.service;

import com.manufacture.enums.CarFeatures;
import com.manufacture.enums.ModelName;
import com.manufacture.model.Car;
import org.junit.Test;
import org.mockito.internal.verification.VerificationModeFactory;

import static org.mockito.Mockito.*;

public class TeslaCarTest {

    @Test
    public void test_manufactureCar_tesla() {
        Car mockCar = mock(Car.class);
        TeslaCar teslaCar = new TeslaCar();
        doNothing().when(mockCar).setModelName(ModelName.TESLA);
        doNothing().when(mockCar).setCarFeatures(CarFeatures.RUNING_ON_BATTERY);
        teslaCar.manufactureCar(mockCar);
        verify(mockCar, VerificationModeFactory.times(1)).setModelName(ModelName.TESLA);
        verify(mockCar, VerificationModeFactory.times(1)).setCarFeatures(CarFeatures.RUNING_ON_BATTERY);
    }
}