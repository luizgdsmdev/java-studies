package exercises.OOP.exerc_6;
import exercises.OOP.exerc_6.classes.Waiter;
import exercises.OOP.exerc_6.classes.restaurantClass;

public class restaurant {
    public static void main(String[] args){
        restaurantClass restaurant = new restaurantClass();
        Waiter John  = new Waiter("John", "Day", (short)154872, 09.00);


        boolean isOpen = restaurant.openRestaurant();
        String opening = John.clearRestaurant();

        System.out.println(opening);
    }
}
