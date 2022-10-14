package com.training.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType
public class WeatherRapper {
	private List<Weather> list;

	public WeatherRapper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WeatherRapper(List<Weather> list) {
		super();
		this.list = list;
	}

	public List<Weather> getList() {
		return list;
	}

	public void setList(List<Weather> list) {
		this.list = list;
	}
	
	
}
