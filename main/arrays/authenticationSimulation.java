import java.util.Scanner;
public class authenticationSimulation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String[] userEmails = {"dave", "dev", "jhondave"};
        String[] userPasswords = {"dave123", "dev000", "jhondave12345"};
        
        System.out.print("Enter your email: ");
        String email = s.nextLine();
        
        System.out.print("Enter your password: ");
        String password = s.nextLine();
        boolean accountExist = false;
        for(int i = 0; i < userEmails.length; i++){
            if (email.equals(userEmails[i]) && password.equals(userPasswords[i])){
                accountExist = true;
                break;
            }
        }
        if(accountExist) System.out.println("Welcome, " + email);
        else System.out.println("Account Not Found!");
    }
                                            
            }
