package at.altin.it.academy.architecture.adapter.adaptee;

/**
 * Adaptee #1 providing weather information in XML format
 */
public class XmlWeatherService implements WeatherInfoAdaptee<String>{
    @Override
    public String provideWeatherInfo() {
        // Simulated XML data retrieval
        return "<weather><temperature>25°C</temperature><condition>Sunny</condition></weather>";
    }
}
