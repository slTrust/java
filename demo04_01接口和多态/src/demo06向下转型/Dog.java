package demo06向下转型;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃SHIT");
    }

    public void watchHouse() {
        System.out.println("狗看家");
    }
}
