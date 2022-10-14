package com.training;

import javax.xml.ws.Endpoint;

import com.training.services.NumberServiceImpl;



public class PublisherNumber {
	public static void main(String[] args) {
	    Endpoint.publish("http://localhost:8888/numbertotext", new NumberServiceImpl());
        System.out.println("Service Started");
	}
}
