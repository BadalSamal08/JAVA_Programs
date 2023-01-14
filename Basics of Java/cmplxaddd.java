public class cmplxaddd {
    int real,imag;
    cmplxaddd(int r1,int img1)
    {
        real=r1;
        imag=img1;
    }
    void add(cmplxaddd c1,cmplxaddd c2)
    {
        c1.real=c1.real+c2.real;
        c1.imag=c1.imag+c2.imag;
    }
    void display()
    {
        System.out.println(real+imag);
    }
    public static void main(String args[])
    {
        cmplxaddd c1=new cmplxaddd(2,3);
        cmplxaddd c2=new cmplxaddd(4,5);
        c1.add(c1,c2);
        c1.display();

    }
}
