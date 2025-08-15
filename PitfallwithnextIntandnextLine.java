 import java.util.Scanner;
public class PitfallwithnextIntandnextLine {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter an integer");
        int number=scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter sentence:");
        String sentence=scanner.nextLine();
        System.out.println("number"+number);
        System.out.println("sentence:"+sentence);
    
    }
}
