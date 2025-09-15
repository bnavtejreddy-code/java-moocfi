
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        System.out.print("Enter your speed: ");
        int speed = Integer.parseInt(scanner.nextLine()); // read as string, then parse to int

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
