package demo02单继承和实现多接口;

public interface MyInterface {

    public default void method() {
        System.out.println("接口的默认方法");
    }

}
