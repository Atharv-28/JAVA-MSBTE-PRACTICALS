class bank
{
    int getRateOfInterest()
    {
        return 0;
    }
}
class SBI extends bank
{
    int getRateOfInterest()
    {
        return 7;
    }
}
class BOI extends bank
{
    int getRateOfInterest()
    {
        return 8;
    }
}
class ICICI extends bank
{
    int getRateOfInterest()
    {
        return 6;
    }
}
class interest
{
    public static void main(String[] args) {
        SBI s = new SBI();
        BOI b = new BOI();
        ICICI i = new ICICI();
        System.out.println("Interest of SBI : "+s.getRateOfInterest());
        System.out.println("Interest of BOI : "+b.getRateOfInterest());
        System.out.println("Interest of ICICI : "+i.getRateOfInterest());
    }
}
