import java.util.Stack;

public class DataBase
{
    public static Account[] perAccountList;
    public static Account[] busAccountList;
    public static Account[] magAccountList;

    DataBase()
    {
        AccountCustomerPersonal p1 = new AccountCustomerPersonal("AB1001","12345","Jim", 800);
        Address address1 = new Address();
        address1.doorNo = 405;
        address1.stateName = "IL";
        address1.cityName = "Chicago";
        address1.zipCode = "60661";
        address1.streetName = "Madison";
        address1.direction = "W";
        address1.streetNo = 605;
        p1.setAddress(address1);

        AccountCustomerPersonal p2 = new AccountCustomerPersonal("AB1004","12345","Tom", 200);
        Address address2 = new Address();
        address2.doorNo = -1;
        address2.stateName = "IL";
        address2.cityName = "Chicago";
        address2.zipCode = "60608";
        address2.streetName = "32nd";
        address2.direction = "W";
        address2.streetNo = 1346;
        p2.setAddress(address2);

        AccountCustomerPersonal p3 = new AccountCustomerPersonal("AB1005","12345", "Lucky",1000);
        Address address3 = new Address();
        address3.doorNo = 305;
        address3.stateName = "IL";
        address3.cityName = "Chicago";
        address3.zipCode = "60605";
        address3.streetName = "State";
        address3.direction = "S";
        address3.streetNo = 525;
        p3.setAddress(address3);

        AccountCustomerBusiness p4 = new AccountCustomerBusiness("AB1002","12345","Apple", 1000000000);
        p4.setAddress("One Apple Park Way\nCupertino, CA 95014, U.S.A.");
        AccountCustomerBusiness p5 = new AccountCustomerBusiness("AB1003","12345","Google", 20000000);
        p5.setAddress("1600 Amphitheatre Parkway Mountain View\nCA 94043, USA.");


        AccountManger p6 = new AccountManger("M001","12345", "Manger1");
        AccountManger p7 = new AccountManger("M002","12345", "Manger2");

        this.perAccountList = new AccountCustomerPersonal[]{p1,p2,p3};
        this.busAccountList = new AccountCustomerBusiness[]{p4,p5};
        this.magAccountList = new AccountManger[]{p6,p7};
    }
}
