import java.util.*;

// Class to store banner font patterns
class BannerFont {

    private Map<Character, String[]> patterns;

    // Constructor to initialize patterns
    public BannerFont() {
        patterns = new HashMap<>();

        // Pattern for O
        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for P
        patterns.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        // Pattern for S
        patterns.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    // Function to get pattern
    public String[] getPattern(char ch) {
        return patterns.get(ch);
    }
}

// Main class
public class OOPSBannerApp {

    // Simple function to print plain text
    public static void printSimple() {
        System.out.println("OOPS");
    }

    // Function to display banner
    public static void displayBanner(String text, BannerFont font) {
        int height = 5;

        for (int row = 0; row < height; row++) {
            for (char ch : text.toCharArray()) {
                String[] pattern = font.getPattern(ch);
                System.out.print(pattern[row] + "  ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        BannerFont font = new BannerFont();

        // Step 1: Simple display
        printSimple();

        System.out.println();

        // Step 2: Banner display
        displayBanner("OOPS", font);
    }
}