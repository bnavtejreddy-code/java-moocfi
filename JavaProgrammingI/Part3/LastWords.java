
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            
            String a=scanner.nextLine();
            if(a.equals("")){
                break;
            }
            String[] b=a.split(" ");
            System.out.println(b[b.length-1]);

        }


    }
}
