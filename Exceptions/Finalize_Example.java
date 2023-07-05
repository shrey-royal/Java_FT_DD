public class Finalize_Example {
    public static void main(String[] args) {
        Finalize_Example f = new Finalize_Example();
        System.out.println("Hashcode of f: " + f.hashCode());
        f = null;
        // System.gc() is used to call the garbage collector
        System.gc();
        System.out.println("End of main");
    }

    protected void finalize() {
        System.out.println("finalize method called");
        System.out.println("Hashcode of this object: " + this.hashCode());
    }
}
