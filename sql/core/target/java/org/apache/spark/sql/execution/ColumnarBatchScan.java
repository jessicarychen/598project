package org.apache.spark.sql.execution;
/**
 * Helper trait for abstracting scan functionality using {@link ColumnarBatch}es.
 */
  interface ColumnarBatchScan extends org.apache.spark.sql.execution.CodegenSupport {
  public  scala.Option<scala.collection.Seq<java.lang.String>> vectorTypes ()  ;
  public  boolean supportsBatch ()  ;
  public  boolean needsUnsafeRowConversion ()  ;
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  ;
  /**
   * Generate {@link ColumnVector} expressions for our parent to consume as rows.
   * This is called once per {@link ColumnarBatch}.
   * @param ctx (undocumented)
   * @param columnVar (undocumented)
   * @param ordinal (undocumented)
   * @param dataType (undocumented)
   * @param nullable (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode genCodeColumnVector (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String columnVar, java.lang.String ordinal, org.apache.spark.sql.types.DataType dataType, boolean nullable)  ;
  /**
   * Produce code to process the input iterator as {@link ColumnarBatch}es.
   * This produces an {@link UnsafeRow} for each row in each batch.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String doProduce (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  ;
  public  java.lang.String produceBatches (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input)  ;
  public  java.lang.String produceRows (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input)  ;
}
