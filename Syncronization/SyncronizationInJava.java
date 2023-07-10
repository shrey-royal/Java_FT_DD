/*
> Syncronization is a process of acquiring lock on an object to access it's data.
> Syncronization in java is a capability to control the access of multiple threads to any shared resource.
> Syncronization is used to prevent thread interference and memory consistency errors.

Why use Syncronization?
> To prevent thread interference.
> To prevent consistency errors.

Types of Syncronization:
> Process Syncronization
> Thread Syncronization

Process Syncronization:
> Process Syncronization is a mechanism which is used to control the execution of processes so that only one process executes in its critical section at a given point of time.

Thread Syncronization:
> Thread Syncronization is a mechanism which is used to control the execution of threads so that only one thread executes in its critical section at a given point of time.

we will see Thread Syncronization in java.


Mutual Exclusion: 
> Mutual Exclusion is a property of process synchronization which states that no two processes can execute in their critical section at the same time.

It can be achieved by:
1. By Using Syncronized Method
2. By Using Syncronized Block
3. By Using Static Syncronization

Concept of Lock:
> Lock is a mechanism that is used to control access to a shared resource by multiple threads.

*/

class Table {
    void printTable(int n) {    //method not syncronized
        for(int i=1; i<=5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    synchronized void printSyncedTable(int n) {    //method syncronized
        for(int i=1; i<=5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    void printTableUsingSyncBlock(int n) {
        synchronized(this) {            //syncronized block 
            for(int i=1; i<=5; i++) {
                System.out.println(n*i);
                try {
                    Thread.sleep(400);
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
        }
    } 

    static synchronized void printStaticSyncedTable(int n) {    //static syncronized method
        for(int i=1; i<=5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }
    public void run() {
        // t.printTable(5);
        // t.printSyncedTable(5);
        // t.printTableUsingSyncBlock(5);
        Table.printStaticSyncedTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;
    MyThread2(Table t) {
        this.t = t;
    }
    public void run() {
        // t.printTable(100);
        // t.printSyncedTable(100);
        // t.printTableUsingSyncBlock(100);
        Table.printStaticSyncedTable(100);
    }
}

class SyncronizationInJava {
    public static void main(String[] args) {
        Table obj = new Table();    //only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}