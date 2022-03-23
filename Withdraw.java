import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Withdraw {
    private double amountW;
    private Date date;
    private String account;

    Withdraw(double amountW, Date date, String account){
        this.amountW = amountW;
        this.date = date;
        this.account = account;
    }

    public double getAmount(){
        System.out.println("Please enter an amount to withdraw: ");
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        if(Customer.checkOverdraft(input,this.account)==true){
            System.out.println("You cannot withdraw more than $100.");
            getAmount();
        }else{amountW = input;}
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
        System.out.println("Please select which account you would like to withdraw from: ");
        System.out.println("\"CHECKING\", or \"SAVINGS\".");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        account = input;
        if(input.equals("CHECKING")){
            checking.add(-setAmount(amountW));}
        if(input.equals("SAVINGS")){
            savings.add(-setAmount(amountW));}
        return account;
    }
    public String setAccount(String account){return account;}
    public String toString(){
        System.out.println("Withdrawal of: $"+this.amountW+"   Date: "+this.date+ "   from account: "+this.account);
        return "";
    }
}
