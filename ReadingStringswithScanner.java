
import java.util.Scanner;

public class ReadingStringswithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullname = scanner.nextLine(); 

        System.out.println("Your full name is: " + fullname); 

        scanner.close(); 
    }
}
