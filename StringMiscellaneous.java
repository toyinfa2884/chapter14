package chapterFourteen;

public class StringMiscellaneous {
    public static void main(String[] args) {
        String string = "hello there";
        char[] charArray = new char[5];
        System.out.printf("string: %s%n", string);
        System.out.printf("Length of string: %d%n", string.length());
        /**
         * loop through character in string with charAt and display reversed
         */
        System.out.printf(" The string reversed is: ");
        for(int count = string.length()-1; count >= 0; count--){
            System.out.printf("%c", string.charAt(count));
        }
        /**
         * copy character from string into charArray
         */
        string.getChars(0, 5, charArray, 0);
        System.out.println("%nThe character array is: ");
        for(char character : charArray){
            System.out.println(character);
        }
    }
}
