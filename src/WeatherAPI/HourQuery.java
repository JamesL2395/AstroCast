package WeatherAPI;

/** Note: might not be necessary to make individual requests for each hour. But this is an implementation detail. */
public interface HourQuery {
    /**
     * @param daysAfterToday The hour to query. 0 would be 00:00-01:00, 1 would be 01:00-02:00, etc.
     */
    HourQueryResult queryHour(float latitude, float longitude, int hoursAfterMidnight);
}
