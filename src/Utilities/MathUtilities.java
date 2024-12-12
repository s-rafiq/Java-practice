package Utilities;

public class MathUtilities {

    // Method that returns the sum of two integers
    public static int firstMethod(int x, int y) {
        return x + y;
    }

    // Method that prints a message
    public static void secondMethod() {
        System.out.println("I just got executed!");
    }

    // Method that takes two parameters and prints them
    public static void fullNameMethod(String firstName, String secondName) {
        System.out.println("Hi, my name is " + firstName + " " + secondName);
    }

    // Method that checks age and prints a message
    public static void ageCheck(int age) {
        if (age < 18) {
            System.out.println("You are a young one");
        } else {
            System.out.println("You have XP");
        }
    }

    // Method calculating dog age
    public static int calculateDogAge(int age) {
        return age * 7;
    }

    // Method to calculate grade average with conditional
    public static String passingAverage(int a, int b, int c, int d) {
        int result = (a + b + c + d) / 4;
        if (result > 90) {
            return "You all passed with flying colours";
        } else if (result > 80) {
            return "You all passed, good job";
        } else if (result > 70) {
            return "you all passed";
        } else if (result > 64) {
            return "You barely made it";
        } else {
            return "You failed";
        }
    }

    public static String yardsToInches(int yards) {
        int inches = yards * 36;
        return String.format("Given %d yard(s) you have %d inches", yards, inches); // similar to template literals
    }

    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return String.format("Your number %d is even", number);
        } else {
            return String.format("Your number %d is odd", number);
        }
    }

    public static boolean sumMultiple(int x, int y, int z) {
        int sum = x + y;
        return z % sum == 0;
    }
}

