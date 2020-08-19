package com.manufacture.service;

import com.manufacture.enums.CarFeatures;
import com.manufacture.enums.ModelName;
import com.manufacture.model.Car;
import org.junit.Test;
import org.mockito.internal.verification.VerificationModeFactory;

import static org.mockito.Mockito.*;

public class FerrariCarTest {

    @Test
    public void test_manufactureCar_ferrari() {
        Car mockCar = mock(Car.class);
        FerrariCar ferrariCar = new FerrariCar();
        doNothing().when(mockCar).setModelName(ModelName.FERRARI);
        doNothing().when(mockCar).setCarFeatures(CarFeatures.FLY);
        ferrariCar.manufactureCar(mockCar);
        verify(mockCar, VerificationModeFactory.times(1)).setModelName(ModelName.FERRARI);
        verify(mockCar, VerificationModeFactory.times(1)).setCarFeatures(CarFeatures.FLY);
    }
}