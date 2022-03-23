import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Double> savings = new ArrayList<Double>();
    public static ArrayList<Double> checking  = new ArrayList<Double>();
    public static String line = "=========";

    public static String Runner(){
        System.out.println("What would you like to do? ");
        System.out.println("Type either \"DEPOSIT\", or \"WITHDRAW\". ");
        System.out.println("To see balances, type \"showBalance\".");
        //System.out.println("To see user profile, type \"showProfile\".");
        System.out.println("To see deposit history, type \"showDeposits\"");
        System.out.println("To see withdrawal history, type \"showWithdraws\"");
        //System.out.println(savings.toString());
        //System.out.println(checking.toString());
        //System.out.println(Customer.deposits.toString());
        //System.out.println(Customer.withdraws.toString());
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if(input.equals("DEPOSIT")){Customer.deposit();}
        if(input.equals("WITHDRAW")){Customer.withdraw();}
        if(input.equals("showBalance")){Customer.getCheckBalance(); System.out.println(" "); Customer.getSavingBalance();}
        if(input.equals("showDeposits")){Customer.deposits.toString();}
        if(input.equals("showWithdraws")){Customer.withdraws.toString();}
        //if(input.equals("showProfile")){Customer.getCustomerProfile(Customer.checkBalance, Customer.savingBalance);}

        System.out.println("\n"+line.repeat(10));
        return Runner();
    }

    public static void main(String[] args) {
        Customer aCustomer = new Customer();
        Customer newCustomer = new Customer(aCustomer.getName(),aCustomer.getAccountNumber());
        aCustomer.getCustomerProfile(Customer.checkBalance, Customer.savingBalance);
        System.out.println("\n"+line.repeat(10));
        Runner();
    }
}
