
import java.util.Scanner;

public class InputUser {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your Name: ");
        String name = s.nextLine();
        
        System.out.print("Enter your Birthdate: ");
        String birthday = s.nextLine();
        
        System.out.print("Enter your Age: ");
        int age = s.nextInt();
        s.nextLine();
        
        System.out.print("Enter your Address: ");
        String address = s.nextLine();
        
        s.close();
        System.out.println(); //newline
        
        System.out.println("--User Information--");
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + birthday);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    
}