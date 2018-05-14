package com.jack.hystrix;

import rx.Observable;
import rx.Observer;
import sun.jvm.hotspot.runtime.Threads;

public class Main {
  public static void main(String[] args) throws Exception {
    GetNameCommand gnc = new GetNameCommand("abc");
    Observable<String> gnco = gnc.observe();
    System.out.println("1");
    Thread.sleep(1000);
    gnco.subscribe((s) -> {System.out.println(s);});
    System.out.println("2");


    if (true) {
      return;
    }

    GetNameObservableCommand gnoc = new GetNameObservableCommand("bcd");
    Observable o = gnoc.observe();

    o.subscribe(new Observer<String>() {
      public void onCompleted() {
        System.out.println("completed");
      }

      public void onError(Throwable throwable) {
        System.out.println("on error: " + throwable.getMessage());
      }

      public void onNext(String o) {
        System.out.println("msg:" + o);
      }
    });

    o.subscribe((v) -> {System.out.println("function:" + v);});
  }
}
