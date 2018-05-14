package com.jack;

class Runner implements Runnable {

  private boolean enable = true;

  public void setEnable(boolean enable) {
    this.enable = enable;
  }

  @Override public void run() {
    int i = 0;
    while(enable) {
      System.out.println("running:" + (i++));
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ie) {
        ie.printStackTrace();
      }
    }
  }
}
