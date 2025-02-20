import java.lang.Exception;
import java.util.*;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class exception2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String password = "sgi";
            System.out.print("Enter Password : ");
            String s = sc.next();
            if (password.equals(s)) {
                System.out.println("Authenticated");
            } else {
                throw new MyException("Authentication Failure");
            }
        } catch (MyException e) {
            System.out.println("Caught myexception");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }
    }
}
