/*
    made by ahmed hossam orabi 80730
    in project 14
*/
import java.util.*;
public class DuckNumber{
    public static void main(String []args){
        Scanner console = new Scanner(System.in);
        // Assigning variabels
        int n = 10;
        int duck = 0;
        // Start looping
        System.out.print("Type a number : ");
        for (int u = 0; u <= n; u++) {
            String num = console.nextLine();
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(0) != '0' && num.charAt(i) == '0') {
                    duck += 1;
                    break;
                }
            }
        }
        // Print the output
        System.out.println(duck + " numbers are Duck and " + (n - duck) + " numbers are not.");
    }
}