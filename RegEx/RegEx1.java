import java.util.regex.*;

public class RegEx1 {
    public static void main(String[] args) {
        // 1st way
        // Pattern p = Pattern.compile(".s");// . represents single character
        // Matcher m = p.matcher("as");

        // boolean b = m.matches();
        // System.out.println(b);

        // 2nd way
        // boolean b2 = Pattern.compile(".s").matcher("as").matches();
        // System.out.println(b2);

        // 3rd way
        // boolean b3 = Pattern.matches(".s", "as");
        // System.out.println(b3);

        // System.out.println(Pattern.matches("[amn]", "abcd"));
        // System.out.println(Pattern.matches("[amn]", "a"));
        // System.out.println(Pattern.matches("[amn]", "ammmmmmmmna"));

        // System.out.println(Pattern.matches("[amn]?", "a"));
        // System.out.println(Pattern.matches("[amn]?", "aaa"));
        // System.out.println(Pattern.matches("[amn]?", "aammmmmmmmna"));
        // System.out.println(Pattern.matches("[amn]?", "aazzta"));
        // System.out.println(Pattern.matches("[amn]?", "am"));

        // System.out.println(Pattern.matches("[amn]+", "a")); //true
        // System.out.println(Pattern.matches("[amn]+", "aaa")); //true
        // System.out.println(Pattern.matches("[amn]+", "aammmmmmmmna")); //true
        // System.out.println(Pattern.matches("[amn]+", "aazzta")); //false
        // System.out.println(Pattern.matches("[amn]+", "am")); //true

        // System.out.println(Pattern.matches("[amn]*", "ammmna")); //true
        // System.out.println(Pattern.matches("[amn]*", "12"));  //true
        // System.out.println(Pattern.matches("[amn]*", ""));  //true

        // System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
        // System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun2")); //false
        // System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun@32"));//false
        // System.out.println(Pattern.matches("[a-zA-Z0-9]{6,}", "arun32qwertyuo34567890xcvb"));//true
        // System.out.println(Pattern.matches("[[a-z]*A-Z0-9]{6,10}", "aarund2348"));//true

        // System.out.println(Pattern.matches("\\d", "1"));    //true
        // System.out.println(Pattern.matches("\\d", "123"));  //false
        // System.out.println(Pattern.matches("[\\d[a-z]]*", "123abc"));  //false
        // System.out.println(Pattern.matches("[\\d[a-z]\\s]*", " 1 2 3 "));  //true

        //start method - returns first matched character index
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("abaabaaab");

        while(m.find()) {
            System.out.println(m.start() + " " + m.group());
        }

        //end method - returns last matched character index + 1
        Pattern p1 = Pattern.compile("a");
        Matcher m1 = p1.matcher("abaabaaab");

        while(m1.find()) {
            System.out.println(m1.end() + " " + m1.group());
        }
    }
}

/*
 * Regex -> Regular Expression
 * > Used to match patterns in strings
 * > in java regex api is in java.util.regex
 * The Matcher and Pattern classes provide the facility of Java regular expression. The java.util.regex package provides following classes and interfaces for regular expressions.
    
    1. MatchResult interface - It is the result of the last match operation.
    2. Matcher class - It is the engine that interprets the pattern and performs match operations against an input string.
    3. Pattern class - It is the compiled version of a regular expression.
    4. PatternSyntaxException class - It is the exception that is thrown when a syntax error is detected in a regular expression pattern.


    Matcher Class Methods - it implements MatchResult interface

    1. public boolean matches() - test whether the regular expression matches the pattern.
    2. public boolean find() - finds the next expression that matches the pattern.
    3. public boolean find(int start) - finds the next expression that matches the pattern from the given start number.
    4. public String group() - returns the matched subsequence.
    5. public int start() - returns the starting index of the matched subsequence.
    6. public int end() - returns the ending index of the matched subsequence.
    7. public int groupCount() - returns the total number of the matched subsequence.

    Pattern Class Methods

    1. public static Pattern compile(String regex) - compiles the given regular expression into a pattern.
    2. public Matcher matcher(CharSequence input) - creates a matcher that matches the given input with pattern.
    3. public static boolean matches(String regex, CharSequence input) - tests whether the regular expression matches the pattern.
    4. public String[] split(CharSequence input) - splits the given input string around matches of the pattern.
    5. public String pattern() - returns the regular expression. 


    Character classes - predefined character classes

    1. [abc] - a, b, or c (simple class)
    2. [^abc] - Any character except a, b, or c (negation)
    3. [a-zA-Z] - a through z or A through Z, inclusive (range)
    4. [a-d[m-p]] - a through d, or m through p: [a-dm-p] (union)
    5. [a-z&&[def]] - d, e, or f (intersection)
    6. [a-z&&[^bc]] - a through z, except for b and c: [ad-z] (subtraction)
    7. [a-z&&[^m-p]] - a through z, and not m through p: [a-lq-z](subtraction)

    Regex Quantifiers - specifies number of occurrences of a character to match

    1. X? - X occurs once or not at all
    2. X+ - X occurs once or more times
    3. X* - X occurs zero or more times
    4. X{n} - X occurs n times only
    5. X{n,} - X occurs n or more times
    6. X{y,z} - X occurs at least y times but less than z times


    Regex Metacharacters - characters with special meaning

    1. . - Any character (may or may not match terminator)
    2. \d - Any digits, short of [0-9]
    3. \D - Any non-digit, short for [^0-9]
    4. \s - Any whitespace character, short for [\t\n\x0B\f\r]
    5. \S - Any non-whitespace character, short for [^\s]
    6. \w - A word character, short for [a-zA-Z_0-9]
    7. \W - A non-word character [^\w]
    8. \b - A word boundary
    9. \B - A non word boundary
*/