 class Amount {
    private String currency;
    private int amnt;
    public Amount(String currency,int amnt)
    {
        super();
        this.currency=currency;
        this.amnt=amnt;
    }
    public void add(Amount that)
    {
        if(!this.currency.equals(that.currency))
        {
            throw new RuntimeException("currencies dont match");
        }
        this.amnt=this.amnt+that.amnt;
    }
    public String toString()
    {
        return amnt+" "+currency;
    }
    
}
class Crncyexp{
    public static void main(String args[])
    {
        Amount m1=new Amount("USD",20);
        Amount m2=new Amount("EUR",20);
        m1.add(m2);
        System.out.println(m1);
    }

}
