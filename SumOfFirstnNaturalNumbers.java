import java.util.*;

public class SumOfFirstnNaturalNumbers {
    public static void main(String args[]) {
        System.out.println("Enter till where you want to know the sum from 1:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        // Corrected line using printf for formatted output
        System.out.printf("Sum from 1 to %d is: %d\n", n, sum);
    }
}
