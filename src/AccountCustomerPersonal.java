public class AccountCustomerPersonal extends Account implements CheckBalance, SetAddress
{
    private final String accountType = "Personal Account";
    private double balance;
    private Address address;

    public AccountCustomerPersonal(String userId, String userPass)
    {
        super(userId,userPass);
    }

    public AccountCustomerPersonal(String userId, String userPass, String userName, double balance)
    {
        super(userId,userPass,userName);
        this.balance = balance;
    }

    @Override
    public void setAddress(Address address)
    {
        this.address = address;
    }

    @Override
    public void setAddress(String address)
    {
        System.out.println("This is a Personal, please use [void setAddress(Address address)]");
    }

    @Override
    public String getAddress()
    {
        return this.address.getAddress();
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
        System.out.println(String.format("%12s : %s","User Name"  , super.getUserName()));
        System.out.println(String.format("%12s : %s","User Id"    , super.getUserId()));
        System.out.println(String.format("%12s : %s","AccountType", this.accountType));
        System.out.println("==========================");
        System.out.println("[Address]");
        System.out.println(this.address.getAddress());
        System.out.println("==========================");
    }
}
