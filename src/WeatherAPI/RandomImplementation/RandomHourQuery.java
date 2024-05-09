package WeatherAPI.RandomImplementation;

import WeatherAPI.HourQuery;
import WeatherAPI.HourQueryResult;

public class RandomHourQuery implements HourQuery {

    @Override
    public HourQueryResult queryHour(float latitude, float longitude, int hoursAfterMidnight) {
        float noise = noise(hoursAfterMidnight / 8f, latitude + longitude);
        float noise2 = noise(hoursAfterMidnight, latitude + longitude) - 0.5f;
        int seed = Math.round(1 + 9 * noise);
        return new HourQueryResult(
            new RandomCloudCoverMetric(seed),
            new RandomPrecipitationMetric(seed),
            new RandomTemperatureMetric(Math.max(1, Math.round(10 * (float) Math.pow(Math.sin(hoursAfterMidnight / 8f + 0.5f * noise2), 2)))),
            new RandomMoonAltitudeMetric(11 - seed)
        );
    }

    private float fract(float x) {
        return x - (float) Math.floor(x);
    }
    
    private float rand(float x, float seed) {
        return fract(999 * (float) Math.sin(x + seed));
    }

    private float randStep(float x, float seed) {
        return rand((float) Math.floor(x), seed);
    }

    private float smoothstep(float x) {
        return x * x * (1 - 2 * (x - 1));
    }

    private float smoothsaw(float x) {
        return smoothstep(fract(x));
    }

    //* https://www.desmos.com/calculator/eis38ofxxr */
    private float noise(float x, float seed) {
        return randStep(x, seed) * smoothsaw(x) + randStep(x - 1, seed) * (1 - smoothsaw(x - 1));
    }
}