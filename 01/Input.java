
// import java.util.Scanner;

// public class Input {
//     public static void main(String[] args) {
//         System.out.println("Give Your Name : ");
//          Scanner sc =new Scanner(System.in);
//          String Name=sc.nextLine();
//          System.out.print("Your Name is "+ Name);
//          sc.close();
//     }
// }
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. String (Full Line)
        System.out.print("Enter your Full Name: ");
        String name = sc.nextLine();

        // 2. Integer (Pura number)
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        // 3. Float (Decimal - Chota)
        System.out.print("Enter your Experience (e.g. 1.5): ");
        float experience = sc.nextFloat();

        // 4. Double (Decimal - Bada/Precise)
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        // 5. Long (Bade numbers like Phone Number)
        System.out.print("Enter Mobile Number: ");
        long mobile = sc.nextLong();

        // 6. Boolean (true or false)
        System.out.print("Are you a Student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        // --- Output Section ---
        System.out.println("\n--- Collected Data ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Price: " + price);
        System.out.println("Mobile: " + mobile);
        System.out.println("Student Status: " + isStudent);

        sc.close();
    }
}