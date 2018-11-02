package org.apache.spark.sql.execution.streaming.sources;
public  class RateStreamBatchTask implements org.apache.spark.sql.sources.v2.reader.DataReaderFactory<org.apache.spark.sql.Row>, scala.Product, scala.Serializable {
  static public  java.lang.String[] preferredLocations ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> vals ()  { throw new RuntimeException(); }
  // not preceding
  public   RateStreamBatchTask (scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> vals)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.DataReader<org.apache.spark.sql.Row> createDataReader ()  { throw new RuntimeException(); }
}
