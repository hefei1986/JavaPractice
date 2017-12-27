package com.jack.hystrix;

import rx.Observable;
import rx.Observer;

public class Main {
  public static void main(String[] args) throws Exception {
//    GetNameCommand gnc = new GetNameCommand("abc");
//    System.out.println(gnc.execute());

    GetNameObservableCommand gnoc = new GetNameObservableCommand("bcd");
    Observable o = gnoc.construct();

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
