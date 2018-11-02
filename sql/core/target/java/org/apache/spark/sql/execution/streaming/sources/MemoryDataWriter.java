package org.apache.spark.sql.execution.streaming.sources;
public  class MemoryDataWriter implements org.apache.spark.sql.sources.v2.writer.DataWriter<org.apache.spark.sql.Row>, org.apache.spark.internal.Logging {
  public   MemoryDataWriter (int partition, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  private  scala.collection.mutable.Buffer<org.apache.spark.sql.Row> data ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.sources.MemoryWriterCommitMessage commit ()  { throw new RuntimeException(); }
  public  void abort ()  { throw new RuntimeException(); }
}
