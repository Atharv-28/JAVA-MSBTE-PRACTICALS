class javaSetPriority extends Thread
{
    public void run()
    {
        System.out.println("Running...");
    }
    public static void main(String[] args) 
    {
        javaSetPriority t1 = new javaSetPriority();
        javaSetPriority t2 = new javaSetPriority(); 
        javaSetPriority t3 = new javaSetPriority();
        t1.setPriority(3);
        t2.setPriority(7);
        t3.setPriority(1);
        System.out.println("Priority of thread 1 : "+t1.getPriority());
        System.out.println("Priority of thread 2 : "+t2.getPriority());
        System.out.println("Priority of thread 3 : "+t3.getPriority());
        t1.start();
        t2.start();
        t3.start();
    }
}