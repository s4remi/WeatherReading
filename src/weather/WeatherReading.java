package weather;

public class WeatherReading {
    private int temperature;
    private int dewPoint;
    private int windSpeed;
    private int totalRain;
    private int relativeHumidity;
    public WeatherReading(int temperature, int dewPoint,int windSpeed,int totalRain) throws IllegalArgumentException{
        this.temperature=temperature;
        this.dewPoint=dewPoint;
        this.windSpeed=windSpeed;
        this.totalRain=totalRain;
        if(dewPoint> temperature){
            throw new IllegalArgumentException(" dewPoint is higher than temp");
        }else if(windSpeed<0){
            throw new IllegalArgumentException(" wind is negative");
        }else if(totalRain<0){
            throw new IllegalArgumentException("total rain is negative");
        }
    }

    public int getTemperature(){
        return temperature;
    }
    public int getDewPoint(){
        return dewPoint;
    }
    public int getTotalRain(){
        return totalRain;
    }
    public int getWindSpeed(){ return windSpeed; }
    public int getRelativeHumidity(){
        relativeHumidity=(dewPoint-temperature) *5 +100;
        return relativeHumidity;
    }

    public double getHeatIndex(){
        //HI= c1+c2T+c3*R
        //c1 = -8.78469475556
        double c1=-8.78469475556;
        //c2 = 1.61139411
        double c2=1.61139411;
        //c3 = 2.33854883889
        double c3=2.33854883889;
        //c4 = -0.14611605
        double c4=-0.14611605;
        //c5 = -0.012308094
        double c5=-0.012308094;
        //c6 = -0.0164248277778
        double c6=-0.0164248277778;
        //c7 = 0.002211732
        double c7=0.002211732;
        //c8 = 0.00072546
        double c8=0.00072546;
        //c9 = -0.000003582
        double c9=-0.000003582;
        int T= temperature;
        int R=getRelativeHumidity();
        double heatIndex= c1+ c2*T + c3*R + c4*R*T +c5*Math.pow(T,2) +c6*Math.pow(R,2) + c7*R*Math.pow(T,2) + c8*T*Math.pow(R,2) +c9*Math.pow(T,2)*Math.pow(R,2);
        return heatIndex;
    }
    public double getWindChill(){
        //WC=35.74
        double T=temperature*(1.8)+32;
        int v=windSpeed;
        double windChill=35.74 +0.6215*T- 35.75* Math.pow(v,0.16)+.4275*T* Math.pow(v,0.16);
        return windChill;
    }
    @Override
    public String toString(){
        return "Reading: T = "+temperature+", D = "+dewPoint+", v = "+windSpeed+", rain = "+totalRain;
    }
}
