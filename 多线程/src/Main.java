//package nosae;

import java.util.Scanner;

class HelloWorld {
    private int n;
    public HelloWorld( int n){
        this.n = n;
    }
    public void hello() throws InterruptedException{
        for (int i = 0; i < n; i++) {
            synchronized (this) {
                notify();
                System.out.print("Hello");
                wait();
            }
        }
    }

    public void world() throws InterruptedException{
        for (int i = 0; i < n; i++) {
            synchronized (this) {
                notify();
                System.out.println("World!");
                if(i<n-1)
                    wait();
            }
        }
    }

}

class PrintWorld implements Runnable{
    HelloWorld helloWorld;
    public PrintWorld(HelloWorld helloWorld){
        this.helloWorld = helloWorld;
    }
    @Override
    public void run(){
        try {
            helloWorld.world();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PrintHello implements Runnable {
    HelloWorld helloWorld;
    public PrintHello(HelloWorld helloWorld){
        this.helloWorld = helloWorld;
    }
    @Override
    public void run() {
        try {
            helloWorld.hello();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HelloWorld helloWorld = new HelloWorld(n);
        PrintHello printHello = new PrintHello(helloWorld);
        PrintWorld printWorld = new PrintWorld(helloWorld);
        new Thread(printHello).start();
        new Thread(printWorld).start();
    }
}

