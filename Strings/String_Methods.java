public class String_Methods {
    public static void main(String[] args) {
        String str = "Dhruv Panwala";
        String str1 = "Living in Surat";
        String str2 = "ATM PIN - 1234";

        // // charAt()
        // char ch = str.charAt(6);
        // System.out.println(ch);

        // // compareTo()
        // int i = str.compareTo(str1);
        // System.out.println(i);

        // // concat()
        // String str3 = str.concat(str1);
        // System.out.println(str3);

        // // contains()
        // boolean b = str.contains("Dhruv");
        // System.out.println(b);

        // endsWith()
        // boolean b = str.endsWith("wa");
        // System.out.println(b);

        // equals()
        // boolean b = str.equals("Dhruv Panwala");
        // System.out.println(b);

        // equalsIgnoreCase()
        // boolean b = str.equalsIgnoreCase("dhruv panwala");
        // System.out.println(b);

        // format()
        // String str3 = String.format("My name is %s", str);
        // System.out.println(str3);

        // getBytes()
        // byte[] b = str.getBytes();
        // for (byte c : b) {
        //     System.out.println(c);
        // }

        // getChars()
        // char[] ch = new char[10];
        // str.getChars(0, 5, ch, 0);
        // for (char c : ch) {
        //     System.out.println(c);
        // }

        // indexOf()
        // int i = str.indexOf('P');
        // System.out.println(i);

        // intern()
        // String str4 =  new String("Dhruv Panwala");
        // String str5 = new String("Dhruv Panwala");
        // System.out.println(str4 == str5); // false
        // str4 = str4.intern();
        // str5 = str5.intern();
        // System.out.println(str4 == str5); // true

        // isEmpty()
        // boolean b = "a".isEmpty();
        // System.out.println(b);

        // join()
        // String str3 = String.join("\n", str, str1);
        // System.out.println(str3);

        // lastIndexOf()
        // int i = str.lastIndexOf('a');
        // System.out.println(i);

        // length()
        // int i = str.length();
        // System.out.println(i);

        // replace()
        // String str3 = str.replace('D', 'P');
        // System.out.println(str3);

        // replaceAll()
        // String str3 = str.replaceAll("Dhruv", "Panwala");
        // System.out.println(str3);

        // split()
        // String[] str3 = str.split(" ");
        // for (String s : str3) {
        //     System.out.println(s);
        // }

        // startsWith()
        // boolean b = str.startsWith("Dhruv");
        // System.out.println(b);

        // substring()
        // String str3 = str.substring(6);
        // System.out.println(str3);

        // toCharArray()
        // char[] ch = str.toCharArray();
        // for (char c : ch) {
        //     System.out.println(c);
        // }
        
        // toLowerCase()
        // String str3 = str.toLowerCase();
        // System.out.println(str3);

        // toUpperCase()
        // String str3 = str.toUpperCase();
        // System.out.println(str3);

        // trim()
        // String str3 = str2.trim();
        // System.out.println(str3);

        // valueOf()
        // String str3 = String.valueOf(1234);
        // System.out.println(str3);

        // String str3 = String.valueOf(1234.567);
        // System.out.println(str3);

    }
}

/*
Java String Methods:
String charAt() - returns the character at the specified index
-> char ch = str.charAt(0);

String compareTo() - compares two strings lexicographically
-> int i = str.compareTo(str1);

String concat() - concatenates two strings
-> String str3 = str.concat(str1);


String contains() - returns true if charSequence is found in this string
-> boolean b = str.contains("Dhruv");

String endsWith() - checks if this string ends with given suffix
-> boolean b = str.endsWith("wala");

String equals() - compares this string to the specified object
-> boolean b = str.equals(str1);

equalsIgnoreCase() - compares this String to another String, ignoring case considerations
-> boolean b = str.equalsIgnoreCase(str1);

String format() - returns formatted string
-> String str3 = String.format("My name is %s", str);

String getBytes() - encodes this String into a sequence of bytes using the platform's default charset
-> byte[] b = str.getBytes();

String getChars() - copies characters from this string into the destination character array
-> str.getChars(0, 5, str1, 0);

String indexOf() - returns the index within this string of the first occurrence of the specified character or -1, if the character does not occur
-> int i = str.indexOf('D');

String intern() - returns a canonical representation for the string object
-> String str3 = str.intern();
String str4 =  new String("Dhruv Panwala");
String str5 = new String("Dhruv Panwala");
System.out.println(str4 == str5); // false
str4 = str4.intern();
str5 = str5.intern();
System.out.println(str4 == str5); // true

String isEmpty() - returns true if, and only if, length() is 0
-> boolean b = str.isEmpty();

String join() - returns a string joined with given delimiter
-> String str3 = String.join("-", str, str1);

String lastIndexOf() - returns the index within this string of the last occurrence of the specified character or -1 if the character does not occur
-> int i = str.lastIndexOf('a');

String length() - returns the length of this string
-> int i = str.length();

String replace() - returns a string replacing all the old char or CharSequence to new char or CharSequence
-> String str3 = str.replace('D', 'P');

String replaceAll() - replaces each substring of this string that matches the given regular expression with the given replacement
-> String str3 = str.replaceAll("Dhruv", "Panwala");

String split() - splits this string around matches of the given regular expression
-> String[] str3 = str.split(" ");

String startsWith() - tests if this string starts with the specified prefix
-> boolean b = str.startsWith("Dhruv");

String substring() - returns a string that is a substring of this string
-> String str3 = str.substring(0, 5);

String toCharArray() - converts this string to a new character array
-> char[] ch = str.toCharArray();

String toLowerCase() - converts all of the characters in this String to lower case using the rules of the default locale
-> String str3 = str.toLowerCase();

String toUpperCase() - converts all of the characters in this String to upper case using the rules of the default locale
-> String str3 = str.toUpperCase();

String trim() - returns a string whose value is this string, with any leading and trailing whitespace removed
str3 = "   Dhruv Panwala   ";
-> String str3 = str.trim();

String valueOf() - returns the string representation of the passed argument
-> String str3 = String.valueOf(1234);

 */