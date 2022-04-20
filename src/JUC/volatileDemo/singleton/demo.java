package JUC.volatileDemo.singleton;

// 无论那种方式的单例模式，
// singleton 的构造函数一定是private的
// singleton 的对象一定是存放在类中的static field

public class demo {
    public static void main(String[] args) {
        // Singleton instance = new Singleton();// 是private的，不能直接new初始化
        /*
        // 饿汉式
        Singleton instance1 = Singleton.instance;
        Singleton instance2 = Singleton.instance;
        System.out.println(instance1);
        System.out.println(instance2);// 可以看出，instance1和instance2是一个对象

        // 懒汉式
        LazySingleton lazyInstance1 = LazySingleton.getInstance();
        LazySingleton lazyInstance2 = LazySingleton.getInstance();
        System.out.println(lazyInstance1);
        System.out.println(lazyInstance2);// 可以看出，lazyInstance1和lazyInstance2是一个对象

        // 懒汉式 不加锁
        // 这段代码输出的instance并不相同，可见无法保持单例
        for(int i=0;i<10;i++){
            new Thread(()->{
                LazySingletonNoLock instance = LazySingletonNoLock.getInstance();
                System.out.println(instance);
            }).start();
        }
         */
        // 懒汉式，volatile验证
        for(int i=0;i<50;i++){
            new Thread(()->{
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(instance);
            }).start();
        }

    }
}
