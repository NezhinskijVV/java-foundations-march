package threads.lecture1;

public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException {

//        for (int i = 0; i < 10; i++) {
////            for (int j = 0; j < 1_000_000_000L ; j++) {
////
////            }
//            Thread.sleep(1000);
//            System.out.print("F ");
//        }

//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(2500);
//            System.out.print("S ");
//        }

//        System.out.println(Thread.currentThread().getName() + " START");
//        PrinterS printerSSecond = new PrinterS();
////        printerSSecond.setDaemon(true);
////        printerSSecond.setPriority(Thread.MIN_PRIORITY);
//        printerSSecond.start();
//
//
//        PrinterF printerF = new PrinterF();
//        Thread tPrinterF =  new Thread(printerF);
//
////        tPrinterF.setDaemon(true);
//
////        System.out.println(tPrinterF.getName());
////        tPrinterF.setPriority(Thread.MAX_PRIORITY);
//        tPrinterF.start();
//
//        tPrinterF.join();
//        printerSSecond.join();
//        System.out.println(Thread.currentThread().getName() + " END");

//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(1000);
//            System.out.print("F ");
//        }

//        Thread.currentThread().join();  //DeadLock


        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println(2);
            }
        };

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(3);
//            }
//        };

        Runnable runnable = () -> {
            System.out.println(3);
            System.out.println(3);
        };

        Thread thread2 = new Thread(runnable);

        thread.start();
        thread2.start();

        new Thread(() -> System.out.println(4)).start();
    }
}

// Создать потоки разными способами (Унаследоваться от Runnable и от класса Thread) и запустить их
// Написать программу, которая выводит любое сообщение раз в 5 секунд.
// Изучать Потоки ( join(), sleep() и остальные методы)
//* Про лямбды выражения в Java, анонимные классы
