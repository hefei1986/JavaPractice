package com.jack.hystrix;

import rx.Observable;
import rx.functions.Action1;

public class Main {
  public static void main(String[] args) throws Exception {
    GetNameCommand gnc = new GetNameCommand("abc");
    System.out.println(gnc.execute());

    GetNameObservableCommand gnoc = new GetNameObservableCommand("bcd");
    Observable o = gnoc.construct();

    o.subscribe(new Action1<String>() {
      public void call(String o) {
        System.out.println("Action1:" + o);
      }
    });
  }
}
