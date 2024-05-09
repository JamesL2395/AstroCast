package WeatherAPI;

public class DayQueryResult {
    /** Assuming for now hourQueryResults[n] = query result between (n) and (n+1) hours, starting from midnight. */
    private HourQueryResult[] hourQueryResults;
    private MoonPhaseMetric moonPhaseMetric;
    private SuntimeMetric suntimeMetric;

    public DayQueryResult(HourQueryResult[] hourQueryResults, MoonPhaseMetric moonPhaseMetric,
            SuntimeMetric suntimeMetric) {
        this.hourQueryResults = hourQueryResults;
        this.moonPhaseMetric = moonPhaseMetric;
        this.suntimeMetric = suntimeMetric;
    }

    public HourQueryResult[] getHourQueryResults() {
        return hourQueryResults;
    }

    public MoonPhaseMetric getMoonPhaseMetric() {
        return moonPhaseMetric;
    }

    public SuntimeMetric getSuntimeMetric() {
        return suntimeMetric;
    }
}
