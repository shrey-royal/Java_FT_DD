class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class Custom_Exception_Example {
    public static void main(String[] args) throws MyException {
        // try {
        //     throw new MyException("This is my exception");
        // } catch (MyException e) {
        //     // TODO: handle exception
        //     System.out.println(e.getMessage());
        // }

        throw new MyException("This is my exception in main method");
    } 
}
