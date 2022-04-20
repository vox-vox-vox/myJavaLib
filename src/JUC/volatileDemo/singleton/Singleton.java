package JUC.volatileDemo.singleton;

// 饿汉式，每次类初始化时就已经初始化了单例对象
// 单例对象是public的
public class Singleton {
    public static Singleton instance=new Singleton();// static 标记为类的静态成员，向外提供
    private Singleton(){}// 一定要标记为private，否则就可以直接创建这个对象
}


