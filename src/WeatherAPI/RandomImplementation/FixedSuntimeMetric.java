package WeatherAPI.RandomImplementation;

import WeatherAPI.SuntimeMetric;

public class FixedSuntimeMetric implements SuntimeMetric {

    private int day;

    FixedSuntimeMetric(int day) {
        this.day = day;
    }

    @Override
    public int getGoodnessHeuristic() {
        return Math.max(6 - day / 6, 0);
    }

    @Override
    public String getDisplayValue() {
        return switch (day) {
            case 0 -> "04:50-21:01";
            case 1 -> "04:49-21:02";
            case 2 -> "04:48-21:03";
            case 3 -> "04:47-21:04";
            case 4 -> "04:46-21:05";
            case 5 -> "04:45-21:06";
            case 6 -> "04:44-21:07";
            case 7 -> "04:43-21:08";
            case 8 -> "04:42-21:09";
            case 9 -> "04:41-21:10";
            case 11 -> "04:41-21:10";
            case 12 -> "04:40-21:11";
            case 13 -> "04:39-21:11";
            case 14 -> "04:39-21:12";
            case 15 -> "04:38-21:12";
            case 16 -> "04:38-21:13";
            case 17 -> "04:37-21:13";
            case 18 -> "04:37-21:14";
            case 19 -> "04:36-21:14";
            case 20 -> "04:36-21:15";
            case 21 -> "04:35-21:15";
            default -> "Error: date out of range";
        };
    }

}
