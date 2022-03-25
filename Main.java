import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Double> savings = new ArrayList<Double>();
    public static ArrayList<Double> checking  = new ArrayList<Double>();
    public static String line = "=========";

    public static String Runner(){
        System.out.println("What would you like to do?");
        System.out.println("Type \"DEPOSIT\" or \"WITHDRAW\".");
        System.out.println("To see balance, type \"showBalance\".");
        System.out.println("To see user profile, type \"showProfile\"");
        System.out.println("To see deposit history, type \"showDeposits\".");
        System.out.println("To see withdraw history, type \"showWithdraws\".");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if(input.equals("DEPOSIT")){}
        if(input.equals("WITHDRAW")){}
        if(input.equals("showBalance")){}
        if(input.equals("showProfile")){}
        if(input.equals("showDeposits")){}
        if(input.equals("showWithdraws")){}
        System.out.println(line.repeat(10));

        return Runner();
    }
    public static void main(String[] args) {

    }

}
