public class String_Comparision {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = new String("Hello");
        String s4 = "Dhruv";

        // System.out.println(s1.equalsIgnoreCase(s2));
        // System.out.println(s1.equals(s3));
        // System.out.println(s1.equals(s4));

        // System.out.println(s1 == s3);   //false (because both refer to different instance)
        // System.out.println(s1 == s2);   //true (because both refer to same instance)

        System.out.println(s1.compareTo(s2)); // -32
        System.out.println(s1.compareTo(s3)); // 0
        System.out.println(s1.compareTo(s4)); // -3
    }
}

/*
 * String Comparision can be done in three ways
 * 1. By using equals() method
 * 2. By using == operator
 * 3. By using compareTo() method
    - s1 == s2 : The method returns 0.
    - s1 > s2 : The method returns a positive value.
    - s1 < s2 : The method returns a negative value.
 */