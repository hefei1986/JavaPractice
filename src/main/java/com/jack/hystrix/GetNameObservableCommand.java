package com.jack.hystrix;

import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixObservableCommand;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

public class GetNameObservableCommand extends HystrixObservableCommand<String> {


  private String name;

  public GetNameObservableCommand(String name) {
    super(HystrixCommandGroupKey.Factory.asKey("getName"));
    this.name = name;
  }

  @Override
  protected Observable<String> construct() {
    return Observable.create(new Observable.OnSubscribe<String>() {
      public void call(Subscriber<? super String> observer) {
        try {
          observer.onNext("Hello");
          observer.onNext(name + "!");
          observer.onCompleted();
        } catch (Exception e) {
          observer.onError(e);
        }
      }
    }).subscribeOn(Schedulers.io());

  }
}
