package WeatherAPI;

public interface DayQuery {
    /**
     * @param daysAfterToday The day to query. 0 would be today, 1 would be tomorrow, etc.
     */
    DayQueryResult queryDay(float latitude, float longitude, int daysAfterToday);
}
