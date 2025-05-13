package Public;

import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.print("Enter First Num: ");
        int num1 = num.nextInt();
        num.nextLine();
        
        System.out.print("Enter Second Num: ");
        int num2 = num.nextInt();
        num.nextLine();
        
        System.out.print("Enter Third Num: ");
        int num3 = num.nextInt();
        num.nextLine();
        
        if(num1 > num2 && num1 > num3 ){
            System.out.println("largest Number: " + num1);
        } else if(num2 > num3 && num2 > num3) {
            System.out.println("Largest Number: " + num2);
        } else System.out.println("largest Number: " + num3);
    }
    
}