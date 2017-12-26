package com.jack.guava;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class TestTable {

  public static void main(String args[]){
    Table<String, String, String> table = HashBasedTable.create();

    table.put("IBM", "101","Mahesh");
    table.put("IBM", "102","Ramesh");
    table.put("IBM", "103","Suresh");

    table.put("Microsoft", "111","Sohan");
    table.put("Microsoft", "112","Mohan");
    table.put("Microsoft", "113","Rohan");

    table.put("TCS", "121","Ram");
    table.put("TCS", "122","Shyam");
    table.put("TCS", "123","Sunil");

    System.out.println(table.toString());
    System.out.println(table.row("abc"));
    System.out.println(table.row("TCS"));
    System.out.println(table.values());

  }
}
