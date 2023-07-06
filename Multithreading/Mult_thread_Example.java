public class Mult_thread_Example {
    public static void main(String[] args) {
        //creating and starting a thread
        Thread t1 = new Thread(new MyRunnable(), "Spotify");
        Thread t2 = new Thread(new MyRunnable(), "Browser");
        
        t1.start();
        t2.start();

        //Perfomring some other tasks in the main thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //Runnable Implementation
    static class MyRunnable implements Runnable {
        @Override
        public void run() { //run method is the entry point for the thread
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

/*
Output:
    Main Thread: 0
    Thread 1: 0
    Thread 2: 0
    Main Thread: 1
    Thread 1: 1
    Thread 2: 1
    Main Thread: 2
    Thread 1: 2
    Thread 2: 2
    Main Thread: 3
    Thread 1: 3
    Thread 2: 3
    Main Thread: 4
    Thread 1: 4
    Thread 2: 4


    Note: The output may vary each time you run the program. Because the threads are running concurrently(Parallelly).

*/
