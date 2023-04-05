package com.ani.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/weather")
public class WeatherController {

    @Value("${ad.server.url}")
    private String server;

    @GetMapping(value = "/temp") // Its not working cause it search for get jsp page
    public String getWeather() {
        return "20 temp";
    }

    @GetMapping(value = "/temp1") // Its not working cause it search for get jsp page
    public Temp getWeather1() {
        return new Temp(20);
    }

    @GetMapping(value = "/temp2", produces = "application/json") // it automatic generate application/json its not goos
                                                                 // practice
    public @ResponseBody Temp getWeather2() {
        return new Temp(32);
    }

    @GetMapping(value = "/monday", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Temp getWeather3() {
        return new Temp(22);
    }

    @GetMapping(value = "/sunday", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Temp> getWeather4() {
        Temp t = new Temp(35);
        return ResponseEntity.status(HttpStatus.OK).body(t);
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Res> save(@RequestBody Temp t) {
        Res res = new Res("success", t.getTemp() + "temp detected.");
        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @GetMapping(value = "/ads", produces = MediaType.APPLICATION_JSON_VALUE )
    public @ResponseBody ResponseEntity<Res> showAds() {
        Res res = new Res("success", "fetching ads from "+ server);
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }
}
