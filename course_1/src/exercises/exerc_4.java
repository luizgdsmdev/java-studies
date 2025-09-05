package exercises;

/**
This exercise is meant to cover a basic use of arrays
 */
public class exerc_4 {
    public static void main(String[] args){
        double[] grades = new double[]{7.5, 6.9, 8, 9, 8.9};
        double sumGrades = 0;
        double minTotalGrade = 50 * 0.95;

        for(double grade : grades){
            sumGrades += grade;
        }
        if(sumGrades > minTotalGrade){
            System.out.println("Approved! \nYour result: " + sumGrades + "\nMin-grade necessary: " + minTotalGrade) ;
        }else{
            System.out.println("Reproved! \nYour result: " + sumGrades + "\nMin-grade necessary: " + minTotalGrade) ;
        }

        
    }
}
