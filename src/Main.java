import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Calculations calculations = new Calculations();
        FileHandling fileHandling = new FileHandling();
        int N = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Give the number of rows of the triangle: ");
            N = scanner.nextInt();

            while (N < 1) {
                System.out.print("Please give a positive integer: ");
                N = scanner.nextInt();
            }

        }catch (InputMismatchException e){
            System.out.println("You must give an Integer!");
        }

        calculations.displayTriangle(N);
        fileHandling.writeToFile(N);
    }
}