public class Dblexcep {
    public static void main(String args[])
    {
        try{
            int a[]={1,2,3,4,5};
            a[6]=20/0;
        }
        catch(ArithmeticException |ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
    }
    
}
