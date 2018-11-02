package org.apache.spark.sql.execution.datasources.v2;
public  class InternalRowDataWriterFactory implements org.apache.spark.sql.sources.v2.writer.DataWriterFactory<org.apache.spark.sql.catalyst.InternalRow> {
  public   InternalRowDataWriterFactory (org.apache.spark.sql.sources.v2.writer.DataWriterFactory<org.apache.spark.sql.Row> rowWriterFactory, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.writer.DataWriter<org.apache.spark.sql.catalyst.InternalRow> createDataWriter (int partitionId, int attemptNumber)  { throw new RuntimeException(); }
}
