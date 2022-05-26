import java.util.Arrays;
import java.util.Map;

public class Main {
    private static final StringWorker stringWorker = new StringWorker();

    public static void main(String[] args){
        String someText = "some text for test i need some repeated words sorry for so silly text some text need words i";
        String[] splittedText = stringWorker.createArrayWithWords(someText);

        Map<String, Integer> wordsCounts = stringWorker.getWordsCount(Arrays.asList(stringWorker.sortTextInAlphabeticOrder(splittedText)));

        System.out.print(wordsCounts);
    }
}
