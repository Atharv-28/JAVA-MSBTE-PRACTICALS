public class AscDec extends Thread
{   
    public void run()
    {
        System.out.println("Ascending  Order : ");
        for(int i=1;i<6;i++)
        {
            System.out.println(i);
        }
        System.out.println("Decending  Order : ");
        for(int i=5;i>0;i--)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        AscDec ad = new AscDec();
        ad.start();    
    }
}
