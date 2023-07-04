/*
90. Write a Java program to check the number of times the two substrings appearing anywhere in a string.

Sample Output:

The given string is: Thisisthethesis
Are the appearance of 'the' and 'is' equal? false
*/

public class Task {

    public static boolean isAndTheEquality(String stng) {
        int l = stng.length();
        int st_the = 0;
        int st_is = 0;

        for (int i=0; i<l-3; i++) {
            String tmp = stng.substring(i, i+3);
            if (tmp.equals("the")) {
                st_the++;   
            }
            String tmp2 = stng.substring(i, i+2);
            if (tmp2.equals("is")) {
                st_is++;
            }
        }
        if(st_is == st_the) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "Thisisthethesis";
        System.out.println("The given string is: " + str1);
        System.out.println("Are the appearance of 'the' and 'is' equal? " + isAndTheEquality(str1));
    }
}
