package com.training;

import javax.xml.ws.Endpoint;

import com.training.service.WeatherServiceImpl;

public class Publisher {
	public static void main(String[] args) {
        Endpoint.publish("http://localhost:8081/weather", new WeatherServiceImpl());
        System.out.println("Service Started");
    }
}
