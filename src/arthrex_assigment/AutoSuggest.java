package arthrex_assigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AutoSuggest{
    private List<String> words;

    public AutoSuggest(List<String> words) {
        this.words = words;
    }

    public List<String> suggest(String query) {
        List<String> suggestions = new ArrayList<>();
        if (query.endsWith("*")) {
            query = query.substring(0, query.length() - 1);
            for (String word : words) {
                if (word.startsWith(query)) {
                    suggestions.add(word);
                }
            }
        } else {
            for (String word : words) {
                if (word.contains(query)) {
                    suggestions.add(word);
                }
            }
        }
        return suggestions;
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        // Input words
        System.out.println("Enter words (comma-separated): ");
        String[] wordsArray = scanner.nextLine().split(",");
        List<String> inputWords = new ArrayList<>();
        for (String word : wordsArray) {
            inputWords.add(word.trim());
        }

        // Create AutoSuggest instance
        AutoSuggest autoSuggest = new AutoSuggest(inputWords);

        // Input query
        System.out.println("Enter query: ");
        String query = scanner.nextLine();

        // Get suggestions
        List<String> suggestions = autoSuggest.suggest(query);

        // Print suggestions
        System.out.println("Suggestions: " + suggestions);
	}
}