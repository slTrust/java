package demo04子类重写父类方法;

public class Zi extends Fu {

    public void methodZi() {
        System.out.println("子类方法执行！");
    }

    public void method() {
        System.out.println("子类重名方法执行！");
    }

}
