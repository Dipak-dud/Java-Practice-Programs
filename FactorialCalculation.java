// Java program to calculate factorial of a number Iteartive method

public class FactorialCalculation {
    public static void main(String[] args) {
        int num = 3; // Change this value to calculate factorial of another number
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
