package at.altin.it.academy.architecture.adapter;

import at.altin.it.academy.architecture.adapter.client.WeatherClient;

public class Simulation {
    public static void main(String[] args) {
        WeatherClient weatherClient = new WeatherClient();

        System.out.println(weatherClient.getXmlWeather());
        System.out.println(weatherClient.getJsonWeather());
    }
}

