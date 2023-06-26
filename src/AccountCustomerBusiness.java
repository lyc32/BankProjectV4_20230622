public class AccountCustomerBusiness extends Account implements CheckBalance, SetAddress
{
    private double balance;
    private final String accountType = "Business Account";
    String address;

    public AccountCustomerBusiness(String userId, String userPass)
    {
        super(userId,userPass);
    }

    public AccountCustomerBusiness(String userId, String userPass, String userName, double balance)
    {
        super(userId,userPass,userName);
        this.balance = balance;
    }
    @Override
    public void setAddress(Address address)
    {
        System.out.println("This is a Business, please use [void]");
    }
    @Override
    public void setAddress(String address)
    {
        this.address = address;
    }
    @Override
    public String getAddress()
    {
        return this.address;
    }
    @Override
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    @Override
    public double getBalance()
    {
        return this.balance;
    }

    @Override
    void print()
    {
        System.out.println("==========================");
        System.out.println(String.format("%10s : %s","User Name"  , super.getUserName()));
        System.out.println(String.format("%10s : %s","User Id"    , super.getUserId()));
        System.out.println(String.format("%10s : %s","AccountType", this.accountType));
        System.out.println("==========================");
        System.out.println("[Address]");
        System.out.println(this.address);
        System.out.println("==========================");
    }
}
