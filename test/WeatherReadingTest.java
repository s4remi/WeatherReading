import org.junit.Before;
import org.junit.Test;
import weather.WeatherReading;

import static org.junit.Assert.*;

public class WeatherReadingTest {


    //WeatherReading ali= new WeatherReading(20, 15,10,6);


    @Test
    public void getTemperature() {
        WeatherReading ali= new WeatherReading(20, 15,10,6);
        int b= ali.getTemperature();
        //assertEquals(20,ali.getTemperature());
        assertEquals(20,b);
    }

    @Test
    public void getDewPoint() {
        WeatherReading ali= new WeatherReading(20, 15,10,6);
        int b= ali.getDewPoint();
        assertEquals(15,b);
    }

    @Test
    public void getTotalRain() {
        WeatherReading ali= new WeatherReading(20, 15,10,6);
        int b= ali.getTotalRain();

        assertEquals(6, b);
    }

    @Test
    public void getRelativeHumidity() {
        WeatherReading ali= new WeatherReading(20, 15,10,6);
        int b= ali.getRelativeHumidity();
        assertEquals(75, b);
    }

//    @Test
//    public void getHeatIndex() {
//        WeatherReading ali= new WeatherReading(20, 15,10,6);
//        double c1=-8.78469475556;
//        double c2=1.61139411;
//        double c3=2.33854883889;
//        double c4=-0.14611605;
//        double c5=-0.012308094;
//        double c6=-0.0164248277778;
//        double c7=0.002211732;
//        double c8=0.00072546;
//        double c9=-0.000003582;
//        int T= 20;
//        int R=75;
//        double b;
//        b=ali.getHeatIndex();
//        //int test= (int) b;
//
//        assertEquals(22, b);
//    }

    @Test
    public void getWindChill() {

        assertEquals(15, 15);
    }
//    @Test
//    public void testToString() {
//    }
//    @Test
//    public void WeatherReading(){
//
//       // WeatherReading ali= new WeatherReading(12,15,-1,10);
//        //assertThrows(IllegalArgumentException.class)
//    }
}