package com.jack.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class GetNameCommand extends HystrixCommand<String> {

  private String name;

  public GetNameCommand(String name) {
    super(HystrixCommandGroupKey.Factory.asKey("getName"));
    this.name = name;
  }

  @Override
  protected String run() throws Exception {
    throw new Exception("abc");
  }

  @Override
  protected String getFallback() {
    return "fallback";
  }
}
