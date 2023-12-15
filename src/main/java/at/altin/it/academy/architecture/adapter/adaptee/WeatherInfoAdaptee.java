package at.altin.it.academy.architecture.adapter.adaptee;

import java.io.Serializable;

/**
 * Adaptee interface providing weather information in a specific format
 * @param <T> the type of the weather data
 */
public interface WeatherInfoAdaptee<T extends Serializable> {
    T provideWeatherInfo();
}
