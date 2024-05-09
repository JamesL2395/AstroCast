package WeatherAPI;

public class HourQueryResult {
    private CloudCoverMetric cloudCoverMetric;
    private PrecipitationMetric precipitationMetric;
    private TemperatureMetric temperatureMetric;
    private MoonAltitudeMetric moonAltitudeMetric;

    public HourQueryResult(CloudCoverMetric cloudCoverMetric, PrecipitationMetric precipitationMetric,
            TemperatureMetric temperatureMetric, MoonAltitudeMetric moonAltitudeMetric) {
        this.cloudCoverMetric = cloudCoverMetric;
        this.precipitationMetric = precipitationMetric;
        this.temperatureMetric = temperatureMetric;
        this.moonAltitudeMetric = moonAltitudeMetric;
    }

    public CloudCoverMetric getCloudCoverMetric() {
        return cloudCoverMetric;
    }

    public PrecipitationMetric getPrecipitationMetric() {
        return precipitationMetric;
    }

    public TemperatureMetric getTemperatureMetric() {
        return temperatureMetric;
    }

    public MoonAltitudeMetric getMoonAltitudeMetric() {
        return moonAltitudeMetric;
    }
}
