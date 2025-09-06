package exercises.OOP.exerc_5.classes;

import exercises.OOP.exerc_5.interfaces.MainInterface;

public class CreateVehicle implements MainInterface {
        private String brand;
        private String Year;
        private double price;

        public CreateVehicle(String brand, String Year, double price){
            this.brand = brand;
            this.Year = Year;
            this.price = price;
        }

        public String startVehicle(){
            return "The " + this.brand + " Vehicle is running.";
        };


        public String stopVehicle(){
            return "The " + this.brand + " Vehicle was turned off.";
        };

        public String[] getVehicleData(){
            String[] vehicleData = {this.brand, this.Year, String.valueOf(this.price)};
            return vehicleData;
        }

        public String honkVehicle(){
            return "Lound sound.";
        }
}
