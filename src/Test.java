import weather.WeatherReading;

public class Test {
    public static void main(String[] args) {
        WeatherReading weatherReading= new WeatherReading(20,15,5,10);
        System.out.println(weatherReading.toString());
        double relativeHumidity=weatherReading.getRelativeHumidity();
        double heatIndex= (weatherReading.getHeatIndex()*100)/100.0;
        double windchill= (weatherReading.getWindChill()*100)/100.0;
        //Integer relativeHumidity=weatherReading.getRelativeHumidity();
        System.out.println("relative humidity\t"+relativeHumidity+"\n"+"heat Index \t"+heatIndex+"\nwind chill\t "+windchill);
        //humidity
        //Integer relativeHumidity= weatherReading.getRelativeHumidity();
    }
}
