import java.util.*;
import letMeCalculate.*;
class demo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int x= sc.nextInt();
        int y = sc.nextInt();
        calculator cl = new calculator();
        cl.Add(x, y);    
    }
}
