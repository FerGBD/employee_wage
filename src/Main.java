import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale .setDefault(Locale.US);

        String num;
        double hour, wage, Fwage;
        // num = Number; Fwage = final wage
        System.out.println("What's the employee number ?");
        num = sc.next();
        System.out.println("How many hours been working ?");
        hour = sc.nextDouble();
        System.out.println("Wage per hour:");
        wage = sc.nextDouble();
        Fwage = ( hour * wage);

        System.out.println("Employee number =" + num);
        System.out.printf("Total Salary = U$ %.2f%n", Fwage);




    }
}