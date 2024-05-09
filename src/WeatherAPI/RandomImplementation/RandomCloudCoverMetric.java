package WeatherAPI.RandomImplementation;

import WeatherAPI.CloudCoverMetric;

public class RandomCloudCoverMetric implements CloudCoverMetric {

    private int goodness;

    RandomCloudCoverMetric(int goodness) {
        this.goodness = goodness;
    }

    @Override
    public int getGoodnessHeuristic() {
        return goodness;
    }

    @Override
    public String getDisplayValue() {
        return switch (goodness) {
            case 1 -> "Overcast";
            case 2 -> "Overcast";
            case 3 -> "Mostly Cloudy";
            case 4 -> "Mostly Cloudy";
            case 5 -> "Partly Cloudy";
            case 6 -> "Partly Cloudy";
            case 7 -> "Mostly Clear";
            case 8 -> "Mostly Clear";
            case 9 -> "Clear Sky";
            case 10 -> "Clear Sky";
            default -> "Error: goodness out of range";
        };
    }
    
}
