//To divide two complex number.
// import java.util.*;

class Cmplxdiv {
    double real1,real2,img1,img2,real,img;
    Cmplxdiv(int rl1,int rl2,int im1,int im2)
    {
        real1=rl1;
        real2=rl2;
        img1=im1;
        img2=im2;
    }
    void div()
    {
        real=(real1*real2+img1*img2)/(real2*real2+img2*img2);
        img=(img1*real2-real1*img2)/(real2*real2+img2*img2);
    }
    void display()
    {
        System.out.println(real+" + "+img+"i");
    }
    public static void main(String args[])
    {
        Cmplxdiv c1=new Cmplxdiv(4,5,6,7);
        c1.div();
        c1.display();
    }
}
