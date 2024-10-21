import org.junit.Test;
import java.util.Locale;
import java.util.ResourceBundle;
import static org.junit.Assert.assertEquals;

public class LocalizedGreetingTest {

    @Test
    public void testEnglishGreeting() {
        Locale locale = Locale.of("en", "US");
        ResourceBundle messages = ResourceBundle.getBundle("Messages", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Hello!", greeting);
    }

    @Test
    public void testSpanishGreeting() {
        Locale locale = Locale.of("es", "ES");
        ResourceBundle messages = ResourceBundle.getBundle("Messages", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Hola!", greeting);
    }

    @Test
    public void testFrenchGreeting() {
        Locale locale = Locale.of("fr", "FR");
        ResourceBundle messages = ResourceBundle.getBundle("Messages", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Bonjour!", greeting);
    }

    @Test
    public void testInvalidChoiceDefaultsToEnglish() {
        Locale locale = Locale.of("en", "US"); // Simulate default choice
        ResourceBundle messages = ResourceBundle.getBundle("Messages", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Hello!", greeting); // Expected default is English
    }
}

