

 class ovrdingdemo {
    void display()
    {
        System.out.println("Badal Samal");
    }
}
class B extends ovrdingdemo
{
        void display()
        {
            System.out.println("Sagar Samal");
        }
        public static void main(String args[])
        {
            B b1=new B();
            b1.display();
        }
}
