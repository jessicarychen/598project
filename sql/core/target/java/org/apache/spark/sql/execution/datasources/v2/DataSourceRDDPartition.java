package org.apache.spark.sql.execution.datasources.v2;
public  class DataSourceRDDPartition<T extends java.lang.Object> implements org.apache.spark.Partition, scala.Serializable {
  public  int index ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.DataReaderFactory<T> readerFactory ()  { throw new RuntimeException(); }
  // not preceding
  public   DataSourceRDDPartition (int index, org.apache.spark.sql.sources.v2.reader.DataReaderFactory<T> readerFactory, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
}
