package exercises;


//This exercise is meant to cover a basic else/if and ternary operator use
//to define if a number is odd/even
public class exer_1 {
    public static void main(String[] arg){
        byte a = 2;

        //If approach
        if((a % 2) == 0){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }

        //Ternary approach
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.print("\n" + result);

    }
}
