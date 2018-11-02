package org.apache.spark.sql.execution.datasources.v2;
/**
 * A specialization of DataSourceV2Relation with the streaming bit set to true. Otherwise identical
 * to the non-streaming relation.
 */
public  class StreamingDataSourceV2Relation extends org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation {
  public   StreamingDataSourceV2Relation (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> output, org.apache.spark.sql.sources.v2.reader.DataSourceReader reader)  { throw new RuntimeException(); }
  public  boolean isStreaming ()  { throw new RuntimeException(); }
}
