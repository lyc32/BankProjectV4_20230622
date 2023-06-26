import java.util.Scanner;

public class Runner
{
    public Runner(DataBase dataBase)
    {
        System.out.println("Welcome to AB bank.");
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            // account type
            int type;
            for(;true;)
            {
                System.out.println("Please select your Account Type:\n 1 for personal\n 2.for business\n 3.for Manager");
                type = scanner.nextInt();
                if(type == 1 || type == 2 || type == 3)
                {
                    break;
                }
                else
                {
                    System.out.println("You enter a wrong number, please try again\n");
                }
            }

            Account tmpAccount = null;

            for(;true;)
            {
                // login
                System.out.println("Please enter your Account Id:");
                String id = scanner.next();
                System.out.println("Please enter your password:");
                String password = scanner.next();
                if(type == 1)
                {
                    tmpAccount = new AccountCustomerPersonal(id,password);
                    tmpAccount = tmpAccount.login(dataBase.perAccountList);
                    if(tmpAccount != null)
                    {
                        tmpAccount.print();
                        System.out.println("Do you want to check your Balance?");
                        if(("Yes").equals(scanner.next()))
                        {
                            System.out.println("your account balance is: " + ((AccountCustomerPersonal) tmpAccount).getBalance());
                        }
                        break;
                    }
                    else
                    {
                        System.out.println("your ID and password not match\nDo you want to try again.");
                        String tryAgain = scanner.next();
                        if(tryAgain.equals("No"))
                        {
                            break;
                        }
                    }
                }
                else if(type == 2)
                {
                    tmpAccount = new AccountCustomerBusiness(id,password);
                    tmpAccount = tmpAccount.login(dataBase.busAccountList);
                    if(tmpAccount != null)
                    {
                        tmpAccount.print();
                        System.out.println("Do you want to check your Balance?");
                        if(("Yes").equals(scanner.next()))
                        {
                            System.out.println("your account balance is: " + ((AccountCustomerBusiness) tmpAccount).getBalance());
                        }
                        break;
                    }
                    else
                    {
                        System.out.println("your ID and password not match\nDo you want to try again.");
                        String tryAgain = scanner.next();
                        if(tryAgain.equals("No"))
                        {
                            break;
                        }
                    }
                }
                else
                {
                    tmpAccount = new AccountManger(id,password);
                    tmpAccount = tmpAccount.login(dataBase.magAccountList);
                    if( tmpAccount != null)
                    {
                        tmpAccount.print();
                        System.out.println("What you want to do?\n 1.add new user\n 2.list all users");
                        int choose = scanner.nextInt();

                        if(choose == 1)
                        {
                            ((AccountManger) tmpAccount).addNewUser(dataBase);
                        }
                        else
                        {
                            ((AccountManger) tmpAccount).listUsers(dataBase);
                        }
                        break;
                    }
                    else
                    {
                        System.out.println("your ID and password not match\nDo you want to try again.");
                        String tryAgain = scanner.next();
                        if(tryAgain.equals("No"))
                        {
                            break;
                        }
                    }
                }
            }

            System.out.println("Do you want to logout or re-login? \nEnter Yes to logout");
            if(("Yes").equals(scanner.next()))
            {
                break;
            }
        }

    }
}
