
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
       

        // Write your program here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = Integer.parseInt(scanner.nextLine()); // read full line, parse to int

        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
