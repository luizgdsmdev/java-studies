package exercises.OOP.exerc_4.classes;

public class Student extends Grades {
    String name;
    byte age;
    String className;

    public Student(String name, byte age, String className){
        this.name = name;
        this.age = age;
        this.className = className;
    }
}
