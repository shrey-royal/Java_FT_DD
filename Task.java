public class Task {
    public static void main(String[] args) {
        String word = "Umbrella";
        String letter = "e";
        boolean isPresent = false;

        //convert string to char array
        // char[] charArray = word.toCharArray();
        String[] charArray = word.split("");

        for(String i : charArray) {
            if(i.equals(letter)) {
                isPresent = true;
                break;
            }
        }

        if(isPresent) {
            System.out.println("Letter " + letter + " is present in the word " + word);
        } else {
            System.out.println("Letter " + letter + " is not present in the word " + word);
        }
    }
}
