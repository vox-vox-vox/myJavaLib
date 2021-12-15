package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * string 的 compareTo方法首先排序第一位，第一位相同的情况下才按照第二位，以此类推。
 */
public class stringSort {
    public static void main(String[] args) {
        String[] array={"123","100","200","22","4"};
        Arrays.sort(array,(s1,s2)-> (s1).compareTo(s2));
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
