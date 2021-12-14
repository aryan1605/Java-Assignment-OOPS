package MultiThreading;
class MAX extends Thread
{
    public void run()
    {
        try{
            System.out.println("MAX Thread");
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class MIN extends Thread{

    public void run()
    {
        try{
            System.out.println("MIN Thread");
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class NORM extends Thread{
    public void run()
    {
        try{
            System.out.println("NORM Thread");
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class ThreadExample {
    public static void main(String args[])
    {
        MAX obj=new MAX();
        NORM obj2=new NORM();
        MIN obj3=new MIN();
        try{
            obj.start();
            obj.join();
            obj2.start();
            obj2.join();
            obj3.start();
            obj3.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
