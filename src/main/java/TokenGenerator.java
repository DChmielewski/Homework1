import java.util.Random;
import java.util.Scanner;


public class TokenGenerator {
    public static void main(String[] args) {
        //metoda random
        Random randomNumbers = new Random();
        //tablica charow
        char[] asciAll = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&*()".toCharArray();
        int length = 5;
        int length2 = 10;
        int length3 = 15;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter token length (5, 10 or 15): ");
        int lenghtFromDescription = scanner.nextInt();

        //pętelka dla 5
        if (lenghtFromDescription == length) {
            char[] tokenGenerator = new char[length];
            for (int i = 0; i < length; i++)
                tokenGenerator[i] = asciAll[randomNumbers.nextInt(asciAll.length)];
            System.out.println("Your token is: " + new String(tokenGenerator));

            //10
        } else if (lenghtFromDescription == length2) {
            char[] tokenGenerator = new char[length2];

            for (int i = 0; i < length2; i++)
                tokenGenerator[i] = asciAll[randomNumbers.nextInt(asciAll.length)];
            System.out.println("Your token is: " + new String(tokenGenerator));
            //15
        } else if (lenghtFromDescription == length3) {
            char[] tokenGenerator = new char[length3];

            for (int i = 0; i < length3; i++)
                tokenGenerator[i] = asciAll[randomNumbers.nextInt(asciAll.length)];
            System.out.println("Your token is: " + new String(tokenGenerator));
        } else {
            System.out.println("Token length incorrect");
        }
    }
}
