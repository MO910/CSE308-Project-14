import java.util.*;
public class MeanRange {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		// Assigning variabels
		int n = 100,
			sum = 0,
			mean = 0,
			min = 0,
			max = 0,
			range;
		// Start looping
		for (int u = 0; u < n; u++) {
			System.out.print("Type a number : ");
			int num = console.nextInt();
			if (u == 0){
				min = num;
				max = num;
			} else if (num < min) {
				System.out.println("min");
				min = num;
			} else if (num > max) {
				System.out.println("max");
				max = num;
			}
			sum += num;
        }
        // Compute the mean and range
		mean = sum / n;
		range = max - min;
		// Print the output
		System.out.println("the mean value is : " + mean);
		System.out.println("the range value is : " + range);
		if (mean == range){
			System.out.println("mean and range are the same");
		} else {
			System.out.println("mean and range are not the same");
		}
	}
}
