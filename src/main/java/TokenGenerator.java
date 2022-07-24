import java.util.Random;
import java.util.Scanner;

public class TokenGenerator {
    public static void main(String[] args) {

        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
                + "lmnopqrstuvwxyz!@#$%&";
        Random rnd = new Random();
//        StringBuilder generator = new StringBuilder();
        int size5 = 5;
        int size10 = 10;
        int size15 = 15;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter token length (5, 10 or 15): ");
        int lenghtFromDescription = scanner.nextInt();


        if (lenghtFromDescription == size5) {
//            generator = new StringBuilder(chars);
            System.out.println("Your token (5) is: " + rnd.toString());
        } else if (lenghtFromDescription == size10) {
//            generator = new StringBuilder(chars);
            System.out.println("Your token (10) is: " + rnd.toString());
        } else if (lenghtFromDescription == size15) {
//            generator = new StringBuilder(chars);
            System.out.println("Your token (15) is: " + rnd.toString());
        } else {
            System.out.println("Token length incorrect");
        }
    }
}