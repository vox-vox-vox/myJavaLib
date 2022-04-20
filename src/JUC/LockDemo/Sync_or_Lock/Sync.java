package JUC.LockDemo.Sync_or_Lock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 线程操作资源类，资源类=共享资源+对资源的操作
// 经典多个线程同时对一个数+1
// 1. 资源上锁还是操作上锁？我感觉sync锁住的是一段代码，看上去像是对操作上锁；而Lock锁住的是一个资源，看上去像是对资源上锁。
/*
* sync 既可以写在函数上，也可以写一段代码段，我更迷惑了，它是万能的么，既可以对一个函数调用时加锁，又可以在运行一段代码时对一个资源加锁
*
* 它上锁的资源只有两类：一个是对象，一个是类。
*
*
* */

public class Sync {
    private int num=0;
    public synchronized void plusNum(){
        num++;
    }

    public static void main(String[] args) throws InterruptedException {
        int threadNumber = 100000;
        Sync resource=new Sync();
        for(int i=0;i<threadNumber;i++){
            new Thread(() -> {
//                synchronized (resource) {
//                    resource.plusNum();
//                }
                resource.plusNum();
            }).start();
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println(resource.num);
    }
}
