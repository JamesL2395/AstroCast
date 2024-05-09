import WeatherAPI.DayQueryResult;
import WeatherAPI.HourQueryResult;
import WeatherAPI.RandomImplementation.RandomDayQuery;

public class WeatherTestMain {
    public static void main(String[] args) {

        float latitude = 10;
        float longitude = 10;
        int day = 0;

        DayQueryResult dayQueryResult = new RandomDayQuery().queryDay(latitude, longitude, day);

        System.out.println(String.format("\nLatitude: %f", latitude));
        System.out.println(String.format("Longitude: %f", longitude));
        System.out.println(String.format("Day: %d", day));

        System.out.println("\nMoon Phase Metric: " + dayQueryResult.getMoonPhaseMetric().getDisplayValue());
        System.out.println("Suntime Metric: " + dayQueryResult.getSuntimeMetric().getDisplayValue());

        HourQueryResult[] hourQueryResults = dayQueryResult.getHourQueryResults();
        for (int i = 0; i < hourQueryResults.length; i++) {
            System.out.print(String.format("\nHour %d:00", i));
            System.out.print(" - Cloud Cover Metric: " + hourQueryResults[i].getCloudCoverMetric().getDisplayValue());
            //System.out.println("Moon Altitude Metric: " + hourQueryResults[i].getMoonAltitudeMetric().getDisplayValue()); //dont care enough
            System.out.print(" - Precipitation Metric: " + hourQueryResults[i].getPrecipitationMetric().getDisplayValue());
            System.out.print(" - Temperature Metric: " + hourQueryResults[i].getTemperatureMetric().getDisplayValue());
        }
    }
}
