package chapter_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.common.base.Charsets;

public class CharsetsTest {

    @Test
    public void test() {
        byte[] bytes2 = "foobarbaz".getBytes(Charsets.UTF_8);
        System.out.println(bytes2);
        bytes2 = "foobarbaz".getBytes(Charsets.ISO_8859_1);
        System.out.println(bytes2);
        assertTrue(true);
    }

}
