class Cmplxmul
{
    double real1,real2,img1,img2,real,img;
    Cmplxmul(int rl1,int rl2,int im1,int im2)
    {
        real1=rl1;
        real2=rl2;
        img1=im1;
        img2=im2;
    }
    void mul()
    {
        real=(real1*real2-img1*img2);
        img=(real1*img2+img1*real2);
    }
    void display()
    {
        System.out.println(real+" + "+img+"i");
    }
    public static void main(String args[])
    {
        Cmplxmul c1=new Cmplxmul(1,2,3,4);
        c1.mul();
        c1.display();
    }
}
