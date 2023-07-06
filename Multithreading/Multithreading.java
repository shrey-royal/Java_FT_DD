public class Multithreading {
    public static void main(String[] args) {
        //creating two threads
        Thread t1 = new Thread("Spotify");   //Thread-0
        Thread t2 = new Thread("Browser");   //Thread-1
        
        //getting the names of the threads
        System.out.println("Name of t1:"+t1.getName());  //Name of t1:Thread-0
        System.out.println("Name of t2:"+t2.getName());  //Name of t2:Thread-1
        
        //setting the names of the threads
        t1.setName("Music");
        t2.setName("Chrome");

        //getting the names of the threads after setting
        System.out.println("New name of t1:"+t1.getName());  //New name of t1:Music
        System.out.println("New name of t2:"+t2.getName());  //New name of t2:Chrome

        //getting the priority of the threads
        System.out.println("Priority of t1:"+t1.getPriority());  //Priority of t1:5
        System.out.println("Priority of t2:"+t2.getPriority());  //Priority of t2:5

        //setting the priority of the threads
        t1.setPriority(Thread.MIN_PRIORITY);    //1
        t2.setPriority(Thread.MAX_PRIORITY);    //10

        //getting the priority of the threads after setting
        System.out.println("New priority of t1:"+t1.getPriority());  //New priority of t1:1
        System.out.println("New priority of t2:"+t2.getPriority());  //New priority of t2:10

        //starting the threads
        t1.start();
        t2.start();

        //checking whether the threads are alive or not
        System.out.println("Is t1 alive?:"+t1.isAlive());  //Is t1 alive?:true
        System.out.println("Is t2 alive?:"+t2.isAlive());  //Is t2 alive?:true

        //setting the threads to sleep
        try {
            t1.sleep(1000);
            t2.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //checking whether the threads are alive or not after setting to sleep
        System.out.println("Is t1 alive?:"+t1.isAlive());  //Is t1 alive?:true
        System.out.println("Is t2 alive?:"+t2.isAlive());  //Is t2 alive?:true

        //waiting for the threads to die
        try {
            t1.join();  //waiting for t1 to die
            t2.join();  //waiting for t2 to die
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //checking whether the threads are alive or not after waiting for them to die
        System.out.println("Is t1 alive?:"+t1.isAlive());  //Is t1 alive?:false
        System.out.println("Is t2 alive?:"+t2.isAlive());  //Is t2 alive?:false

        //getting the names of the threads after waiting for them to die
        System.out.println("Name of t1:"+t1.getName());  //Name of t1:Music
        System.out.println("Name of t2:"+t2.getName());  //Name of t2:Chrome

        //getting the priority of the threads after waiting for them to die
        System.out.println("Priority of t1:"+t1.getPriority());  //Priority of t1:1
        System.out.println("Priority of t2:"+t2.getPriority());  //Priority of t2:10
    }    
}

/*

Priority of a Thread:
> priority of a thread is an integer value that specifies the priority of a thread.
> Thread priority is used by the thread scheduler to decide which thread should be executed.
> Thread priority can be in range between 1 to 10. 
> By default, it is 5. 
> Thread with higher priority is more important to a thread scheduler and gets more preference in execution.
> Thread priority can be changed by using setPriority() method.
> Thread priority can be retrieved by using getPriority() method.


*/