package com.training;

public class Application {
	 public static void main(String[] args) {
	        WeatherService servive=new WeatherServiceImplService().
	                getWeatherServiceImplPort();
	        System.out.println("Weather i goa="+servive.getWeatherByCity("Goa"));
	        System.out.println("Weather i Delhi="+servive.getWeatherByCity("Delhi"));
	        
	    }
}
