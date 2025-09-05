package exercises.OOP.exerc_3.classes;

public class EmployeeNew extends Person {
    double salary;
    String position;

    public EmployeeNew(String name, int age, String address, double salary, String position){
        super(name, age, address);

        this.salary = salary;
        this.position = position;
    }

    public String Work() {
        return "The employee called " + this.name + " is working right now.";
    }
}


