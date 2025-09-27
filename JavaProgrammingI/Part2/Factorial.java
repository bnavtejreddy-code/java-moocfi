
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int fact=1;
        int n = Integer.valueOf(scanner.nextLine());
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.println("Factorial: "+fact);

    }
}
