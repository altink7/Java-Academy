package at.altin.it.academy.architecture.adapter.adapter;

import at.altin.it.academy.architecture.adapter.adaptee.JsonWeatherService;
import at.altin.it.academy.architecture.adapter.adaptee.WeatherInfoAdaptee;
import at.altin.it.academy.architecture.adapter.adaptee.XmlWeatherService;
import at.altin.it.academy.architecture.adapter.service.WeatherService;

/**
 * Adapter #1 converting data to a common format
 */
public class WeatherInfoAdapter implements WeatherService {
    private final WeatherInfoAdaptee<String> weatherInfoAdaptee;

    public WeatherInfoAdapter(WeatherInfoAdaptee<String> weatherInfoAdaptee) {
        this.weatherInfoAdaptee = weatherInfoAdaptee;
    }

    @Override
    public String requestWeatherInfo() {
        String commonFormatData;

        if(weatherInfoAdaptee instanceof XmlWeatherService) {
            // Convert XML to a common format (e.g., JSON)
            commonFormatData = convertXmlToCommonFormat(weatherInfoAdaptee.provideWeatherInfo());
        } else if(weatherInfoAdaptee instanceof JsonWeatherService) {
            // Adapting JSON format to the common format
            commonFormatData = weatherInfoAdaptee.provideWeatherInfo();
            // No need for conversion as JSON is already in a common format
        } else {
            // Unsupported adaptee
            throw new UnsupportedOperationException("Unsupported adaptee");
        }

        return commonFormatData;
    }

    private String convertXmlToCommonFormat(String xmlData) {
        // Simulated conversion logic (e.g., using a library like Jackson)
        return "{\"temperature\":\"25°C\",\"condition\":\"Sunny\"}";
    }
}