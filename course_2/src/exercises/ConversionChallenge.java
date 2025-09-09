package exercises;

import java.util.Arrays;
import java.util.Scanner;

//Get 3 string (simulate a salary)
//Must be able to receive notations with "," or "."
//Must show a sum and average of numbers
//Ideally, divide responsibilities into functions
public class ConversionChallenge {

    public static double sumSalary(float[] salaryList){
        double sumTotal = 0;

        for (byte i = 0; i < salaryList.length; i++){
            sumTotal += (double) salaryList[i];
        }
        return sumTotal;
    }
    public static float salaryAvarage(float[] salaryList){
        float average = 0;

        for(byte i = 0; i < salaryList.length; i++){
            average += salaryList[i];
        };

        return average/salaryList.length;
    }

    public static float[] getSalaryFromUser(){
        Scanner scanner = new Scanner(System.in);//Get data from console
        float[] salaryList = new float[3];

        for(byte i = 0; i < 3; i++){
            System.out.println("Insert the " + (i + 1 )+ " salary value: ");
            salaryList[i]  = Float.parseFloat(scanner.nextLine());
        };
        return salaryList;
    }

    public static void main(String[] args){
        double totalSum;
        float[] salaryList = new float[3];
        float salaryAvarage;

        salaryList = getSalaryFromUser();
        totalSum = sumSalary(salaryList);
        salaryAvarage = salaryAvarage(salaryList);

        System.out.println("Values listed " + Arrays.toString(salaryList));
        System.out.println("Total sum of values: " + totalSum);
        System.out.println("Average: " + salaryAvarage);
    }
}
