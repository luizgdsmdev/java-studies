package exercises.OOP.exerc_4;
import exercises.OOP.exerc_4.classes.*;

public class School {

    public static void main(String[] args){
        Student John = new Student("John", (byte) 29, "CS");
        double[] grades = {9.2, 8.9, 8.9, 10D, 9.9};
        String gradesMessage = John.setGrades(grades);

        System.out.println(gradesMessage);//Grades listed. [9.2, 8.9, 8.9, 10.0, 9.9]
        System.out.println(John.getGrades());//[9.2, 8.9, 8.9, 10.0, 9.9]
        System.out.println(John.getTotalGrades());//45.9
        System.out.println(John.getStatus());//Grades must be set before status report.

        double totalGrades = John.getTotalGrades();
        John.setStatus(totalGrades, 40);
        System.out.println(John.getStatus());//Approved!
    }
    
}
