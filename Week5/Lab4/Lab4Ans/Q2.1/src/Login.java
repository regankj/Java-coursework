import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;


/**
 * @author Yukun
 *
 */
public class Login {

	public static void main(String [] args) {
		Map<String, String> users = new HashMap<String, String>();
		// read the content from a text file
		try
		{
			Scanner scan = new Scanner(new File("users.txt"));
			while (scan.hasNext())
			{
				String user = scan.next();
				String pass = scan.next();
				users.put(user, pass);
			}
			scan.close();
		}
		catch (IOException ioe)
		{
			System.err.println(ioe);
			System.exit(-1);
		}

		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter user name: ");
		String user = stdin.nextLine();
		System.out.print("Enter password: ");
		String pass = stdin.nextLine();

		// Note: in practice, passwords should not be stored as plain text but instead should be encrypted
		if (users.containsKey(user) && users.get(user).equals(pass))
			System.out.println("Logged in successfully!");
		else if (users.containsKey(user))
			System.out.println("Incorrect password");
		else
			System.out.println("User does not exist!");
	}
}
