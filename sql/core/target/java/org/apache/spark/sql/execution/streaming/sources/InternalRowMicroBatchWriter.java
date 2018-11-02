package org.apache.spark.sql.execution.streaming.sources;
public  class InternalRowMicroBatchWriter implements org.apache.spark.sql.sources.v2.writer.DataSourceWriter, org.apache.spark.sql.sources.v2.writer.SupportsWriteInternalRow {
  public   InternalRowMicroBatchWriter (long batchId, org.apache.spark.sql.sources.v2.writer.streaming.StreamWriter writer)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.sources.v2.writer.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  void abort (org.apache.spark.sql.sources.v2.writer.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.writer.DataWriterFactory<org.apache.spark.sql.catalyst.InternalRow> createInternalRowWriterFactory ()  { throw new RuntimeException(); }
}
