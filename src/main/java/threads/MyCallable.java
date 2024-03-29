package threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        // возвращает имя потока, который выполняет callable таск
        return Thread.currentThread().getName();
    }

    public static void main(String args[]){
        //Получаем ExecutorService утилитного класса Executors с размером gпула потоков равному 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //создаем список с Future, которые ассоциированы с Callable
        List<Future<String>> list = new ArrayList<>();
        // создаем экземпляр MyCallable
        Callable<String> callable = new MyCallable();
        for(int i=0; i< 100; i++){
            //сабмитим Callable таски, которые будут
            //выполнены пулом потоков
            Future<String> future = executor.submit(callable);
            //добавляя Future в список,
            //мы сможем получить результат выполнения
            list.add(future);
        }
        for(Future<String> fut : list){
            try {
                System.out.println(new Date() + "::" + fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }

}
