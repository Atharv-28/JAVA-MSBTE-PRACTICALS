class parent
{
    void display()
    {
        System.out.println("Parent class");
    }
}
class child extends parent
{
    void display2()
    {
        System.out.println("Child class");
    }
}
class singleInheritance
{
    public static void main(String[] args) {
        child c = new child();
        c.display();
        c.display2();
    }
}