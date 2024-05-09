import java.util.*;

public class WeatherDatabase {
    private ArrayList<DailyStats> weather = new ArrayList<DailyStats>();

    public WeatherDatabase(){

    }
    public ArrayList<DailyStats> getWeather() {
        return weather;
    }
    public void setWeather(ArrayList<DailyStats> weather) {
        this.weather = weather;
    }

    public void addStats(String dayName, double temperature, boolean willRain ){
        DailyStats stats = new DailyStats(dayName,temperature,willRain);
        weather.add(stats);
    }

    public void formatPrint(){
        for (DailyStats dailyStats : weather) {
            System.out.println(dailyStats.getDayName() + ": " + dailyStats.getTemperature() + "°. Will Rain: " + dailyStats.getWillRain());
        }
    }
}
