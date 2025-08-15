import java.util.Scanner;

public class UsingnextLinetoReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = scanner.nextLine(); 

        System.out.println("Your full sentence is: " + sentence);

        scanner.close(); 
    }
}
