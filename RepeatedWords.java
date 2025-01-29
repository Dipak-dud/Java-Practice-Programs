import java.util.HashMap;

public class RepeatedWords {

    public static void main(String[] args) {
        String text = "This this one test this test is only  one test ok";

        String[] words = text.toLowerCase().split("\\s+");
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCountMap);

    }
}