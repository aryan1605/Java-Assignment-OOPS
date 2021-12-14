package MultiThreading;
class Scooby extends Thread
{
    public void run()
    {
        Thread.currentThread().setName("Scooby");
        System.out.println("Thread Name is "+ Thread.currentThread().getName());
    }
}
class Shaggy extends Thread
{
    public void run()
    {
        Thread.currentThread().setName("Shaggy");
        System.out.println("Thread Name is "+Thread.currentThread().getName());
    }
}
public class MainThread {
    public static void main(String args[])
    {
        Scooby obj1=new Scooby();
        Shaggy obj2=new Shaggy();
        obj1.start();
        obj2.start();
    }
}
