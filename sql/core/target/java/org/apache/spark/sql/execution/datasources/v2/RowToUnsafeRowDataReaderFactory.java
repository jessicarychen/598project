package org.apache.spark.sql.execution.datasources.v2;
public  class RowToUnsafeRowDataReaderFactory implements org.apache.spark.sql.sources.v2.reader.DataReaderFactory<org.apache.spark.sql.catalyst.expressions.UnsafeRow> {
  public   RowToUnsafeRowDataReaderFactory (org.apache.spark.sql.sources.v2.reader.DataReaderFactory<org.apache.spark.sql.Row> rowReaderFactory, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  java.lang.String[] preferredLocations ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.DataReader<org.apache.spark.sql.catalyst.expressions.UnsafeRow> createDataReader ()  { throw new RuntimeException(); }
}
