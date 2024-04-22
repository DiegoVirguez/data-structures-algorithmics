package com.diego.Threads;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.*;

public class ThreatsTest1 {

    private static int counter = 0;

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

    //tener en cuenta que esto se hace concurrentemente y nno necesita esperar
    @Test
    public void createThreadWithExecutorService() {
        ExecutorService service = null;
        Runnable task1 = () ->
                System.out.println("Printing zoo inventory");
        Runnable task2 = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(task1);
            service.execute(task2);
            service.execute(task1);
            System.out.println("end");
        } finally {
            if (service != null) service.shutdown();
        }
    }

    //in your own code we recommend submit() over execute() whenever possible.
    @Test
    public void createThreadWithExecutorServiceSubmit() {
        ExecutorService service = null;
        Future<?> future = service.submit(() -> System.out.println("Hello"));
    }

    //Waiting for results using get
    // Since the return type of Runnable.run() is void,
    // the get() method always returns null when working with Runnable expressions.
    @Test
    public void futureGet() throws Exception {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) ThreatsTest1.counter++;  //como colocar un contador en lambda
            });
            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            if (service != null) service.shutdown();
        }
    }

    @Test
    public void callableTest() throws Exception{
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> 30 + 11);
            System.out.println(result.get());   // 41
        } finally {
            if(service != null) service.shutdown();
        }
    }

    //Esperando varias tareas a terminar
    @Test
    public void esperarVariasTareas() throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            // Add tasks to the thread executor
        } finally {
            if(service != null) service.shutdown();
        }
        if(service != null) {
            service.awaitTermination(1, TimeUnit.MINUTES);

            // Check whether all tasks are finished
            if(service.isTerminated()) System.out.println("Finished!");
            else System.out.println("At least one task is still running");
        }
    }

    //Esperando varias taeras que terminen pero en una coleccion invokeALl()
    @Test
    public void esperarVariasTareasEnCollecion() throws InterruptedException, ExecutionException {
        ExecutorService service = null;
        service = Executors.newSingleThreadExecutor();

         System.out.println("begin");
         Callable<String> task = () -> "result";
         List<Future<String>>  list = service.invokeAll(
                 List.of(task, task, task));
         for (Future<String> future : list) {
               System.out.println(future.get());
            }
         System.out.println("end");

    }

    @Test
    public void esperarLaPrimeraQueFinalize() throws InterruptedException, ExecutionException {
        ExecutorService service = null;
        service = Executors.newSingleThreadExecutor();

         System.out.println("begin");
         Callable<String> task = () -> "result";
         Callable<String> task2 = () -> "result2";
         Callable<String> task3 = () -> "result3";
         String data = service.invokeAny(List.of(task, task2, task3));
         System.out.println(data);
         System.out.println("end");
        System.out.println("procesadores " + Runtime.getRuntime().availableProcessors());

    }
}



