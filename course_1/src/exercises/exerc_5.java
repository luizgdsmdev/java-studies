package exercises;
import java.util.Arrays; 

public class exerc_5 {
    public static void main(String[] args){
        int[] arrayEven = new int[5];
        int[] arrayOdd = new int[5];
        byte arrayEvenIndex = 0;
        byte arrayOddIndex = 0;

        for(byte i = 0; i < 10; i++){
            if(i % 2 == 0){
                arrayEven[arrayEvenIndex] = i;
                arrayEvenIndex++;
            }else{
                arrayOdd[arrayOddIndex] = i;
                arrayOddIndex++;
            }
        }

        System.out.println("Even numbers: " + Arrays.toString(arrayEven));
        System.out.println("Odd numbers: " + Arrays.toString(arrayOdd));
    }
}
