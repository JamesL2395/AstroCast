package WeatherAPI.RandomImplementation;

import WeatherAPI.PrecipitationMetric;

public class RandomPrecipitationMetric implements PrecipitationMetric {

    private int goodness;

    RandomPrecipitationMetric(int goodness) {
        this.goodness = goodness;
    }

    @Override
    public int getGoodnessHeuristic() {
        return goodness;
    }

    @Override
    public String getDisplayValue() {
        return switch (goodness) {
            case 1 -> "5.0mm";
            case 2 -> "2.0mm";
            case 3 -> "1.0mm";
            case 4 -> "0.5mm";
            case 5 -> "0.2mm";
            case 6 -> "0.1mm";
            case 7 -> "Trace";
            case 8 -> "Trace";
            case 9 -> "Trace";
            case 10 -> "Trace";
            default -> "Error: goodness out of range";
        };
    }

}
