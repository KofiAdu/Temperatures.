import java.util.ArrayList;
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args){
        ArrayList<TemperatureDevices> temperatures = new ArrayList<TemperatureDevices>();
        Scanner input = new Scanner(System.in);
        int i =0;

        while(true){
            System.out.println("Enter new measurement? y/n");
            String newMeasurement = input.nextLine();
            if(newMeasurement.equalsIgnoreCase("y")){
                System.out.print("Give " + (i+1) + ". temperature of measurement device: ");
                double temperature = Double.parseDouble(input.nextLine());
                System.out.print("Give " + (i+1) + ". location of measurement device: ");
                String  location = input.nextLine();
                System.out.print("Give " + (i+1) + ". time of measuring (s): ");
                int time = Integer.parseInt(input.nextLine());
                temperatures.add(new TemperatureDevices(temperature, location, time)) ;
            }
            else{ break;}
        }

        double sum = 0;
        double max = -1000;
        String position = "";
        int timing=  0;

        System.out.println("Temperature average is: " + TemperatureDevices.computeAvg(temperatures));
        System.out.println("Temperature maxim is: " +TemperatureDevices.getMax(temperatures));
    }
}
