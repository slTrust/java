package demo01interface概念及不同版本的特性;

public interface MyInterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("静态方法1");
        methodStaticCommon();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodStaticCommon();
    }

    static void methodStaticCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
