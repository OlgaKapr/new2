

class MyJob implements Runnable {

    public void run() {



        System.out.println("My job!");
    }
}

class YourJob implements Runnable {
    public void run() {
        System.out.println("Your job!");
    }
}

public class Main {

    static void foo2() {
        System.out.println("Hi");

    }

    static void foo1() {
        System.out.println("Hi");
        foo2();
    }

    public static void main(String[] args) {
        //foo1();



        MyJob m = new MyJob();
        YourJob y = new YourJob();

        m.run();
        y.run();


        //Thread t = new Thread();


    }
}
