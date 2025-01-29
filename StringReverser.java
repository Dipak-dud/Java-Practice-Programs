//Reverses a string without using any predefined Java functions like StringBuilder.reverse() or StringBuffer.reverse()

public class StringReverser {
    public static void main(String[] args) {
        String input = "Dipak Dudhagundi";
        String reversed = reverseString(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize pointers for the start and end of the array
        int start = 0;
        int end = charArray.length - 1;

        // Swap characters from the start and end, moving towards the center
        while (start < end) {
            // Swap the characters
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}