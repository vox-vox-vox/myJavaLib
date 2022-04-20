package JUC.volatileDemo.singleton;

// 懒汉式，调用getInstance时才初始化单例对象
// 单例对象一定是private的，不然getInstance失去意义
public class LazySingleton {
    private static volatile LazySingleton instance;
    private LazySingleton(){}// 一定要标记为private，否则就可以直接创建这个对象
    public static LazySingleton getInstance(){
        if(instance==null){ // 为什么要再判断一次
            synchronized (LazySingleton.class){ // 为什么要加锁？ 不加锁多个线程可以创建多个实例。
                if(instance==null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

