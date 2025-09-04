package exercises;

public class exerc_1 {
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
