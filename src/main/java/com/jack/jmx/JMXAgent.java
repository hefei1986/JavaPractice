package com.jack.jmx;

import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;



public class JMXAgent {

  private static Hello hello = new Hello();


  public static void main(String[] args) throws JMException, Exception {
    MBeanServer server = ManagementFactory.getPlatformMBeanServer();
    ObjectName obj = new ObjectName("jmxBean:name=hello");
    hello = new Hello();
    server.registerMBean(hello, obj);

    ObjectName adaptorName = new ObjectName("JMXAgent:name=htmladapter,port=8082");
    HtmlAdaptorServer adpator = new HtmlAdaptorServer();
    server.registerMBean(adaptor, adaptorName);
    adaptor.start();

    while(true) {
      System.out.println(hello.getName()+ ":" + hello.getScore());
      Thread.sleep(1000L);
    }

  }
}
