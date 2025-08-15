
import java.util.Scanner;

public class ReadingDoubleswithScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first float:");
        double x = scanner.nextDouble();
        System.out.print("Enter the second float:");
         double y = scanner.nextDouble();
       
        double  average = (x+y)/2;
        System.out.println("The  average is : " + average);
    }
}
