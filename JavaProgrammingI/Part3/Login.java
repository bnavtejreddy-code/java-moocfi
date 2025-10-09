
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String use=scanner.nextLine();
        System.out.println("Enter password: ");
        String pass=scanner.nextLine();
        if(use.equals("alex")){
            if(pass.equals("sunshine")){
                System.out.println("You have successfully logged in!");
            }
        
        }else if(use.equals("emma")){
            if(pass.equals("haskell")){
                System.out.println("You have successfully logged in!");
            }
        }else{
            System.out.println("Incorrect username or password!");
        }

    }
}
