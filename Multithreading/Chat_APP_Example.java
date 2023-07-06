import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Chat_APP_Example {
    //Shared blocking queue to hold messages
    private static BlockingQueue<String> messageQueue = new ArrayBlockingQueue<>(10);
    public static void main(String[] args) {
        Thread user1 = new Thread(new User("User1"));
        Thread user2 = new Thread(new User("User2"));

        user1.start();
        user2.start();
    }

    //User class represents an individual user in the chat application
    static class User implements Runnable {
        private String name;

        public User(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                //Simulate the user is sending a message
                for (int i=1; i<=5; i++) {
                    String message = name + "- message " + i;
                    sendMessage(message);
                    Thread.sleep(1000);

                    //Simulate the user is receiving a message
                    String receivedMessage = receiveMessage();
                    System.out.println(name + " received: " + receivedMessage);
                    Thread.sleep(1000);
                }

                // for (int i=1; i<=5; i++) {
                    
                // }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void sendMessage(String message) throws InterruptedException {
            messageQueue.put(message);
            System.out.println(name + " sent: " + message);
        }

        public String receiveMessage() throws InterruptedException {
            return messageQueue.take();
        }
    }
}

/*
Blocking Queue: 
> A blocking queue is a queue that blocks when you try to dequeue from it and the queue is empty, or if you try to enqueue items to it and the queue is already full.


*/