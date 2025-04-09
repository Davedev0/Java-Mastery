import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Filipino: ");
        int filipino = x.nextInt();
        System.out.print("English: ");
        int english = x.nextInt();
        System.out.print("Science: ");
        int science = x.nextInt();
        System.out.print("Math: ");
        int math = x.nextInt();
        float average = (filipino + english + science + math) / 4;
        
        System.out.println();      
        System.out.println("Average: " + average);   
        
        if(average > 100 || average < 50) System.out.println("Invalid Grade");
           else if(average >= 98) System.out.println("With Highest Honors");
           else if(average >= 95) System.out.println("With High Honors");
           else if(average >= 90) System.out.println("With Honors");
           else if(average >= 75) System.out.println("You Passed");
               else System.out.println("You Failed!");
               
    }
    
}