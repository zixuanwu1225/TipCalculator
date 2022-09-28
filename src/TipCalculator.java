import java.text.*;
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        DecimalFormat currency = new DecimalFormat("$###0.00");
        Scanner s = new Scanner(System.in);
        //variables section + questions + expressions
        System.out.println("How many people are with you?");
        int people = s.nextInt();
        System.out.println("What tip percent would you like to input?");
        int tip = s.nextInt();
        System.out.println("What is your total bill right now?");
        double bill = s.nextDouble();
        double newTip = ((double)tip/100);
        double tipTotal = (newTip*bill);
        //should fix for better accuracy because at the moment will not provide a double and instead a integer(fixed)
        System.out.println("____________________________________________");
        System.out.println("Your total tip value comes out to: " + currency.format(tipTotal));
        System.out.println("____________________________________________");
        System.out.println("Your total bill comes out to: " + currency.format(tipTotal+bill));
        System.out.println("____________________________________________");
        System.out.println("Each person should pay: " + currency.format(tipTotal/people) + " in tips");
        System.out.println("____________________________________________");
        System.out.println("Each person should pay: " + currency.format((tipTotal+bill)/people));
        System.out.println("____________________________________________");
        //prints out all statements of receipt
    }
}