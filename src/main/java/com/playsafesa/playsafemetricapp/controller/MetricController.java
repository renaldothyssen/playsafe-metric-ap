package com.playsafesa.playsafemetricapp.controller;

import com.playsafesa.playsafemetricapp.service.MetricConverterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/metric")
public class MetricController {

    @Autowired
    MetricConverterService metricConverterService;

    @GetMapping(value = "/kelvintocelsius")
    public ResponseEntity<String> kelvinToCelsius(@RequestParam Double id){
         if(id == null){
             throw new IllegalArgumentException("Error: Input is empty");
         }
        return ResponseEntity.ok(id +" Kelvin is equal to " + metricConverterService.kelvinToCelsius(id) + " Celsius");
    }

    @GetMapping(value = "/poundstokilograms")
    public ResponseEntity<String> poundsToKilograms(@RequestParam Double id){
        if(id == null){
            throw new IllegalArgumentException("Error: Input is empty");
        }
        return ResponseEntity.ok(id +" Pounds is equal to " + metricConverterService.poundsToKilograms(id) + " Kilograms");
    }

    @GetMapping(value = "/milestokilometers")
    public ResponseEntity<String> milesToKilometers(@RequestParam Double id){
        if(id == null){
            throw new IllegalArgumentException("Error: Input is empty");
        }
        return ResponseEntity.ok(id +" Miles is equal to " + metricConverterService.milesToKilometers(id) + " Kilometers");
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public final String exceptionHandlerIllegalArgumentException(final IllegalArgumentException e){
        return '"' + e.getMessage() + '"';
    }

}
