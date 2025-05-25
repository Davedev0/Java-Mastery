package simpleCode;
import java.util.Scanner;
public class access {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validInput = false;
        int age = 0; 
        
        while (!validInput) {
            try {
                System.out.print("Enter your age: ");
                age = scan.nextInt();
                scan.nextLine(); 
                
                if (age < 10) System.out.println("Too young!");
                else if (age > 80) System.out.println("Too old!");
                System.out.println("Your age: " + age);
                validInput = true;
                
            } catch (Exception e) {
                System.out.println("Input numbers only!");
                scan.nextLine();
            }
         }
        
        System.out.println("Program closed."); 
    }
}