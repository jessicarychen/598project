package org.apache.spark.scheduler;
public  class RuntimePercentage implements scala.Product, scala.Serializable {
  static public  org.apache.spark.scheduler.RuntimePercentage apply (long totalTime, org.apache.spark.executor.TaskMetrics metrics)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  double executorPct ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> fetchPct ()  { throw new RuntimeException(); }
  public  double other ()  { throw new RuntimeException(); }
  // not preceding
  public   RuntimePercentage (double executorPct, scala.Option<java.lang.Object> fetchPct, double other)  { throw new RuntimeException(); }
}
