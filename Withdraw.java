import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Withdraw{
    private double amountW;
    private String account;
    private Date date;

    Withdraw(double amountW, Date date, String account){
        this.amountW = amountW;
        this.account = account;
        this.date = date;
    }
    public double getAmount(){
        System.out.println("Please enter amount to withdraw: ");
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        if(Customer.checkOverdraft(input,this.account)==true){
            System.out.println("You cannot withdraw more than $100.");
            getAmount();
        }
        else{
            amountW = input;}
        return amountW;
    }
    public double setAmount(double amountW){
        return amountW;
    }

    public Date getDate(){
        Date date = new Date();
        return date;
    }
    public Date setDate(Date date){
        return date;
    }

    public String getAccount(ArrayList<Double> checking, ArrayList<Double> savings){
        System.out.println(Main.line.repeat(10));
        System.out.println("Which account do you want to withdraw from: ");
        System.out.println("\"CHECKING\", or \"SAVINGS\".");
        System.out.println("\"X\" to cancel transaction");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        account = input;
        if(input.equals("CHECKING")){
            if(setAmount(amountW)>Customer.getCheckBalance()){
                System.out.println("This is more than you have in this account!");
                getAccount(checking, savings);}
            else{ checking.add(-setAmount(amountW));}}
        if(input.equals("SAVINGS")){
            if(setAmount(amountW)>Customer.getSavingBalance()){
                System.out.println("This is more than you have in this account!");
                getAccount(checking, savings);}
            else{ savings.add(-setAmount(amountW));}}
        if(input.equals("X")){
            System.out.println(Main.line.repeat(10));
            Main.Runner();
        }
        return account;
    }
    public String setAccount(String account){
        return account;
    }

    public String toString(){
        System.out.println("Withdrawal of: $"+this.amountW+"   Date: "+this.date+ "   from account: "+this.account);
        return "";
    }

}
