package com.jack;


public class A {
  public static void main(String[] args) throws InterruptedException{

    Runner r = new Runner();
    Thread t =new Thread(r);

    t.start();

    Thread.sleep(3000);

    r.setEnable(false);

    t.join();



  }
}
