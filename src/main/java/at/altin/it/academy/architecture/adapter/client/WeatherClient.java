package at.altin.it.academy.architecture.adapter.client;

import at.altin.it.academy.architecture.adapter.adaptee.JsonWeatherService;
import at.altin.it.academy.architecture.adapter.adapter.WeatherInfoAdapter;
import at.altin.it.academy.architecture.adapter.service.WeatherService;
import at.altin.it.academy.architecture.adapter.adaptee.XmlWeatherService;

/**
 * Weather client using the weather service
 */
public class WeatherClient {
    // The client uses the weather service through the adapters
    WeatherService xmlWeatherService = new WeatherInfoAdapter(new XmlWeatherService());

    // The client uses the weather service through the adapters
    WeatherService jsonWeatherService = new WeatherInfoAdapter(new JsonWeatherService());

    public String getXmlWeather() {
        return xmlWeatherService.requestWeatherInfo();
    }

    public String getJsonWeather() {
        return jsonWeatherService.requestWeatherInfo();
    }
}
