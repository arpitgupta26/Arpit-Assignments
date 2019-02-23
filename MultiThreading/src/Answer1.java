class test implements Runnable{
    
    @Override
    public void run() {
        System.out.println("Runnable interface implemented");
    }
}


public class Answer1 extends Thread {
    @Override
    public void run() {
        System.out.println("Extended Thread class");
    }
    
    public static void main(String[] args) {
        Answer1 answer1 = new Answer1();
        answer1.start();
        Thread test = new Thread(new test());
        test.start();
    }
}
