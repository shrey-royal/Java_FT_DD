public class Task1 {
    public static void main(String[] args) {
        String input = "<p>This is a <b>bold</b> statement.</p>";
        String output = removeHtmlTags(input);

        System.out.println(output);
    }

    public static String removeHtmlTags(String input) {
        return input.replaceAll("<[^>]*>", "");
    }
}
