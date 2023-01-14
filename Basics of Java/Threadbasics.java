class Task1 extends Thread
{
    public void run()
    {
        System.out.println("Started:");
        for(int i=100;i<199;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("Task1 done ");

    }
} 
class Task2 implements Runnable
{
    public void run()
    {
        System.out.println("Task2 started :");
        for(int i=200;i<299;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("Taslk2 completed ");

    }
}
public class Threadbasics {
    public static void main(String args[])
    {
        Task1 t=new Task1();
        t.start();
        Task2 tt=new Task2();
        Thread thread=new Thread();
        thread.start();
        
        
        for(int i=300;i<399;i++)
        {
            System.out.println(i+" ");
        }
    }
}
