package com.training.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Weather {
	
	private String city;
	private double maxTemp;
	private double minTemp;
	private double humidity;
	
	public Weather() {
		super();
	}
	
	public Weather(String city, double maxTemp, double minTemp, double humidity) {
		super();
		this.city = city;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.humidity = humidity;
	}

	@Override
	public String toString() {
		return "Weather [city=" + city + ", maxTemp=" + maxTemp + ", minTemp=" + minTemp + ", humidity=" + humidity
				+ "]";
	}
	
	
	
}
