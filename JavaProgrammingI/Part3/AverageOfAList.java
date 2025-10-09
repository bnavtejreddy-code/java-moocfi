
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> list=new ArrayList<>();
        
        while(true){
            int n=scanner.nextInt();
            if(n==-1){
                break;
            }
            list.add(n);
        }
        int sum=0;
        for(int i:list){
            sum=sum+i;
        }
        System.out.println("Average: "+(float)sum/list.size());
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
