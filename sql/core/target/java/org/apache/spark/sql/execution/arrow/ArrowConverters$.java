package org.apache.spark.sql.execution.arrow;
public  class ArrowConverters$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ArrowConverters$ MODULE$ = null;
  public   ArrowConverters$ ()  { throw new RuntimeException(); }
  /**
   * Maps Iterator from InternalRow to ArrowPayload. Limit ArrowRecordBatch size in ArrowPayload
   * by setting maxRecordsPerBatch or use 0 to fully consume rowIter.
   * @param rowIter (undocumented)
   * @param schema (undocumented)
   * @param maxRecordsPerBatch (undocumented)
   * @param timeZoneId (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
    scala.collection.Iterator<org.apache.spark.sql.execution.arrow.ArrowPayload> toPayloadIterator (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> rowIter, org.apache.spark.sql.types.StructType schema, int maxRecordsPerBatch, java.lang.String timeZoneId, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * Maps Iterator from ArrowPayload to InternalRow. Returns a pair containing the row iterator
   * and the schema from the first batch of Arrow data read.
   * @param payloadIter (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.execution.arrow.ArrowRowIterator fromPayloadIterator (scala.collection.Iterator<org.apache.spark.sql.execution.arrow.ArrowPayload> payloadIter, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * Convert a byte array to an ArrowRecordBatch.
   * @param batchBytes (undocumented)
   * @param allocator (undocumented)
   * @return (undocumented)
   */
    org.apache.arrow.vector.ipc.message.ArrowRecordBatch byteArrayToBatch (byte[] batchBytes, org.apache.arrow.memory.BufferAllocator allocator)  { throw new RuntimeException(); }
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> toDataFrame (org.apache.spark.api.java.JavaRDD<byte[]> payloadRDD, java.lang.String schemaString, org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
}
