package org.apache.spark.sql.execution.datasources.v2;
public  class InternalRowDataWriter implements org.apache.spark.sql.sources.v2.writer.DataWriter<org.apache.spark.sql.catalyst.InternalRow> {
  public   InternalRowDataWriter (org.apache.spark.sql.sources.v2.writer.DataWriter<org.apache.spark.sql.Row> rowWriter, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<org.apache.spark.sql.Row> encoder)  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow record)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.writer.WriterCommitMessage commit ()  { throw new RuntimeException(); }
  public  void abort ()  { throw new RuntimeException(); }
}
