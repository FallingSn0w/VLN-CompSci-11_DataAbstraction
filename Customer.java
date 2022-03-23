import java.awt.image.PackedColorModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Customer {
    private int accountNumber;
    static ArrayList<Deposit> deposits;
    static ArrayList<Withdraw> withdraws;
    public static double checkBalance;
    public static double savingBalance;
    private double savingRate;
    private static String name;
    public static final String CHECKING = "CHECKING";
    public static final String SAVING = "SAVING";
    private static final int OVERDRAFT = 100;

    Customer(){
        this.accountNumber = 0;
        this.deposits = new ArrayList<Deposit>();
        this.withdraws = new ArrayList<Withdraw>();
        this.checkBalance = 0;
        this.savingBalance = 0;
        this.savingRate = 0;
        this.name = "";
    }
    Customer(String name, int accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkBalance;
        this.savingBalance = savingBalance;
    }

    public String getName() {
        System.out.println("Please enter a name: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        this.name = input;
        return name;
    }
    public static String setName(String name){return name;}
    public int getAccountNumber(){
        accountNumber++;
        return accountNumber;
    }
    public static double getCheckBalance(){
        checkBalance = 0;
        for(double i:Main.checking)
            checkBalance+=i;
        System.out.print("Checking: $"+checkBalance);
        return checkBalance;
    }
    public static double getSavingBalance(){
        savingBalance = 0;
        for(double i:Main.savings)
            savingBalance+=i;
        System.out.print("Savings: $"+savingBalance);
        return savingBalance;
    }
    public static Double setSavingBalance(double savingBalance){
        return savingBalance;
    }
    public static Double setCheckingBalance(double checkBalance){
        return checkBalance;
    }
    public static String getCustomerProfile(double checkBalance,double savingBalance){
        System.out.println("Name: "+setName(name)+"   Savings: $"+savingBalance+"   Checking: $"+checkBalance);
        return "";
    }

    public static void deposit(){
        Deposit aDeposit = new Deposit(0,new Date(),"");
        Deposit newDeposit = new Deposit(aDeposit.getAmount(),aDeposit.getDate(),aDeposit.getAccount(Main.checking, Main.savings));
        newDeposit.toString();
        deposits.add(newDeposit);
    }
    public static void withdraw(){
        Withdraw aWithdraw = new Withdraw(0,new Date(), "");
        Withdraw newWithdraw = new Withdraw(aWithdraw.getAmount(),aWithdraw.getDate(), aWithdraw.getAccount(Main.checking,Main.savings));
        newWithdraw.toString();
        withdraws.add(newWithdraw);
    }


    static boolean checkOverdraft(double amt, String account){
        if(amt>OVERDRAFT){return true;}else{return false;}
    }


    public static void displayDeposits(){for(Deposit d : deposits){System.out.println(d);}}
    public static void displayWithdraws(){for(Withdraw w : withdraws){System.out.println(w);}}

}
