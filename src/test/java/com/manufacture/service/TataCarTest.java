package com.manufacture.service;

import com.manufacture.enums.CarFeatures;
import com.manufacture.enums.ModelName;
import com.manufacture.model.Car;
import org.junit.Test;
import org.mockito.internal.verification.VerificationModeFactory;

import static org.mockito.Mockito.*;

public class TataCarTest {

    @Test
    public void test_manufactureCar_tata() {
        Car mockCar = mock(Car.class);
        TataCar tataCar = new TataCar();
        doNothing().when(mockCar).setModelName(ModelName.TATA);
        doNothing().when(mockCar).setCarFeatures(CarFeatures.TO_PULL);
        tataCar.manufactureCar(mockCar);
        verify(mockCar, VerificationModeFactory.times(1)).setModelName(ModelName.TATA);
        verify(mockCar, VerificationModeFactory.times(1)).setCarFeatures(CarFeatures.TO_PULL);
    }
}