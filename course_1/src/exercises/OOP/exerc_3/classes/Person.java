package exercises.OOP.exerc_3.classes;

public class Person {
    protected  String name;
    protected  int age;
    protected  String address;

    Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String Eat(){
        return this.name + "is eating.";
    }

    public String GoHome(){
        return name + " is going home, see you tomorrow.";
    }
}
