package com.self.promgrafanapoc.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

    private static final Counter totalErrorEvents = Metrics.counter("helloCounter","counter", "");

    @RequestMapping(method = RequestMethod.GET)
    public void test(){
        Metrics.counter("helloCounter", "counter", "").increment();
    }
}
