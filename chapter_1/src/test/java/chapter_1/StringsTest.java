package chapter_1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Strings;

public class StringsTest {

    @Test
    public void test() {
        String s = Strings.padEnd("foo", "foo".length() + 3, 'x');
        System.out.println(s);
        assertThat(s, is("fooxxx"));
        // String s1 = null;
        System.out.println(Strings.nullToEmpty(null));
        String s1 = Strings.nullToEmpty(null);
        assertThat(s1, is(""));

        System.out.println(Strings.emptyToNull(""));
        String s2 = Strings.emptyToNull("");
        // assertThat(s2, is(""));
        Assert.assertNull(s2);
        Boolean b1 = Strings.isNullOrEmpty("");
        Boolean b2 = Strings.isNullOrEmpty(null);
        assertTrue(b1);
        assertTrue(b2);
        String s3 = Strings.commonPrefix("abcd", "abdc");
        assertThat(s3, is("ab"));
        String s4 = Strings.commonSuffix("abcd", "bacd");
        assertThat(s4, is("cd"));
        assertTrue(true);
    }

}
