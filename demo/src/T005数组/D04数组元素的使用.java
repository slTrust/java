package T005数组;
/*
直接打印数组名称，得到的是数组对应的：内存地址哈希值。
二进制：01
十进制：0123456789
16进制：0123456789abcdef

访问数组元素的格式：数组名称[索引值]
索引值：就是一个int数字，代表数组当中元素的编号。
【注意】索引值从0开始，一直到“数组的长度-1”为止。
 */
public class D04数组元素的使用 {

    public static void main(String[] args) {
        // 静态初始化的省略格式
        int[] array = { 10, 20, 30 };

        System.out.println(array); // [I@75412c2f

        // 直接打印数组当中的元素
        System.out.println(array[0]); // 10
        System.out.println(array[1]); // 20
        System.out.println(array[2]); // 30
        System.out.println("=============");

        // 也可以将数组当中的某一个单个元素，赋值交给变量
        int num = array[1];
        System.out.println(num); // 20




        /*
        使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值。规则如下：
        如果是整数类型，那么默认为0；
        如果是浮点类型，那么默认为0.0；
        如果是字符类型，那么默认为'\u0000'；
        如果是布尔类型，那么默认为false；
        如果是引用类型，那么默认为null。

        注意事项：
        静态初始化其实也有默认值的过程，只不过系统自动马上将默认值替换成为了大括号当中的具体数值。
        */
        // 动态初始化一个数组
        int[] array2 = new int[3];

        System.out.println(array2); // 内存地址值
        System.out.println(array2[0]); // 0
        System.out.println(array2[1]); // 0
        System.out.println(array2[2]); // 0
        System.out.println("=================");

        // 将数据123赋值交给数组array当中的1号元素
        array2[1] = 123;
        System.out.println(array2[0]); // 0
        System.out.println(array2[1]); // 123
        System.out.println(array2[2]); // 0
    }

}

