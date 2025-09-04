package exercises;

/**
This exercise is meant to cover a basic use of primitive values
to determine an approval where:
    - The average grade is greater than or equal to 7.
    - Attendance is equal to or greater than 75%. (360 days class)
 */
public class exerc_3 {
    public static void main(String[] args){
        byte grade_1 = 10;
        byte grade_2 = 8;
        short attendance_days = 275;
        float min_attendance = 0.75F * 360;
        byte min_grade_value = 7;

        boolean final_grade = ((grade_1 + grade_2)/2) >= min_grade_value;
        boolean final_attendance = attendance_days >= min_attendance;

        //Using the if statement
        if(final_grade && final_attendance){
            System.out.print("\nFrom if/else statement: " + "Approved.");
        }else{
            System.out.print("\nFrom if/else statement: "  + "failed.");
        }

        //Using ternary approach
        String grade_results = (final_grade && final_attendance) ? "Approved." : "Failed.";
        System.out.print("\nFrom ternary approach: " + grade_results);

        //Using switch approach
        switch(grade_results){
            case "Approved.":
                System.out.print("\nFrom switch approach: Approved.");
                break;
            case "Failed.":
                System.out.print("\nFrom switch approach: failed.");
                break;
            default:
                System.out.print("\nFrom switch approach: One or more values are invalid.");
        }

        //Using switch expression
        String final_result = switch(grade_results){
            case "Approved." -> "\nFrom switch expression: Approved.";
            case "Failed." -> "\nFrom switch expression: Failed.";
            default -> "\nFrom switch expression: One or more values are invalid.";
        };
        System.out.print(final_result);

    }
}
