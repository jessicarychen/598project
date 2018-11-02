package org.apache.spark.sql.execution.datasources.v2;
public  class DataSourceRDD<T extends java.lang.Object> extends org.apache.spark.rdd.RDD<T> {
  private  java.util.List<org.apache.spark.sql.sources.v2.reader.DataReaderFactory<T>> readerFactories ()  { throw new RuntimeException(); }
  // not preceding
  public   DataSourceRDD (org.apache.spark.SparkContext sc, java.util.List<org.apache.spark.sql.sources.v2.reader.DataReaderFactory<T>> readerFactories, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
}
