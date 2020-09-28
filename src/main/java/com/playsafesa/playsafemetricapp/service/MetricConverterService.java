package com.playsafesa.playsafemetricapp.service;

import com.playsafesa.playsafemetricapp.config.MetricEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MetricConverterService implements MetricConverter {
    @Override
    public Double kelvinToCelsius(Double number) {
        if(number != null){
            try {
                return number - MetricEnum.KELVIN_TO_CELSIUS.getNumber();
            }catch (NumberFormatException e){
                log.error("Error Occurred:[{}]", e.getMessage());
            }
        }
        return null;
    }

    @Override
    public Double poundsToKilograms(Double number) {
        if(number != null){
            try {
                return number * MetricEnum.POUNDS_TO_KILOGRAMS.getNumber();
            }catch (NumberFormatException e){
                log.error("Error Occurred:[{}]", e.getMessage());
            }
        }
        return null;

    }

    @Override
    public Double milesToKilometers(Double number) {
        if(number != null){
            try {
                return number * MetricEnum.MILES_TO_KILOMETERS.getNumber();
            }catch (NumberFormatException e){
                log.error("Error Occurred:[{}]", e.getMessage());
            }
        }
        return null;
    }
}
