import java.util.Scanner;

public class tcs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number 1 to 100: ");
            int n = sc.nextInt();

            if (n < 1 || n > 100) {
                System.out.println("Error: Input must be between 1 and 100.");
                return;
            }

            int msbPos = Integer.highestOneBit(n);   // e.g., 8 for 10
            int mask = msbPos * 2 - 1;              // e.g., 15 for 8
            int toggled = n ^ mask;                 // XOR for toggle

            System.out.println("Output after toggled: " + toggled);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        } finally {
            sc.close();
        }
    }
}
