import java.util.Scanner; 
public class searchUserArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String[] userNames = {
            "dave", "mark", "mateo", 
            "alden", "manuel", "johndoe"
        };
        
        System.out.print("Search for a User: ");
        String searchUser = s.nextLine();
        boolean userNotFound = false;
        
        for(int i = 0; i < userNames.length; i++){
            if(userNames[i].equalsIgnoreCase(searchUser)){
                System.out.println("We Found " + userNames[i]);
                userNotFound = true;
                break;
            }
        }
        if(!userNotFound) System.out.println("User Not Found!");
    }
}
