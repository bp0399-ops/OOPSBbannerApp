import java.util.*;

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create character pattern mappings
        List<CharacterPatternMap> patterns = new ArrayList<>();

        patterns.add(new CharacterPatternMap('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        }));

        patterns.add(new CharacterPatternMap('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        }));

        patterns.add(new CharacterPatternMap('S', new String[]{
                " *****   ",
                "*     *  ",
                "*        ",
                " *****   ",
                "      *  ",
                "*     *  ",
                " *****   "
        }));

        String word = "OOPS";

        // Build banner output
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                for (CharacterPatternMap map : patterns) {
                    if (map.getCharacter() == c) {
                        line.append(map.getPattern()[row]).append("  ");
                    }
                }
            }

            System.out.println(line);
        }
    }
}