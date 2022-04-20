package JUC.threadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class myMethod implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"执行");
        return null;
    }
}

public class ThreadPoolDemo {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                2,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
        for (int i = 0; i < 20; i++) {
            FutureTask<String> task=new FutureTask<>(new myMethod());
            threadPool.execute(task);
        }

    }
}
