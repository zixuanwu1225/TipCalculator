import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many people are with you?");
        int people = s.nextInt();
        System.out.println("What tip percent would you like to input?");
        int tip = s.nextInt();
        System.out.println("What is your total bill right now?");
        double bill = s.nextDouble();
    }
}
