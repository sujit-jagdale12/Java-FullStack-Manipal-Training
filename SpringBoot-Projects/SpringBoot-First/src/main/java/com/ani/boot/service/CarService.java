package com.ani.boot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.ani.boot.entity.Car;

// @PropertySource()
@Service
public class CarService {
    @Value("${testing.accounts.ws}")
    private String website;

    @Value("${testing.accounts.mail}")
    private String mail;

    @Value("${server.port}")
    private String port;

    public void createCar(int id, String model, String make) {
        Car car = new Car();
        car.setId(id);
        car.setMake(make);
        car.setModel(model);

        System.out.println("Company website: " + website);
        System.out.println("Company Email: " + mail);
        System.out.println("Server Port: " + port);
        System.out.println(car.toString());
    }
}
