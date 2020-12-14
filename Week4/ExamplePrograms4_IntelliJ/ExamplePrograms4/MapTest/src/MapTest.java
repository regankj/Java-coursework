import java.util.*;
public class MapTest 
{
    // check if the username, password exists in the map
    private static void check_user(String username, String password)
    {
        if (!users.containsKey(username))
            System.out.println("User " + username + " does not exist");
        else if (users.get(username).equals(password))
            System.out.println("User " + username + " logged in");
        else 
            System.out.println("User " + username + " exists but the password is wrong.");
    }
    public static void main(String[] args) 
    {
        // add username, password pairs to the map
        users = new HashMap<String, String>();
        users.put("laura", "monkey");
        users.put("bobby", "monkey");
        users.put("lucy", "velvet");
        
        // print the map
        System.out.println(users);
        
        // check users (username, password)
        check_user("bob", "monkey");
        check_user("laura", "hello");
        check_user("laura", "monkey");
    }
    private static Map<String, String> users; // map for user accounts
}
