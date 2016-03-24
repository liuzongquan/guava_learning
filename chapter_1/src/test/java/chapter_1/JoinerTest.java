package chapter_1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Map;

import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;

public class JoinerTest {

    @Test
    public void testMapJoiner() {
        // Using LinkedHashMap so that the original
        // order is preserved
        String expectedString = "Washington D.C=Redskins#New York City=Giants#Philadelphia=Eagles#Dallas=Cowboys";
        Map<String, String> testMap = Maps.newLinkedHashMap();
        testMap.put("Washington D.C", "Redskins");
        testMap.put("New York City", "Giants");
        testMap.put("Philadelphia", "Eagles");
        testMap.put("Dallas", "Cowboys");
        String returnedString = Joiner.on("#").withKeyValueSeparator("=")
                .join(testMap);
        System.out.println(returnedString);
        assertThat(returnedString, is(expectedString));
    }

}
