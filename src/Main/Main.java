package Main;

import Utilities.MathUtilities;

public class Main {

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can");
    }

    public void speed(int maxSpeed) {
        System.out.println(String.format("Max speed is %d", maxSpeed));
    }

    // Class attributes
    String firstName = "Saad";
    String lastName = "Rafiq";
    int xp = 5;
    public static void main(String[] args) {

        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.speed(100);

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        Main myOb = new Main(); // Create an object of Main
        myOb.myPublicMethod(); // Call the public method on the object


        // Classes and objects
        // class name // object name// mew instance// of class
        Main myObj = new Main();
        Main myObj2 = new Main();
        myObj.xp = 10;
        System.out.println(myObj.xp);
        System.out.println(myObj2.xp);
        System.out.println(String.format("My name is %s %s and I have %d years of experience on clubs.", myObj.firstName, myObj.lastName, myObj.xp));

        // Basic printing and arithmetic
        System.out.println("Hello World");
        System.out.println("It's me");
        System.out.println(12 * 2);

        // Working with variables
        String name = "Saad";
        name = "raf";
        System.out.println(name);

        // Declaring and using a constant
        final byte myNum = 15; // final makes the variable constant (immutable)
        System.out.println(myNum);

        // Declaring variables of different types
        float number = 1.1f; // 'f' denotes a float value
        char letter = 'A';   // Single quotes for char
        boolean myBool = true;

        // Declaring multiple variables and using them
        int a = 1, b = 2, c = 3;
        System.out.println(a + b + c);

        // Assigning the same value to multiple variables
        int l, m, n;
        l = m = n = 7;
        System.out.println(l + m + n);

        // Generating a random number between 0 and 100
        System.out.println((int) (Math.random() * 101)); // Type cast to int

        // Using if-else for conditional checks
        int currentExperience = 10;
        int minExperience = 7;
        if (currentExperience >= minExperience) {
            System.out.println("You are experienced");
        } else {
            System.out.println("Get more XP!");
        }

        // Ternary operator example
        String result = (10 < 6) ? "too old mate" : "bang on lad";
        System.out.println(result);

        // Using switch-case to handle multiple conditions
        int month = 11;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("No corresponding month");
        }

        // Using loops
        int loopNumber = 1;

        // Do-while loop example
        do {
            System.out.println(loopNumber);
            loopNumber++;
        } while (loopNumber < 5);

        // For loop example
        for (int i = 0; i <= 20; i += 5) {
            System.out.println(i);
        }

        // Nested loops example
        for (int i = 1; i <= 2; i++) { // Outer loop
            System.out.println("Outer: " + i);

            for (int j = 1; j <= 3; j++) { // Inner loop
                System.out.println(" Inner: " + j);
            }
        }

        // Working with arrays
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length); // Array length

        // Loop through array using standard for loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // Loop through array using for-each loop
        String[] carz = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : carz) {
            System.out.println(car);
        }

        // Example with array and index tracking
        int[] arr = {5, 2, 2, 0};
        int i = 0;
        for (int value : arr) {
            System.out.println(value + " " + i++);
        }

        // Calculating the average of an array
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        int arrayLength = ages.length;
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        float average = (float) sum / arrayLength; // Type cast to float for precise division
        System.out.println("The average is " + average);

        // Method calls
        System.out.println(MathUtilities.firstMethod(2, 3));
        MathUtilities.secondMethod(); // Call method that doesn't return a value
        MathUtilities.fullNameMethod("Grand", "master"); // Call method with parameters
        MathUtilities.ageCheck(24); // Call method with conditional logic
        System.out.println(MathUtilities.calculateDogAge(4));
        System.out.println(MathUtilities.passingAverage(20, 40, 60, 80));
        System.out.println(MathUtilities.yardsToInches(2));
        System.out.println(MathUtilities.evenOrOdd(13));
        System.out.println(MathUtilities.sumMultiple(1, 1, 6));
    }

}

