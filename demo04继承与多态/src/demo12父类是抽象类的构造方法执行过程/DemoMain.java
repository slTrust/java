package demo12父类是抽象类的构造方法执行过程;

public class DemoMain {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.eat();
    }

}

abstract class Fu {

    public Fu() {
        System.out.println("抽象父类构造方法执行！");
    }

    public abstract void eat();

}

class Zi extends Fu {

    public Zi() {
        // super();
        System.out.println("子类构造方法执行");
    }

    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}



/*
一个抽象类不一定含有抽象方法，
只要保证抽象方法所在的类是抽象类，即可。

这样没有抽象方法的抽象类，也不能直接创建对象，在一些特殊场景下有用途。
 */
abstract class MyAbstract {

}

