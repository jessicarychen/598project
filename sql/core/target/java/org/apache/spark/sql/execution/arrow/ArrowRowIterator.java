package org.apache.spark.sql.execution.arrow;
/**
 * Iterator interface to iterate over Arrow record batches and return rows
 */
  interface ArrowRowIterator extends scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> {
  /**
   * Return the schema loaded from the Arrow record batch being iterated over
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType schema ()  ;
}
