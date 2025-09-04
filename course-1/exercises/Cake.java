package exercises;

public class Cake {
    byte valueSugar;

    public static void main(String[] args){
        Cake obj = new Cake();
        obj.valueSugar = 15;

        int teste = obj.valueSugar;
        teste = 0;
        System.out.print(obj.valueSugar);
        System.out.print(teste);
        System.out.print(obj.valueSugar);
    }
}
