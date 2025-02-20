import java.lang.Exception;
import java.util.*;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class exception3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String s1 = "India";
            System.out.print("Enter String : ");
            String s = sc.next();
            if (s1.equals(s)) {
                System.out.println("String Matched");
            } else {
                throw new MyException("String Not Matched");
            }
        } catch (MyException e) {
            System.out.println("Caught myexception");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }
    }
}
