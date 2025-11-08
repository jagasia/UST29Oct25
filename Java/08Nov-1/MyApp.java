package com.mycompany.app;

// Import statement to bring MathOperations into scope
import com.mycompany.utilities.MathOperations;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("--- Math Operations Demo ---");

        // Create an instance of MathOperations
        MathOperations calculator = new MathOperations();

        int resultAdd = calculator.add(10, 5);
        System.out.println("10 + 5 = " + resultAdd); // Output: 10 + 5 = 15

        int resultSubtract = calculator.subtract(20, 7);
        System.out.println("20 - 7 = " + resultSubtract); // Output: 20 - 7 = 13

        // Calling a static method from the imported class
        MathOperations.displayInfo();

        System.out.println("--- Demo Complete ---");
    }
}