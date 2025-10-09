
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int leng=0;
        String longname="";

        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
            int len=parts[0].length();
            String name = parts[0];
            if(leng<len){
                leng=len;
                longname=name;
            }
            
        }
        System.out.println("Longest name: "+longname);

        if (count > 0) {
            System.out.println("Average of the birth years: " + (1.0 * sum / count));
        } else {
            System.out.println("No input.");
        }


    }
}
