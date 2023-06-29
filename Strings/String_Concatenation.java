public class String_Concatenation {
    public static void main(String[] args) {
        String s1 = "Dhruv";
        String s2 = "Panwala";

        System.out.println(s1 + " " + s2); // DhruvPanwala
        System.out.println(s1.concat(s2)); // DhruvPanwala
        System.out.println(s1.concat(" ").concat(s2)); // Dhruv Panwala

        //Substring

        System.out.println(s1.substring(2,4)); // ru
    }
}

/*
 * String Concatenation Operator (+): 
 * 
 * two ways:
 *  1. By using + operator
 *  2. By using concat() method
 * 
 * 
 * SubString Method:
 *  - beginIndex: inclusive  // endindex: exclusive
 * syntax: 
 * string.substring(int beginIndex);
 * string.substring(int beginIndex, int endIndex);
 */