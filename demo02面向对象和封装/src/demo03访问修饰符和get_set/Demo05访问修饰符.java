package demo03访问修饰符和get_set;

public class Demo05访问修饰符 {
    /*
           访问权限   类   包  子类  其他包

  　　　　  public     ∨   ∨    ∨     ∨          （对任何人都是可用的）

   　　　　 protect    ∨   ∨   ∨     ×　　　 （继承的类可以访问以及和private一样的权限）

   　　　　 default    ∨   ∨   ×     ×　　　 （包访问权限，即在整个包内均可被访问）

   　　　　 private    ∨   ×   ×     ×　　　 （除类型创建者和类型的内部方法之外的任何人都不能访问的元素）
    */
}
