package WeatherAPI.RandomImplementation;

import WeatherAPI.MoonAltitudeMetric;

public class RandomMoonAltitudeMetric implements MoonAltitudeMetric {

    private int height;

    RandomMoonAltitudeMetric(int height) {
        this.height = height;
    }

    @Override
    public int getGoodnessHeuristic() {
        return height;
    }

    @Override
    public String getDisplayValue() {
        return switch (height) {
            case 1 -> "90°";
            case 2 -> "80°";
            case 3 -> "60°";
            case 4 -> "40°";
            case 5 -> "30°";
            case 6 -> "20°";
            case 7 -> "10°";
            case 8 -> "-10°";
            case 9 -> "-30°";
            case 10 -> "-50°";
            default -> "Error: goodness out of range";
        };
    }

}
