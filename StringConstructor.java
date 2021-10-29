package chapterFourteen;

public class StringConstructor {
    public static void main(String[] args) {
        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("hello");

        String S1 = new String();
        String S2 = new String(s);
        String S3 = new String(charArray);
        String s4 = new String(charArray,6, 3);
        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s4);
    }
}
