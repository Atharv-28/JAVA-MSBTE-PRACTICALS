interface findArea
{
    double pi = 3.1415;
    double calculate(double a, double b);
}
class rectangle implements findArea
{
    public double calculate(double a, double b)
    {
        return(a+b);
    }
}
class circle implements findArea
{
    public double calculate(double a, double b)
    {
        return(pi*a*a);
    } 
}
class multipleusingInterface
{
    public static void main(String[] args) 
    {
        rectangle r = new rectangle();
        circle c = new  circle();
        findArea area;
        area = r;
        System.out.println("Area of rectangle is : "+area.calculate(50, 30));
        area = c;
        System.out.println("Area of cirlce is : "+area.calculate(10, 12));
    }
}