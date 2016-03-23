package chapter_1;

import com.google.common.base.Joiner;

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

    public static void main(String[] args) {
        String[] strArr = new String[] { "a", "b", "c", "d" };
        joinerBasic(strArr);
    }

}
