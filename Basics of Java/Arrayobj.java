import java.util.*;
class Arrayobj
{
    int roll;
    java.lang.String name;
    Arrayobj(int rl,java.lang.String b)
    {
        roll=rl;
        name=b;
    }
    void display()
    {
        System.out.println(name );
        System.out.println(roll);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Arrayobj a1[]=new Arrayobj[5];
        int a;
        java.lang.String b;
        System.out.println("Enter the details :");
        for(int i=0;i<5;i++)
        {
            a=sc.nextInt();
            b=sc.next();
            a1[i]=new Arrayobj(a,b);
            a1[i].display();
        }
    }
}