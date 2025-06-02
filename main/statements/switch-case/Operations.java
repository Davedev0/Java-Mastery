package simpleCode;
import java.util.Scanner;
public class Operations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            try {
                System.out.println("\n---Select Operations---");
                System.out.println("[1] Addition");
                System.out.println("[2] Subtraction");
                System.out.println("[3] Multiplication");
                System.out.println("[4] Division");
                System.out.print("Choose: ");
                int operation = scn.nextInt();
                
                System.out.print("Enter first number: ");
                int num1 = scn.nextInt();
                
                System.out.print("Enter second number: ");
                int num2 = scn.nextInt();
                
                switch (operation) {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 / (double)num2));
                        } else {
                            System.out.println("Error: Division by zero!");
                        }
                        break;
                    default:
                        System.out.println("Invalid operation selected!");
                }
                
                System.out.print("Try again? (yes/no): ");
                scn.nextLine(); 
                String tryAgain = scn.nextLine().toLowerCase();
                
                if (!tryAgain.equals("yes")) {
                    running = false;
                    System.out.println("Thank you for trying!");
                }
                
            } catch (Exception e) {
                System.out.println("Invalid input, please enter numbers only!");
                scn.nextLine(); 
            }
        }
        
        scn.close();
    }
}