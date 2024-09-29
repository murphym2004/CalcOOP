package atu.ie;

import java.util.Scanner;

public class calC {
    public static void main(String[] args) {
    //methods
        System.out.println("please enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("please enter the second number: ");
        int b = sc.nextInt();
        System.out.println("please enter an operation: ");
        String op = sc.next();
        switch (op) {
            case "add": add(a, b); break;
            case "multiply": multiply(a, b); break;
            case "divide":  divide(a, b); break;
            case "subtract": subtract(a, b); break;
            default: System.out.println("invalid operation"); break;
        }

    }
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is : " + sum);
    }
    public static void multiply(int a, int b) {
        int product = a * b;
        System.out.println("The sum is: " + product);
    }
    public static void divide(int a, int b) {
        int remainder = a / b;
        System.out.println("The sum is: " + remainder);
    }
    public static void subtract(int a, int b) {
        int difference = a - b;
        System.out.println("The difference is: " + difference);
    }
}
