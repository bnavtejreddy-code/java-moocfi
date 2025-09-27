
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int m = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int sum=0;
        int n = Integer.valueOf(scanner.nextLine());
        for(int i=m;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The sum is "+sum);


    }
}
