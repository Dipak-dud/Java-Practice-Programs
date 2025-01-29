//Counts the occurrences of each letter in a given string using a Map

import java.util.HashMap;
import java.util.Map;

public class LetterCounter {
    public static void main(String[] args) {
        String input = "Dipak Dudhaguni";
        Map<Character, Integer> letterCountMap = countLetters(input);

        // Print the result
        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            System.out.println("Letter: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countLetters(String input) {
        // Create a map to store the letter counts
        Map<Character, Integer> letterCountMap = new HashMap<>();

        // Convert the input string to lowercase to make it case-insensitive
        input = input.toLowerCase();

        // Iterate through each character in the string
        for (char c : input.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Update the count in the map
                letterCountMap.put(c, letterCountMap.getOrDefault(c, 0) + 1);
            }
        }

        return letterCountMap;
    }
}