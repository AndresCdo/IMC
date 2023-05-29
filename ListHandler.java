import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

class ListHandler {
    private ArrayList<User> userList;
    private Scanner input;
    private int maxUsers;

    public ListHandler(int maxUsers) {
        this.userList = new ArrayList<>();
        this.input = new Scanner(System.in).useLocale(Locale.US);
        this.maxUsers = maxUsers;
    }

    public void collectUsers() {
        for (int i = 0; i < maxUsers; i++) {
            System.out.println("Enter the user's name: ");
            String userName = input.nextLine().toLowerCase();
            System.out.println("Enter the user's last name: ");
            String userLastName = input.nextLine().toUpperCase();
            System.out.println("Enter their height in meters: ");
            double userHeight = input.nextDouble();
            System.out.println("Enter their weight in kilograms: ");
            double userWeight = input.nextDouble();
            input.nextLine();  // consume newline left-over

            User user = new User(userName, userLastName, userHeight, userWeight);
            userList.add(user);
        }
    }

    public void printUsers() {
        for (User user : userList) {
            System.out.println("Hello " + user.getName() + " " + user.getLastName() + "!");
            System.out.println("Your Body Mass Index is: " + user.calculateBMI());
            System.out.println("According to the World Health Organization (WHO), your weight is classified as " + user.classifyBMI() + ".");
        }
        input.close();
    }
}
