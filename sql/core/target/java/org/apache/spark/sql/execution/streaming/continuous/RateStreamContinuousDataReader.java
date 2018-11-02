package org.apache.spark.sql.execution.streaming.continuous;
public  class RateStreamContinuousDataReader implements org.apache.spark.sql.sources.v2.reader.streaming.ContinuousDataReader<org.apache.spark.sql.Row> {
  public   RateStreamContinuousDataReader (long startValue, long startTimeMs, int partitionIndex, long increment, double rowsPerSecond)  { throw new RuntimeException(); }
  private  long nextReadTime ()  { throw new RuntimeException(); }
  private  long readTimeIncrement ()  { throw new RuntimeException(); }
  private  long currentValue ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Row currentRow ()  { throw new RuntimeException(); }
  public  boolean next ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Row get ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset getOffset ()  { throw new RuntimeException(); }
}
