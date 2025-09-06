package exercises.OOP.exerc_5;
import exercises.OOP.exerc_5.classes.CreateVehicle;
import java.util.Arrays;


public class Vehicle {
    public static void main(String[] args){
        CreateVehicle Ford =new CreateVehicle("Ford", "2025", 70.000);
        String[] FordData = Ford.getVehicleData();
        String fordStart = Ford.startVehicle();
        String fordHonk = Ford.honkVehicle();
        String FordStop = Ford.stopVehicle();

        System.out.println(
            Arrays.toString(FordData) + "\n" +//[Ford, 2025, 70.0]
            fordStart                 + "\n" +//The Ford Vehicle is running.
            fordHonk                  + "\n" +//Lound sound.
            FordStop                  + "\n"  //The Ford Vehicle was turned off.
            );
    }
}
