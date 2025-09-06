package exercises.OOP.exerc_6.classes;
import exercises.OOP.exerc_6.interfaces.waiterInterface;

public class Waiter extends restaurantClass implements waiterInterface {
    String name;
    String shift;
    short codeID;
    double startShiftAt;
    double expectedShiftHours;
    double closeShiftAt;
    double totalShiftHours;

    public Waiter(String name, String shift, short codeID, double startShiftAt){
        this.name = name;
        this.shift = shift;
        this.codeID = codeID;
        this.startShiftAt = startShiftAt;
    }
    
    public String clearRestaurant(boolean isOpen){
        String response = openRestaurant();
        return response + "The the cleaning was finished.";
    };

    public String isOpen(){
        return "";
    }

    public String clearRestaurant(){
        return "";
    }


    public String prepareAttendence(){
        //String response = openCashier();
        return "All set, hall is ready.";
    };


    public String closeStock(){
        return "All set, ready to go.";
    };
}
