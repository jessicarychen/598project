package org.apache.spark.sql.execution.streaming.sources;
public  class MemoryWriterFactory implements org.apache.spark.sql.sources.v2.writer.DataWriterFactory<org.apache.spark.sql.Row>, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.OutputMode outputMode ()  { throw new RuntimeException(); }
  // not preceding
  public   MemoryWriterFactory (org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.writer.DataWriter<org.apache.spark.sql.Row> createDataWriter (int partitionId, int attemptNumber)  { throw new RuntimeException(); }
}