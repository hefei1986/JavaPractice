package com.jack.jmx;

class Hello implements HelloMBean {

  private String name;
  private int score;

  public String getName() {
    System.out.println("getName..");
    return name;
  }

  public void setName(String name) {
    System.out.println("setName..");
    this.name = name;
  }

  public int getScore() {
    System.out.println("getScore..");
    return score;
  }

  public void setScore(int score) {
    System.out.println("setScore..");
    this.score = score;
  }
}
