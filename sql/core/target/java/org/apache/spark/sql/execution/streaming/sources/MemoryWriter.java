package org.apache.spark.sql.execution.streaming.sources;
public  class MemoryWriter implements org.apache.spark.sql.sources.v2.writer.DataSourceWriter, org.apache.spark.internal.Logging {
  public   MemoryWriter (org.apache.spark.sql.execution.streaming.sources.MemorySinkV2 sink, long batchId, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.sources.MemoryWriterFactory createWriterFactory ()  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.sources.v2.writer.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  void abort (org.apache.spark.sql.sources.v2.writer.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
}
