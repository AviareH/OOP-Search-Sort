import java.util.*;

public class WeatherDatabase {
    private static ArrayList<DailyStats> weather = new ArrayList<DailyStats>();

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

    public static void mergeSort(int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort( l, m);
            mergeSort( m + 1, r);
            merge(l, m, r);
        }
    }

    private static void merge(int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        ArrayList<DailyStats> L = new ArrayList<>(n1);
        ArrayList<DailyStats> R = new ArrayList<>(n2);

        for (int i = 0; i < n1; ++i)
            L.add(weather.get(l + i));
        for (int j = 0; j < n2; ++j)
            R.add(weather.get(m + 1 + j));

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L.get(i).getTemperature() >= R.get(j).getTemperature()) {
                weather.set(k, L.get(i));
                i++;
            } else {
                weather.set(k, R.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            weather.set(k, L.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            weather.set(k, R.get(j));
            j++;
            k++;
        }
    }

    public void flip(){
        Collections.reverse(weather);
    }
    public int binarySearch(double num){
        int low = 0;
        int high = weather.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            double midTemp = weather.get(mid).getTemperature();

            if (Math.abs(midTemp - num) < 0.0001) {
                return mid;
            } else if (midTemp < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

}

