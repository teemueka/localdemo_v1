import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocalizedGreeting {

    public static void main(String[] args) {
        // Prompt user to select a language
        System.out.println("Select a language: ");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Spanish");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Set the locale based on user's choice
        Locale locale = switch (choice) {
            case 1 -> new Locale("en", "US");
            case 2 -> new Locale("fr", "FR");
            case 3 -> new Locale("es", "ES");
            default -> {
                System.out.println("Invalid choice. Defaulting to English.");
                yield new Locale("en", "US");
            }
        };

        // Load the resource bundle for the selected locale
        ResourceBundle messages = ResourceBundle.getBundle("Messages", locale);

        // Display the localized greeting message
        System.out.println(messages.getString("greeting"));

        scanner.close();
    }
}


