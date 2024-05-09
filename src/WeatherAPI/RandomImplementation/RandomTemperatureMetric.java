package WeatherAPI.RandomImplementation;

import WeatherAPI.TemperatureMetric;

public class RandomTemperatureMetric implements TemperatureMetric {

    private int goodness;

    RandomTemperatureMetric(int goodness) {
        this.goodness = goodness;
    }

    @Override
    public int getGoodnessHeuristic() {
        return goodness;
    }

    @Override
    public String getDisplayValue() {
        return switch (goodness) {
            case 1 -> "10°C";
            case 2 -> "11°C";
            case 3 -> "12°C";
            case 4 -> "13°C";
            case 5 -> "14°C";
            case 6 -> "15°C";
            case 7 -> "16°C";
            case 8 -> "17°C";
            case 9 -> "18°C";
            case 10 -> "19°C";
            default -> "Error: goodness out of range";
        };
    }

}
