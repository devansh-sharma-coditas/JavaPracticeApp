package org.example.MultiThreading;

public class Student implements Runnable {
    static synchronized void display(){
        for (int i = 0; i < 5; i++) {
            System.out.println("************This is from display **************    : " + Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        display();
    }
}

class Runner{
    public static void main(String[] args) throws InterruptedException {
        Student s1 = new Student();
        Thread thread1 = new Thread(s1);
        thread1.setPriority(10);
        thread1.start();



        Student s2 = new Student();
        Thread thread2 = new Thread(s2);
        thread1.setPriority(3);
        thread2.start();

    }
}