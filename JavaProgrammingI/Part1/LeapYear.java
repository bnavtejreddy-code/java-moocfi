
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a year: ");
        int year = Integer.parseInt(scanner.nextLine());

        // Leap year rules:
        // 1. Divisible by 4 → leap year
        // 2. But if divisible by 100 → NOT a leap year
        // 3. Unless also divisible by 400 → then leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }


    }
}
