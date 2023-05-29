import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Please enter the user's name");
        String userName = input.nextLine().toLowerCase();

        System.out.println("Enter the user's last name");
        String userLastName = input.nextLine().toUpperCase();

        System.out.println("Enter their height in meters");
        double userHeight = input.nextDouble();

        System.out.println("Enter their weight in kilograms");
        double userWeight = input.nextDouble();

        User user = new User(userName, userLastName, userHeight, userWeight);

        System.out.println("Hello " + user.getName() + " " + user.getLastName() + "!");
        System.out.println("Your Body Mass Index is: " + user.calculateBMI());
        System.out.println("According to the World Health Organization (WHO), your weight is classified as " + user.classifyBMI() + ".");
    }
}
