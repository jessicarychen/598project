package org.apache.spark.deploy;
/**
 * Provides an indirection layer for passing arguments as system properties or flags to
 * the user's driver program or to downstream launcher tools.
 */
public  class OptionAssigner implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String value ()  { throw new RuntimeException(); }
  public  int clusterManager ()  { throw new RuntimeException(); }
  public  int deployMode ()  { throw new RuntimeException(); }
  public  java.lang.String clOption ()  { throw new RuntimeException(); }
  public  java.lang.String confKey ()  { throw new RuntimeException(); }
  // not preceding
  public   OptionAssigner (java.lang.String value, int clusterManager, int deployMode, java.lang.String clOption, java.lang.String confKey)  { throw new RuntimeException(); }
}
