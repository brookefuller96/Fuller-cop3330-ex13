import java.util.Scanner;
import java.lang.*;
import static java.lang.System.*;


public class Exercise13 {
    public static void main(String[] args) {
        System.out.println("Enter the principal: ");
        Scanner input = new Scanner(in);
        String principal = input.nextLine();
        double x = Double.parseDouble(principal);

        System.out.println("Enter the rate of interest: ");
        Scanner input2 = new Scanner(in);
        String interest_rate = input2.nextLine();
        double y = Double.parseDouble(interest_rate);

        System.out.println("Enter the number of years: ");
        Scanner input3 = new Scanner(in);
        String years = input3.nextLine();
        int z = Integer.parseInt(years);

        System.out.println("What is the number of times the interest is compounded per year? ");
        Scanner input4 = new Scanner(in);
        String compound = input4.nextLine();
        int n = Integer.parseInt(compound);

        double p_interest = (1 + y * 0.01 /n);
        double b = n * z;
        double comp = x* Math.pow(p_interest, b);
        double interest_rounded = Math.round(comp * 100.0) / 100.0;

        System.out.println("After " + z + " years at " + y + "%, the investment will be worth " + interest_rounded);
    }
}