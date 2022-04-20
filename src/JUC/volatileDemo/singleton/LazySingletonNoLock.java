package JUC.volatileDemo.singleton;

public class LazySingletonNoLock {
    private static volatile LazySingletonNoLock instance;
    private LazySingletonNoLock(){}// 一定要标记为private，否则就可以直接创建这个对象
    public static LazySingletonNoLock getInstance(){
        if(instance==null){
            instance = new LazySingletonNoLock();
        }
        return instance;
    }
}
