package org.apache.spark.sql.execution.streaming.continuous;
public  class EpochPackedPartitionOffset implements org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long epoch ()  { throw new RuntimeException(); }
  // not preceding
  public   EpochPackedPartitionOffset (long epoch)  { throw new RuntimeException(); }
}
