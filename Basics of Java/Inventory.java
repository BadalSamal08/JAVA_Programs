
import java.util.*;
class Item{
    String name;
    double price;
    int quantity;
    Item(String nm,double prc,int quant)
    {
        name=nm;
        price=prc;
        quantity=quant;
    }
    String getName()
    {
        return name;
    }
    double getPrice()
    {
        return price;
    }
    int getQuantity()
    {
        return quantity;
    }
    double getValue()
    {
        double c= quantity*price;
        return c;
    }
    void display()
    {
        String s=getName();
        double r=getPrice();
        int t=getQuantity();
        double u=getValue();
        System.out.println(s+" "+r+" "+t+" "+u);
    }
}
class Inventory
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String nr;
            double prr;
            int qnn;
            Item i[]=new Item[3];
             /*     i[0]=new Item("Biscuit",14,3);
                    i[1]=new Item("Mixture",16,7);
                    i[2]=new Item("Cake",17,8);                    */
            System.out.println("Enter the details of items");
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter the item name");
                nr=sc.next();
                System.out.println("Enter the price ");
                prr=sc.nextDouble();
                System.out.println("Enter quantity");
                qnn=sc.nextInt();
                i[j]=new Item(nr,prr,qnn);
            }
            for(int j=0;j<3;j++)
            {
               i[j].display();
            }
        }
    }

