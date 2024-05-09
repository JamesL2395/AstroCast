package WeatherAPI.RandomImplementation;

import WeatherAPI.MoonPhaseMetric;

public class FixedMoonPhaseMetric implements MoonPhaseMetric {

    private int day;

    FixedMoonPhaseMetric(int day) {
        this.day = day;
    }

    @Override
    public int getGoodnessHeuristic() {
        return Math.max(1, Math.min(Math.round(10 * (float) Math.sin(0.1 * day)), 10));
    }

    @Override
    public String getDisplayValue() {
        return switch (day) {
            case 0 -> "Full Moon";
            case 1 -> "Full Moon";
            case 2 -> "Waning Gibbous";
            case 3 -> "Waning Gibbous";
            case 4 -> "Waning Gibbous";
            case 5 -> "Waning Gibbous";
            case 6 -> "Waning Gibbous";
            case 7 -> "Waning Gibbous";
            case 8 -> "Third Quater";
            case 9 -> "Third Quater";
            case 11 -> "Waning Crescent";
            case 12 -> "Waning Crescent";
            case 13 -> "Waning Crescent";
            case 14 -> "Waning Crescent";
            case 15 -> "Waning Crescent";
            case 16 -> "New Moon";
            case 17 -> "Waxing Crescent";
            case 18 -> "Waxing Crescent";
            case 19 -> "Waxing Crescent";
            case 20 -> "Waxing Crescent";
            case 21 -> "Waxing Crescent";
            default -> "Error: date out of range";
        };
    }

}
