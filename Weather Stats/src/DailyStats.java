public class DailyStats {
    private String dayName;
    private double temperature;
    private boolean willRain;

    public DailyStats(String dayName, double temperature, boolean willRain){
        this.dayName = dayName;
        this.temperature = temperature;
        this.willRain = willRain;
    }
    public DailyStats(){
        dayName = "N/A";
        temperature = 0;
        willRain = false;
    }

    public String getDayName() {
        return dayName;
    }

    public double getTemperature() {
        return temperature;
    }
    public boolean getWillRain(){
        return willRain;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setWillRain(boolean willRain) {
        this.willRain = willRain;
    }
}
