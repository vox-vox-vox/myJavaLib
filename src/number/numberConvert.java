package number;

public class numberConvert {
    // 研究 java 数据类型转换

    /**
     * int          32bit   4byte
     * double       64bit   8byte
     * long         64bit   8byte
     * short        16bit   2byte
     * char         16bit   2byte
     */
    public static void main(String[] args) {
        // 1. 低类型转换为高类型，如 int-->double / int -->long，为自动类型转换。
        int i = 1;
        double d1 = 1;
        double d2 = i;
        long l = 10;
        System.out.println(d1/2);
        System.out.println(d2/2);
        System.out.println(l/2);

        System.out.println("=====================分界线======================");
        // 2. 高类型转换为低类型，如double-->int 会损失精度，需要强制转换。
        double d3=2.5;
        int j=(int)d3;
        System.out.println(j);
    }
}
