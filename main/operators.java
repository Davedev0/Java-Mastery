import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        Scanner operators = new Scanner(System.in);
        int addition, diffirence, multiplication,
            division, modules;
        System.out.print("Input first number: ");
        int firstNum = operators.nextInt();
        
        System.out.print("Input second number: ");
        int secondNum = operators.nextInt();
        
        addition = firstNum + secondNum;
        diffirence = firstNum - secondNum;
        multiplication = firstNum * secondNum;
        division = firstNum / secondNum;
        modules = firstNum % secondNum;
        
        System.out.println(firstNum + " + " + secondNum + " = " + addition);
        System.out.println(firstNum + " - " + secondNum + " = " + diffirence);
        System.out.println(firstNum + " × " + secondNum + " = " + multiplication);
        System.out.println(firstNum + " / " + secondNum + " = " + division);
        System.out.print(firstNum + " mod " + secondNum + " = " + modules);
    }
    
