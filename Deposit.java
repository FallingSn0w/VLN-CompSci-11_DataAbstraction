import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Deposit {
    private double amountD;
    private Date date;
    private String account;

    Deposit(double amountD, Date date, String account){
        this.amountD = amountD;
        this.date = date;
        this.account = account;
    }
    public double getAmount(){
        System.out.println("Please enter an amount to deposit: ");
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        this.amountD = input;
        return amountD;
    }
    public double setAmount(double amountD){
        this.amountD = amountD;
        return amountD;
    }
    public Date getDate(){
        this.date = new Date();
        return date;
    }
    public Date setDate(Date date){
        this.date = date;
        return date;
    }
    public String getAccount(ArrayList<Double> checking, ArrayList<Double> savings){
        System.out.println("Please select which account you would like to deposit to: ");
        System.out.println("\"CHECKING\", or \"SAVINGS\".");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if(input.equals("CHECKING")||input.equals("SAVINGS")){
            this.account = input;
            if (input.equals("CHECKING")) {
                checking.add(setAmount(amountD));}
            if (input.equals("SAVINGS")) {
                savings.add(setAmount(amountD));}
        }
        else{
            System.out.println("Unrecognized account, please try again.");
            getAccount(checking, savings);
        }
        return account;
    }
    public static String setAccount(String account){
        return account;
    }

    public String toString(){
        System.out.println("Deposit of: $"+this.amountD+"   Date: "+this.date+ "   into account: "+ this.account);
        return "";
    }

}
