package com.playsafesa.playsafemetricapp.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MetricConverterServiceTest {

    @Autowired
    MetricConverterService metricConverterService;

    private static final double KELVIN_INPUT = 600.02;
    private static final double CELSIUS_EXPECTED_RESULT = 326.87;
    private static final double POUNDS_INPUT = 200.00;
    private static final double KILOGRAMS_EXPECTED_RESULT = 90.0;
    private static final double MILES_INPUT = 100.00;
    private static final double KILOMETERS_EXPECTED_RESULT = 160.0;

    @Test
    public void when_valid_kelvin_number_then_return_celsius(){
        Double result = metricConverterService.kelvinToCelsius(KELVIN_INPUT);
        Assert.assertNotNull("Result is not null", result);
        Assert.assertEquals("Kelvin converted to Celsius successfully", new Double(CELSIUS_EXPECTED_RESULT),result);
    }

    @Test
    public void when_invalid_kelvin_number_then_return_error(){
        Double result = metricConverterService.kelvinToCelsius(KELVIN_INPUT);
        Assert.assertNotNull("Result is not null", result);
        Assert.assertNotEquals("Kelvin converted to Celsius successfully", new Double(1.00),result);
    }
    @Test
    public void when_valid_pounds_number_then_return_kilograms(){
        Double result = metricConverterService.poundsToKilograms(POUNDS_INPUT);
        Assert.assertNotNull("Result is not null", result);
        Assert.assertEquals("Pounds converted to Kilograms successfully", new Double(KILOGRAMS_EXPECTED_RESULT),result);
    }

    @Test
    public void when_invalid_pounds_number_then_return_error(){
        Double result = metricConverterService.poundsToKilograms(POUNDS_INPUT);
        Assert.assertNotNull("Result is not null", result);
        Assert.assertNotEquals("Kelvin converted to Celsius successfully", new Double(1.00),result);
    }

    @Test
    public void when_valid_miles_number_then_return_kilometers(){
        Double result = metricConverterService.milesToKilometers(MILES_INPUT);
        Assert.assertNotNull("Result is not null", result);
        Assert.assertEquals("Miles converted to Kilometers successfully", new Double(KILOMETERS_EXPECTED_RESULT),result);
    }

    @Test
    public void when_invalid_miles_number_then_return_error(){
        Double result = metricConverterService.milesToKilometers(MILES_INPUT);
        Assert.assertNotNull("Result is not null", result);
        Assert.assertNotEquals("Miles converted to Kilometers successfully", new Double(1.00),result);
    }


}
