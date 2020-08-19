package com.manufacture;

import com.manufacture.adapter.CarInterface;
import com.manufacture.enums.CarFeatures;
import com.manufacture.enums.ModelName;
import com.manufacture.factory.CarFactory;
import com.manufacture.model.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CarManufactureTest {

    CarManufacture carManufacture;

    @Before
    public void setUp() throws Exception {
        carManufacture = new CarManufacture();
    }

    @Test
    public void test_should_manufactureCar() {
        Car manufactureCar = carManufacture.manufactureCar(ModelName.FERRARI);
        Assert.assertEquals(ModelName.FERRARI, manufactureCar.getModelName());
    }

    @Test
    public void test_shouldNot_manufactureCar() {
        Car manufactureCar = carManufacture.manufactureCar(ModelName.TESLA);
        Assert.assertNotEquals("ferrari", manufactureCar.getModelName());
    }

    @Test
    public void test_should_manufactureCar_tataAndTeslaCar() {
        Car manufactureCar = carManufacture.manufactureCar(ModelName.TESLA);
        Assert.assertEquals(ModelName.TESLA, manufactureCar.getModelName());
    }

    @Test
    public void test_should_manufactureCar_withFeature() {
        Car manufactureCar1 = carManufacture.manufactureCar(ModelName.TATA);
        Assert.assertEquals(CarFeatures.TO_PULL, manufactureCar1.getCarFeatures());
        Car manufactureCar2 = carManufacture.manufactureCar(ModelName.FERRARI);
        Assert.assertEquals(CarFeatures.FLY, manufactureCar2.getCarFeatures());
        Car manufactureCar3 = carManufacture.manufactureCar(ModelName.TESLA);
        Assert.assertEquals(CarFeatures.RUNING_ON_BATTERY, manufactureCar3.getCarFeatures());
    }


    @Test
    public void test_should_manufactureCar_withFeature1() {
//        ModelName modelName = mock(ModelName.class);
        CarInterface carInterface = mock(CarInterface.class);
        Car car = mock(Car.class);

        when(CarFactory.getCarObject(ModelName.FERRARI)).thenReturn(carInterface);
        when(carInterface.manufactureCar(car)).thenReturn(car);

        carManufacture.manufactureCar(ModelName.FERRARI);

    }
}
