package org.apache.spark.sql.execution.streaming;
public  class OffsetSeqMetadata$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OffsetSeqMetadata$ MODULE$ = null;
  public   OffsetSeqMetadata$ ()  { throw new RuntimeException(); }
  private  java.lang.Object format ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.internal.config.ConfigEntry<? super java.lang.String>> relevantSQLConfs ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.OffsetSeqMetadata apply (java.lang.String json)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.OffsetSeqMetadata apply (long batchWatermarkMs, long batchTimestampMs, org.apache.spark.sql.RuntimeConfig sessionConf)  { throw new RuntimeException(); }
  /** Set the SparkSession configuration with the values in the metadata */
  public  void setSessionConf (org.apache.spark.sql.execution.streaming.OffsetSeqMetadata metadata, org.apache.spark.sql.RuntimeConfig sessionConf)  { throw new RuntimeException(); }
}
