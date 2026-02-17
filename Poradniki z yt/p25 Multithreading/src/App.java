
public class App {
    public static void main(String[] args) throws Exception {
        
        //MyRunnable myRunnable = new MyRunnable();
        //MyRunnable myRunnable = new MyRunnable();//też działa
        
        Thread thread1 = new Thread(new MyRunnable("maka"));
        Thread thread2 = new Thread(new MyRunnable("paka"));

        System.out.println("start");

        thread1.start();
        thread2.start();

        

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }

        System.out.println("koniec");
    }
}
