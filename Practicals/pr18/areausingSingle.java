class room
{
    int l,w;
    room(int a,int b)
    { 
        l=a;
        w=b;
    }
    void area()
    {
        int area =l*w;
        System.out.println("The area of room is : "+area+"cm^2");
    }
}
public class areausingSingle extends room
{
    int h;
    areausingSingle(int a,int b,int c)
    {
        super (a,b);
        h = c;
    }    
    void volume()
    {
        int volume = l*w*h;
        System.out.println("The volume of room is : "+volume+"cm^3");
    }
    public static void main(String[] args) 
    {
        areausingSingle a1 = new areausingSingle(10,20,30);
        a1.area();
        a1.volume();    
    }
}
