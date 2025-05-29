package simpleCode;

import java.util.Scanner;

public class calculationIndex {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int numbers[] = {0, 2, 5, 6, 7, 8, 9, 2};
        
        System.out.println("Current Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        System.out.println("\nEnter two indexes to perform operations:");
        System.out.print("Index 1: ");
        int index1 = scn.nextInt();
        System.out.print("Index 2: ");
        int index2 = scn.nextInt();
        
        if (index1 < 0 || index1 >= numbers.length || index2 < 0 || index2 >= numbers.length) {
            System.out.println("Invalid index!");
            return;
        }
        
        System.out.println("\nChoose operation (+, -, *, /): ");
        char operation = scn.next().charAt(0);
        
        int num1 = numbers[index1];
        int num2 = numbers[index2];
        int result = 0;
        
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                result = (int) num1 / num2;
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }
        
        System.out.println("\nResult: " + num1 + " " + operation + " " + num2 + " = " + result);
        scn.close();
    }
}