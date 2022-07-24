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
        System.out.println("Podaj długość tokena (5, 10, 15");
        int lenghtFromDescription = scanner.nextInt();


        if (lenghtFromDescription == size5) {
//            generator = new StringBuilder(chars);
            System.out.println(rnd.toString());
        } else if (lenghtFromDescription == size10) {
//            generator = new StringBuilder(chars);
            System.out.println(rnd.toString());
        } else if (lenghtFromDescription == size15) {
//            generator = new StringBuilder(chars);
            System.out.println(rnd.toString());
        } else {
            System.out.println("Token length incorrect");
        }
    }
}