import java.util.ArrayList;

public class TemperatureDevices {
    private double temperature;
    private String location;
    private int time;

    public TemperatureDevices(double temperature, String location, int time) {
        this.temperature = temperature;
        this.location = location;
        this.time = time;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public static TemperatureDevices getMax(ArrayList<TemperatureDevices> devices) {
        double max = 0.0;
        int biggest = 0;

        for(int i = 0; i < devices.size(); i++){
            if(devices.get(i).temperature>max){
                max = devices.get(i).temperature;
                biggest = i;
            }
        }
        return devices.get(biggest);
    }

    public static double computeAvg(ArrayList<TemperatureDevices> devices) {
        double total = 0.0;
        double average = 0;

        for(int i = 0; i < devices.size(); i++){
            total = total + i;
            average = total / devices.size();
        }
        return average;
    }

    public String toString() {
        return getTemperature()+","+getLocation()+","+getTime();
    }


}
