package org.apache.spark.sql.execution.datasources.v2;
public  class RowToUnsafeDataReader implements org.apache.spark.sql.sources.v2.reader.DataReader<org.apache.spark.sql.catalyst.expressions.UnsafeRow> {
  public  org.apache.spark.sql.sources.v2.reader.DataReader<org.apache.spark.sql.Row> rowReader ()  { throw new RuntimeException(); }
  // not preceding
  public   RowToUnsafeDataReader (org.apache.spark.sql.sources.v2.reader.DataReader<org.apache.spark.sql.Row> rowReader, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<org.apache.spark.sql.Row> encoder)  { throw new RuntimeException(); }
  public  boolean next ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
