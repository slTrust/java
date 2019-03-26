package demo11把未实现的梦想交给后代之抽象类;

public class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal(); // 错误写法！不能直接创建抽象类对象

        Cat cat = new Cat();
        cat.eat();
        cat.normalMethod(); // 调用父类(抽象类)的非抽象方法
    }

}
