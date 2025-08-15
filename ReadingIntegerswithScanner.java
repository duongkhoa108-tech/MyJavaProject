import java.util.Scanner;
public class ReadingIntegerswithScanner {
   public static void main(String[]args) {
       Scanner scanner=new Scanner(System.in);
       System.out.print("Enter the first integers:");
               int a =scanner.nextInt();
        System.out.print("Enter the second integers:");
               int b= scanner.nextInt();
               
  int Sum = a+b;
    System.out.println("The sum is:"+Sum);
   }
}
