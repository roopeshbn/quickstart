package com.task;

public class Application {
	public static void main(String[] args) {
		WeatherService service=new WeatherServiceImplService().getWeatherServiceImplPort();
		WeatherRapper weatherList=service.getWeatherByState("banglore");
		weatherList.getList().forEach(System.out::println);
	     System.out.println(service.getWeatherByCity("mandya"));
	}
	
}