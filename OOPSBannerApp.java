public class OOPSBannerApp {

    // Helper Method for O
    public static String getOPattern() {
        return String.join("\n",
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** ");
    }

    // Helper Method for P
    public static String getPPattern() {
        return String.join("\n",
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    ");
    }

    // Helper Method for S
    public static String getSPattern() {
        return String.join("\n",
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** ");
    }

    public static void main(String[] args) {

        String[] banner = {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        for (String letter : banner) {
            System.out.println(letter);
        }
    }
}