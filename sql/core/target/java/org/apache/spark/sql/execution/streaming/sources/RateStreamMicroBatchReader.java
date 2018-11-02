package org.apache.spark.sql.execution.streaming.sources;
public  class RateStreamMicroBatchReader implements org.apache.spark.sql.sources.v2.reader.streaming.MicroBatchReader {
  public   RateStreamMicroBatchReader (org.apache.spark.sql.sources.v2.DataSourceOptions options)  { throw new RuntimeException(); }
  public  org.json4s.DefaultFormats defaultFormats ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  private  int numPartitions ()  { throw new RuntimeException(); }
  private  long rowsPerSecond ()  { throw new RuntimeException(); }
  private  long msPerPartitionBetweenRows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  public  long creationTimeMs ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.RateStreamOffset start ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.RateStreamOffset end ()  { throw new RuntimeException(); }
  public  void setOffsetRange (java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> start, java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset getStartOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset getEndOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  public  java.util.List<org.apache.spark.sql.sources.v2.reader.DataReaderFactory<org.apache.spark.sql.Row>> createDataReaderFactories ()  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.sources.v2.reader.streaming.Offset end)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
