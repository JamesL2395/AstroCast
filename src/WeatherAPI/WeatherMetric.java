package WeatherAPI;

public interface WeatherMetric {
    /**
     * @return How good (good = 10, bad = 1) the metric is for astronomical observation.
     */
    public int getGoodnessHeuristic();

    /**
     * @return The string value of the metric to display on the UI.
     */
    public String getDisplayValue();
}
