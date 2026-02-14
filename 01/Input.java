
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Give Your Name : ");
         Scanner sc =new Scanner(System.in);
         String Name=sc.nextLine();
         System.out.print("Your Name is "+ Name);
         sc.close();
    }
}
