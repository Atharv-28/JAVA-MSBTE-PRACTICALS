class shape
{
    void display()
    { 
        System.out.println("Inside Shape display");
    }
}
class rectangle extends shape
{
    void area()
    {
        System.out.println("Inside rectangle area");
    }
}
class cube extends rectangle
{
    void volume()
    {
        System.out.println("Inside cube volume");
    }
}

public class multilevelInheritance 
{
    public static void main(String[] args) 
    {
        cube c1 = new cube();
        c1.display();
        c1.area();
        c1.volume();    
    }
}
