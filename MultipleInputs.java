import java.util.Scanner;

public class MultipleInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter multiple words (type 'stop' to end):");

        while (true) {
            String word = scanner.next(); 

            if (word.equalsIgnoreCase("stop")) { 
                break; 
            }

            System.out.println(word); 
        }

        scanner.close();
    }
}
