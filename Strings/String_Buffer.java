public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Dhruv Panwala");
        // StringBuilder sb = new StringBuilder("Dhruv Panwala");

        // System.out.println(sb.hashCode() +" "+sb1.hashCode());
        
        // append()
        // sb.append(" Living in Surat");
        // System.out.println(sb);

        // insert()
        // sb.insert(6, " Living in Surat");
        // System.out.println(sb);

        // reverse()
        // sb.reverse();
        // System.out.println(sb);

        // delete()
        // sb.delete(6, 16);
        // System.out.println(sb);

        // replace()
        // sb.replace(6, 16, "Living in Surat");
        // System.out.println(sb);

        // substring()
        // System.out.println(sb.substring(6));
        // System.out.println(sb.substring(6, sb.length()));

        // capacity()
        // System.out.println(sb.capacity());

        // ensureCapacity()
        // sb.ensureCapacity(50);
        // System.out.println(sb.capacity());

        // charAt()
        // System.out.println(sb.charAt(6));

        // length()
        System.out.println(sb.length());

        // setLength()
        // sb.setLength(5);
        // System.out.println(sb);
    }
}

/*
 * StringBuffer is a peer class of String that provides much of the functionality of strings. String represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.
 * StringBuffer may have characters and substrings inserted in the middle or appended to the end. It will automatically grow to make room for such additions and often has more characters preallocated than are actually needed, to allow room for growth.
 * 
 * 
 * 
 
Constructors                Description

StringBuffer()              This constructor creates an empty string buffer with the initial capacity of 16.
StringBuffer(String str)    This constructor creates a string buffer with the specified string.
StringBuffer(int capacity)  This constructor creates an empty string buffer with the specified capacity as length.


Methods:

append(String s) - This method appends the string representation of some argument to the sequence.
insert(int offset, String s) - This method inserts the string representation of some argument into the sequence.
reverse() - This method causes this character sequence to be replaced by the reverse of the sequence.
delete(int start, int end) - This method removes the characters in a substring of this sequence.
replace(int start, int end, String str) - This method replaces the characters in a substring of this sequence with characters in the specified String.
substring(int start) - This method returns a new String that contains a subsequence of characters currently contained in this sequence.
substring(int start, int end) - This method returns a new String that contains a subsequence of characters currently contained in this sequence.
capacity() - This method returns the current capacity.
ensureCapacity(int minimumCapacity) - This method ensures that the capacity is at least equal to the specified minimum.
charAt(int index) - This method returns the char value in this sequence at the specified index.
length() - This method returns the length (character count).

 */
