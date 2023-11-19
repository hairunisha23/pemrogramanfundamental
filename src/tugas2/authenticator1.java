package tugas2;

import static java.lang.System.out;
import java.util.Scanner;
public class authenticator1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Username: ");
        String username = keyboard.next();

        if (username.equals("nisha") ) {
            out.print("password: ");
            String password = keyboard.next ();

            if (password.equals("123") ) {
                out.println("You're in.");
            } else {
                out.println("incorrect password");
            }
        } else {
            out.println("Unknown user");
        }

        keyboard.close();
    }
}

