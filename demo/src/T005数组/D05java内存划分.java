package T005数组;

public class D05java内存划分 {
    /*
    1。 栈 Stack 存放 方法里的局部变量， 方法的运行一定在栈里
            局部变量：方法的参数，或者 方法里的变量
            作用域：一旦超出作用域，立刻从栈内存中消失
    2.  堆 Heap 凡是 new 出来的东西都在堆里
        堆内存里面的东西都有一个地址值 16进制
        堆内存里的数据，都有默认值。
            整数 ==> 0
            浮点数==>0.0
            字符==> \u0000
            布尔 ==> false
            引用类型==> null
    3.方法区 Method area 存储 .class相关信息，包含方法的信息
    4。 本地方法栈： Native Method Stack 与操作系统相关
    5. 寄存器 PC Register  跟CPU相关
    */
}
