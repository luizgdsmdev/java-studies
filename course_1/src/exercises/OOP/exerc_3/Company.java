package exercises.OOP.exerc_3;
import exercises.OOP.exerc_3.classes.EmployeeNew;

public class Company {
    public static void main(String[] args){
        EmployeeNew john = new EmployeeNew("John", 29, "Brazil", 179000.0, "Software Engineer");

        //Employee class
        System.out.println(john.Work());

        //Person class
        System.out.println(john.Eat());
        System.out.println(john.GoHome());
    }

}
