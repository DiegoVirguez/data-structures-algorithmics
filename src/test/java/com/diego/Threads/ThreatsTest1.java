package com.diego.Threads;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreatsTest1 {

    @Test
    public void myThread() {

        System.out.println("inicio del thread principal");

        Runnable sloth = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello World");
            }
        };
        new Thread(sloth).start();
        System.out.println("Fin del treahd principal");
    }

    @Test
    public void createThreadWithExecutorService(){
        ExecutorService service = null;
        Runnable task1 = () ->
                System.out.println("Printing zoo inventory");
        Runnable task2 = () -> {for(int i = 0; i < 3; i++)
            System.out.println("Printing record: "+i);};
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(task1);
            service.execute(task2);
            service.execute(task1);
            System.out.println("end");
        } finally {
            if(service != null) service.shutdown();
        }
    }

    //in your own code we recommend submit() over execute() whenever possible.
    @Test
    public void createThreadWithExecutorServiceSubmit(){
        ExecutorService service = null;
        Future<?> future = service.submit(() -> System.out.println("Hello"));
    }

}
