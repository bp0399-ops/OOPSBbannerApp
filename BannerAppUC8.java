import java.util.HashMap;
import java.util.Map;

public class BannerAppUC8 {

    // Part 1: Create Map for storing character patterns
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    // Part 2: Method to display banner
    public static void displayBanner(String word, Map<Character, String[]> map) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = map.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // Part 3: Main Method
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        String message = "OOPS";

        displayBanner(message, patternMap);
    }
}