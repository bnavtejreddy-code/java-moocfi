
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old=0;
        String oldname="";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if(Integer.valueOf(parts[1])>old){
                oldname=parts[0];
                old = Integer.valueOf(parts[1]);
            }
            
        }
        
        System.out.println("Name of the oldest: "+oldname);



    }
}
