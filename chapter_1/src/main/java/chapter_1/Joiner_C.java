package chapter_1;

import com.google.common.base.Joiner;

/**
 * 
 * @Title:
 * @Description:
 * @Author:liuzongquan
 * @Since:2016Äê3ÔÂ23ÈÕ
 * @Version:1.1.0
 */
public class Joiner_C {

    /**
     * @param arr
     * @Description:
     */
    public static void joinerBasic(Object[] arr) {
        System.out.println(Joiner.on("->").skipNulls().join(arr));
        Joiner j0 = Joiner.on("|").skipNulls();
        System.out.println(j0.join(arr));
    }

    public static void joinerWithBuilder(Object[] arr) {
        StringBuilder sb = new StringBuilder();
        Joiner j0 = Joiner.on("|").skipNulls();
        j0.appendTo(sb, arr);
        System.out.println(sb);
    }

    /**
     * @param args
     * @Description:
     */
    public static void main(String[] args) {
        String[] strArr = new String[] { "a", "b", "c", "d" };
        // joinerBasic(strArr);
        joinerWithBuilder(strArr);
    }

}
