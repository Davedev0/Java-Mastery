//Basic Switch Case Statements
//Input the Month for Example: 1 is January

import java.util.Scanner;

public class Month {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Month: ");
        int month = s.nextInt();
        
        System.out.print("Day: ");
        int day = s.nextInt();
        
        System.out.print("Year: ");
        int year = s.nextInt();
        
        String monthWord = " ";
        
        switch(month){
            case 1:
              monthWord = "January";
            break;
            case 2:
              monthWord = "Febuary";
            break;
            case 3:
              monthWord = "March";
            break;
            case 4:
              monthWord = "April";
            break;
            case 5:
              monthWord = "May";
            break;
            case 6:
              monthWord = "June";
            break;
            case 7:
              monthWord = "July";
            break;
            case 8:
              monthWord = "August";
            break;
            case 9:
              monthWord = "September";
            break;
            case 10:
              monthWord = "October";
            break;
            case 11:
              monthWord = "November";
            break;
            case 12:
              monthWord = "December";
            break;
            default:
        }
        System.out.println();
        if (month >= 13 || month <= 0) System.out.println("Invalid Month!");
        else if (day >= 32 || day <= 0) System.out.println("Invalid Day!");
            else if(year <= 0) System.out.println("Invalid Year!");
        else System.out.println(monthWord + " " + day + ", " + year);
    }
    
}
