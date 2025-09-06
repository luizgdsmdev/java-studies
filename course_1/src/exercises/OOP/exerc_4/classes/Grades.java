package exercises.OOP.exerc_4.classes;
import java.util.Arrays; 

public class Grades {
    double[] gradesList = new double[5];
    String status;
    double totalGrades;
    
    public String setGrades(double []grades){
        String message = "Try again.";
        for(byte i = 0; i < grades.length; i++){
            if(grades[i] >= 0 && grades[i] <= 10D){
                this.gradesList[i] = grades[i];
                message = "Grades listed. " + Arrays.toString(this.gradesList);
            }else{
                message = "Invalid inputs. Grades must be between 0 and 10.";
            }
        }
        return message;
    }

    public String getGrades(){
        return Arrays.toString(this.gradesList);
    }

    public double getTotalGrades(){
        for(double grade : this.gradesList){
            this.totalGrades += grade;
        }

        return this.totalGrades;
    }

    public void setStatus(double finalGrade, double minGrade){
        if(this.totalGrades >= minGrade){
            this.status = "Approved!";
        }else{
            this.status = "reproved!";
        };
    }

    public String getStatus(){
        if(this.status == null){
           return "Grades must be set before status report.";
        }
        return this.status;
    }
}
