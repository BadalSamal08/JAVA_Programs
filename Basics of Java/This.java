class This
{
    int roll,mark;
    This(int roll,int mark)
    {
        this.roll=roll;
        this.mark=mark;
    }
    void display()
    {
        System.out.println(roll+" "+mark);
    }
    public static void main(String args[])
    {
        This t1=new This(1,34);
        t1.display();
    }
}