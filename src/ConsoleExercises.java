import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        The value of pi is approximately 3.14.
        System.out.format("The value of pi is approximately %s \n", pi);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userInput = scanner.nextInt();

        System.out.println("You entered: --> " + userInput + " <--");
    }
}