package java_lab.CO4;
//import javax.naming.AuthenticationException;
import java.util.*;

public class Question3 {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the username ");
        String username = scan.nextLine();

        System.out.println("Enter the password ");
        String password = scan.nextLine();

        try {
            authenticate(username,password);
            System.out.println("Authentication successful!");
        }catch (AuthenticationException e) {
            System.out.println("Authentication Failed.! :" + e.getMessage());
        }
    }

    public static void authenticate (String user, String pass) throws AuthenticationException {
        if(!user.equals("Admin") || !pass.equals("password")) {
            throw new AuthenticationException();
        }
    }
}

class AuthenticationException extends  Exception {
    public AuthenticationException() {
        super("Invalid username or password.");
    }

    public AuthenticationException(String message) {
        super(message);
    }
}