package com.training.service;


import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.training.ifaces.WeatherService;
import com.training.model.Weather;
import com.training.model.WeatherRapper;
@WebService(endpointInterface ="com.training.ifaces.WeatherService")
public class WeatherServiceImpl  implements WeatherService{

	@Override
    @WebResult(name="current weather")
    public Weather getWeatherByCity(@WebParam(name="cityName") String cityName) {
		Weather weather=new Weather(cityName,32,27,60);
        if(cityName.equalsIgnoreCase("Goa")) {
            weather=new Weather(cityName,23,27,50);
            
        }
        return weather;
    }

	@Override
	@WebMethod
	public WeatherRapper getWeatherByState(String stateName) {
		List<Weather> list=new ArrayList<Weather>();
		list.add(new Weather("banglore",32,27,60));
		list.add(new Weather("mandya",12,32,50));
		WeatherRapper wr=new WeatherRapper(list);
		return wr;
	}
}
