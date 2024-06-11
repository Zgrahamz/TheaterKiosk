// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int theatAge;

        System.out.println("Enter your age ");
        theatAge = sca.nextInt();

        if(theatAge >= 21) {
            System.out.println("You get a wristband!");
        }
    }
}