import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Deposit{
    private double amountD;
    private String account;
    private Date date;

    Deposit(double amountD, String account, Date date){
        this.amountD = amountD;
        this.account = account;
        this.date = date;
    }

    public double getAmount(){
        System.out.println(Main.line.repeat(10));
        System.out.println("Please enter amount to deposit: ");
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextDouble()){
            double input = scan.nextDouble();
            this.amountD = input;
        }
        else{
            System.out.println("Not a number value, please try again.");
            getAmount();
        }
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
        System.out.println(Main.line.repeat(10));
        System.out.println("Which account do you want to deposit to?: ");
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
