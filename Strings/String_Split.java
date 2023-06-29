public class String_Split {
    public static void main(String[] args) {
        String s1 = "Dhruv Panwala";
        String[] arr = s1.split(" ");
        for (String s : arr) {
            System.out.println(s);
        }

        // System.out.println(arr[0] + " " + arr[1]);
    }
}
