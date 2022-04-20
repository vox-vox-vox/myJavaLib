package JUC.LockDemo.Sync_or_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _Lock {
    private int num;
    Lock lock=new ReentrantLock();
    public int plusNum(int a){
        return num=num+a;
    }

    public static void main(String[] args) {

    }
}