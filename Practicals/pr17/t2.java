class t1
{
    void display()
    {
        System.out.println("This is Super Class");
    }
}
class t2 extends t1
{
    void display()
    {
        super.display();
        System.out.println("This is sub Class");
    }
    public static void main(String[] args) {
        t1 a=new t2();
        a.display();
    }
}