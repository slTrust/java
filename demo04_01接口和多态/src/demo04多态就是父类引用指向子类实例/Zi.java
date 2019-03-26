package demo04多态就是父类引用指向子类实例;

public class Zi extends Fu {

    @Override
    public void method() {
        System.out.println("子类方法");
    }
}
