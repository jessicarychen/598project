package org.apache.spark.sql.execution.streaming.sources;
/**
 * This is a temporary register as we build out v2 migration. Microbatch read support should
 * be implemented in the same register as v1.
 */
public  class RateSourceProviderV2 implements org.apache.spark.sql.sources.v2.DataSourceV2, org.apache.spark.sql.sources.v2.MicroBatchReadSupport, org.apache.spark.sql.sources.DataSourceRegister {
  public   RateSourceProviderV2 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.v2.reader.streaming.MicroBatchReader createMicroBatchReader (java.util.Optional<org.apache.spark.sql.types.StructType> schema, java.lang.String checkpointLocation, org.apache.spark.sql.sources.v2.DataSourceOptions options)  { throw new RuntimeException(); }
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
}
