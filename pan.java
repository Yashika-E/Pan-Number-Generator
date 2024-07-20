package pannogenerator;

import java.util.Random;
import java.util.Scanner;

public class pan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeric = "0123456789";
        String alphanumeric = alphabet + numeric;
        StringBuilder sb = new StringBuilder();
        Random r = new Random();

        // Generate 4 random alphabetic characters
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }

        // Append the first character of the name
        sb.append(name.charAt(0));

        // Generate 4 random numeric characters
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(numeric.length());
            char randomChar = numeric.charAt(index);
            sb.append(randomChar);
        }

        // Add one random alphanumeric character at the end
        int index = r.nextInt(alphanumeric.length());
        char randomChar = alphanumeric.charAt(index);
        sb.append(randomChar);

        // Print the generated PAN number
        System.out.println("Generated PAN number: " + sb.toString());
    }
}