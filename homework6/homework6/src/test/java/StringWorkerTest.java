import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringWorkerTest {
    private final StringWorker stringWorker = new StringWorker();
    private final String[] text = {"more","test","text","text","text","more"};

    @Test
    public void testGetWordsCountWorkAsExpected(){
        Map<String, Integer> actual = stringWorker.getWordsCount(Arrays.asList(text));

        Map<String, Integer> expected = new HashMap<>();
        expected.put("more", 2);
        expected.put("test", 1);
        expected.put("text", 3);

        assertEquals(actual, expected);
    }
}
