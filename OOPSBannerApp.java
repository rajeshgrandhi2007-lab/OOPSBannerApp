public class OOPSBannerApp {

    
    public static class CharacterPatternMap {

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