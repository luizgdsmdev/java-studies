package exercises.OOP.exerc_6.classes;
import exercises.OOP.exerc_6.interfaces.restaurantInterface;

public class restaurantClass implements restaurantInterface {

    public String openRestaurant(){
        boolean response =  isRestaurantOpen();
        return response ? "Restaurant was already opened." : "You opened the restaurant.";
    }

    public String closeRestaurant(){
        boolean response =  isRestaurantOpen();
        return response ? "You closed the restaurant." : "Restaurant was already closed.";
    };

    public String openCashier(){
        boolean response =  isCashierOpen();
        return response ? "Cashier was already opened." : "You opened the Cashier.";
    };
    
    public String closeCashier(){
        boolean response =  isCashierOpen();
        return response ? "You closed the Cashier." : "Cashier was already closed.";
    };

    private boolean isRestaurantOpen(){
        boolean checkOpen = isOpen ? true : false;
        return checkOpen;
    }

    private boolean isCashierOpen(){
        boolean checkOpen = isCashierClosed ? true : false;
        return checkOpen;
    }
}
