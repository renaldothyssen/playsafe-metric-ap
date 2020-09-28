package com.playsafesa.playsafemetricapp.controller;

import com.playsafesa.playsafemetricapp.service.MetricConverterService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(value = MetricController.class)
class MetricControllerTest {

    @Autowired
    MockMvc mockMvc;
    @MockBean
    MetricConverterService metricConverterService;

    @Test
    void when_kelvinToCelsius_valid_then_success() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/metric/kelvintocelsius?id=600.0")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assert.assertNotNull(mvcResult);
        Assert.assertEquals(200,status);
    }
    @Test
    void when_kelvinToCelsius_valid_then_failure() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/metric/kelvintocelsius?id=")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assert.assertNotNull(mvcResult);
        Assert.assertEquals(400,status);
    }

    @Test
    void when_poundsToKilograms_valid_then_success() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/metric/poundstokilograms?id=600.0")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assert.assertNotNull(mvcResult);
        Assert.assertEquals(200,status);
    }
    @Test
    void when_poundsToKilograms_valid_then_failure() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/metric/poundstokilograms?id=")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assert.assertNotNull(mvcResult);
        Assert.assertEquals(400,status);
    }

    @Test
    void when_milesToKilometers_valid_then_success() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/metric/milestokilometers?id=600.0")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assert.assertNotNull(mvcResult);
        Assert.assertEquals(200,status);
    }
    @Test
    void when_milesToKilometers_valid_then_failure() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/metric/milestokilometers?id=")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assert.assertNotNull(mvcResult);
        Assert.assertEquals(400,status);
    }
}