package chapter_1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Map;

import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Splitter.MapSplitter;
import com.google.common.collect.Maps;

public class SplitterTest {

    @Test
    public void testSplitter() {
        String testStr = "foo|bar|baz|||";
        String expectedStr = "foo#bar#baz";
        Splitter splitter = Splitter.on("|").omitEmptyStrings().trimResults();
        System.out.println(splitter.split(testStr));
        assertThat(
                Joiner.on("#").skipNulls().join(splitter.split(testStr)),
                is(expectedStr));
    }

    @Test
    public void testMapSpliter() {
        String startString = "Washington D.C=Redskins#New York City=Giants#Philadelphia=Eagles#Dallas=Cowboys";
        Map<String, String> testMap = Maps.newLinkedHashMap();
        testMap.put("Washington D.C", "Redskins");
        testMap.put("New York City", "Giants");
        testMap.put("Philadelphia", "Eagles");
        testMap.put("Dallas", "Cowboys");
        MapSplitter spliter = Splitter.on("#").withKeyValueSeparator("=");
        Map<String, String> splitMap = spliter.split(startString);
        assertThat(splitMap, is(testMap));
    }
}
