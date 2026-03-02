/**
 * OOPS Banner App - UC7
 * Store Character Pattern in Inner Static Class
 */
public class BannerApp {

    /**
     * Inner Static Class to store character and its pattern
     */
    public static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to create O pattern
     */
    public static String[] getOPattern() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    /**
     * Utility method to create P pattern
     */
    public static String[] getPPattern() {
        return new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };
    }

    /**
     * Utility method to create S pattern
     */
    public static String[] getSPattern() {
        return new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] letters = {
                new CharacterPatternMap('O', getOPattern()),
                new CharacterPatternMap('O', getOPattern()),
                new CharacterPatternMap('P', getPPattern()),
                new CharacterPatternMap('S', getSPattern())
        };

        // Print row by row using StringBuilder
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap letter : letters) {
                line.append(letter.getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}