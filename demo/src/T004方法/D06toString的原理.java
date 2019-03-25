package T004方法;

// byte short int long float double char boolean
// String
// 在调用输出语句的时候，println方法其实就是进行了多种数据类型的重载形式。
public class D06toString的原理 {

    public static void main(String[] args) {
        toString(100); // int
        toString("Hello"); // String
    }

    public static void toString(byte num) {
        System.out.println(num);
    }

    public static void toString(short num) {
        System.out.println(num);
    }

    public static void toString(int num) {
        System.out.println(num);
    }

    public static void toString(long num) {
        System.out.println(num);
    }

    public static void toString(float num) {
        System.out.println(num);
    }

    public static void toString(double num) {
        System.out.println(num);
    }

    public static void toString(char zifu) {
        System.out.println(zifu);
    }

    public static void toString(boolean is) {
        System.out.println(is);
    }

    public static void toString(String str) {
        System.out.println(str);
    }

}


