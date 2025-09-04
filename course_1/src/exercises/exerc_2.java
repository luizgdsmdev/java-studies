package exercises;

//This exercise is meant to cover a basic switch and switch expression
//to determine a satisfaction valuation
public class exerc_2 {
  public static void main(String[] args){
      byte valuation = 5;
      String valuationMessage;

      //Switch approach
      switch(valuation){
          case 5:
              valuationMessage = "Very satisfied";
              break;
          case 4:
              valuationMessage = "Satisfied";
              break;
          case 3:
              valuationMessage = "little satisfied";
              break;
          case 2:
              valuationMessage = "Dissatisfied";
              break;
          case 1:
              valuationMessage = "Very dissatisfied";
              break;
          default:
           valuationMessage = "invalid option";
      }
      System.out.print(valuationMessage);

      //Switch expression approach
      String valuationResult = switch(valuation){
              case 5 -> "Very satisfied";
              case 4 -> "Satisfied";
              case 3 -> "little satisfied";
              case 2 ->  "Dissatisfied";
              case 1 ->  "Very dissatisfied";
              default -> "Invalid option";
      };
      System.out.print("\n" + valuationResult);
  }
}
