package org.apache.spark.sql.execution.streaming;
/**
 *  A source that generates increment long values with timestamps. Each generated row has two
 *  columns: a timestamp column for the generated time and an auto increment long column starting
 *  with 0L.
 * <p>
 *  This source supports the following options:
 *  - <code>rowsPerSecond</code> (e.g. 100, default: 1): How many rows should be generated per second.
 *  - <code>rampUpTime</code> (e.g. 5s, default: 0s): How long to ramp up before the generating speed
 *    becomes <code>rowsPerSecond</code>. Using finer granularities than seconds will be truncated to integer
 *    seconds.
 *  - <code>numPartitions</code> (e.g. 10, default: Spark's default parallelism): The partition number for the
 *    generated rows. The source will try its best to reach <code>rowsPerSecond</code>, but the query may
 *    be resource constrained, and <code>numPartitions</code> can be tweaked to help reach the desired speed.
 */
public  class RateSourceProvider implements org.apache.spark.sql.sources.StreamSourceProvider, org.apache.spark.sql.sources.DataSourceRegister, org.apache.spark.sql.sources.v2.DataSourceV2, org.apache.spark.sql.sources.v2.ContinuousReadSupport {
  static public  org.apache.spark.sql.types.StructType SCHEMA ()  { throw new RuntimeException(); }
  static public  int VERSION ()  { throw new RuntimeException(); }
  public   RateSourceProvider ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, org.apache.spark.sql.types.StructType> sourceSchema (org.apache.spark.sql.SQLContext sqlContext, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.Source createSource (org.apache.spark.sql.SQLContext sqlContext, java.lang.String metadataPath, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.ContinuousReader createContinuousReader (java.util.Optional<org.apache.spark.sql.types.StructType> schema, java.lang.String checkpointLocation, org.apache.spark.sql.sources.v2.DataSourceOptions options)  { throw new RuntimeException(); }
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
}
