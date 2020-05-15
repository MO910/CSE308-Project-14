import java.util.*;
public class CheckDifference{
    public static void main(String []args){
        Scanner console = new Scanner(System.in);
        for (;;) {
            // Ask for the first number
            System.out.print("Type the first number : ");
            int num1 = console.nextInt();
            // Ask for the first number
            System.out.print("Type the second number : ");
            int num2 = console.nextInt();
            // Print the output
            if (num1 - num2 > 0){
                System.out.println("first number is bigger");
            } else {
                System.out.println("second number is bigger");
            }
            // Breaking the loop
            if (num1 < 0 && num2 < 0){
                break;
            }
        }
    }
}