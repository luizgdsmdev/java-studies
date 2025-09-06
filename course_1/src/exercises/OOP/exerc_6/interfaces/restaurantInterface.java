package exercises.OOP.exerc_6.interfaces;

public interface restaurantInterface {
    boolean isOpen = false;
    boolean isCashierClosed = false;
    double cashierValue = 0;

    public String openRestaurant();
    public String closeCashier();
    public String closeRestaurant();
}