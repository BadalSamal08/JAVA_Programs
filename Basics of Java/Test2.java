abstract class Book {
    abstract void setTitle();
    
}
class Mybook extends Book{
    void setTitle()
    {
        System.out.println("My name is Badal Samal");
    }
}
class Test2
{
    public static void main(String args[])
    {
        Book b1=new Mybook();
        b1.setTitle();

    }
}
