package at.altin.it.academy.architecture.adapter.adaptee;

/**
 * Adaptee #2 providing weather information in JSON format
 */
public class JsonWeatherService implements WeatherInfoAdaptee<String>{

    @Override
    public String provideWeatherInfo() {
        return "{\"temperature\":\"20°C\",\"condition\":\"Cloudy\"}";
    }
}
