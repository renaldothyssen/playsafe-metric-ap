package com.playsafesa.playsafemetricapp.config;

import lombok.Getter;
/*
MetricEnum class for storing constant values to convert a unit to a metric system.
 */
@Getter
public enum MetricEnum {

    KELVIN_TO_CELSIUS(273.15),
    POUNDS_TO_KILOGRAMS(0.45),
    MILES_TO_KILOMETERS(1.60);

    private Double number;
    MetricEnum(final Double number){
        this.number = number;
    }
}
