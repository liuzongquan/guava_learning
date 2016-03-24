package chapter_1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.google.common.base.CharMatcher;

public class CharMatcherTest {

    @Test
    public void test() {
        String s = "a b   cd$^EFGh\t\b\\a";
        assertThat(CharMatcher.BREAKING_WHITESPACE.replaceFrom(s, ' '),
                is("a b   cd$^EFGh \b\\a"));
        assertThat(CharMatcher.whitespace().replaceFrom(s, ' '),
                is("a b   cd$^EFGh \b\\a"));
        assertThat(CharMatcher.isNot('a').removeFrom(s), is("aa"));
        assertThat(CharMatcher.is('a').retainFrom(s), is("aa"));
        assertThat(
                CharMatcher.javaLetter().or(CharMatcher.DIGIT)
                        .and(CharMatcher.JAVA_UPPER_CASE).retainFrom(s),
                is("EFG"));
        assertThat(CharMatcher.JAVA_LETTER.and(CharMatcher.JAVA_UPPER_CASE)
                .retainFrom(s), is("EFG"));
    }

}
