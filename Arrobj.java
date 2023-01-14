import java.util.*;
public class Arrobj {
    int roll;
    Arrobj(int a)
    {
        roll=a;
    }
    void display()
    {
        System.out.println(roll);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x[]={1,2,3,4};
        Arrobj a1[]= new Arrobj[4];
        for(int i=0;i<4;i++)
        {
            a1[i]=new Arrobj(x[i]);
            a1[i].display();
        }
    }
    
}
