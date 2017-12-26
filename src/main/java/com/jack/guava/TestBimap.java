package com.jack.guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class TestBimap {

  public static void main(String args[]){
    BiMap<String, String> map = HashBiMap.create();

    map.put("a", "a1");
    map.put("b", "b1");

    map.inverse().put("c1", "c");

    System.out.println(map);
    System.out.println(map.inverse());
  }
}
