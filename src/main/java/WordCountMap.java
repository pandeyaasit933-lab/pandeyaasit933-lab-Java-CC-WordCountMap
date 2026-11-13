import java.util.HashMap;
import java.util.Map;

public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     * 
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words) {
        Map<String, Integer> wordMap = new HashMap<>();
        
        // Handle null or empty string edge cases gracefully
        if (words == null || words.isEmpty()) {
            return wordMap;
        }
        
        // Split the string by spaces into an array of words
        String[] wordArray = words.split(" ");
        
        // Iterate through the resulting array
        for (String word : wordArray) {
            // If the map already contains the word, increment its count; otherwise, set it to 1
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        
        return wordMap;
    }
}