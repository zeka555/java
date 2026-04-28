import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements? ");
        int n = sc.nextInt();

        int[] arr = new int[n];  // create array of size n

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // ---- OUTPUT SECTION (swap this part!) ----
        System.out.println("Count: " + n);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];          // change this line!
        }
        System.out.println("Sum: " + sum);
    }
}