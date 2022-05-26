import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringWorker {
    public String[] createArrayWithWords(String text) {
        return text.split(" ");
    }

    public String[] sortTextInAlphabeticOrder(String[] text) {
        Arrays.sort(text);

        return text;
    }

    public Map<String, Integer> getWordsCount(List<String> text) {
        Map<String, Integer> wordsCount = new HashMap<>();

        for (int i = 0; i < text.size(); i++) {
            if (wordsCount.containsKey(text.get(i))) {
                int count = wordsCount.get(text.get(i));

                wordsCount.remove(text.get(i));
                wordsCount.put(text.get(i), count + 1);
            } else {
                wordsCount.put(text.get(i), 1);
            }
        }

        return wordsCount;
    }
}
