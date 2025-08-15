import java.util.Scanner;

public class ChangingInputDelimiters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        scanner.useDelimiter("##");

        System.out.println("Enter words separated by '##': ");

        while (scanner.hasNext()) {
            System.out.println(scanner.next().trim()); 
        }

        scanner.close();
    }
}
