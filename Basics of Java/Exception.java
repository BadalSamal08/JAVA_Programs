public class Exception {
    public static void main(String args[])
    {
        method1();
        System.out.println("main ended");
    }
    private static void method1()
    {
        method2();
        System.out.println("End of method 1");
    }
    private static void method2()
    {
        try
        {
            String s=null;
            s.length();
            System.out.println("End of method 2");
        }
        catch(NullPointerException ex)
        {
           ex.printStackTrace();
        }
    }
    
}
