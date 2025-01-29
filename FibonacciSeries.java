//Generate the Fibonacci series

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Print the Fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to calculate the Fibonacci number at a given position
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: return n if n is 0 or 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
}