package org.apache.spark.sql.execution.arrow;
/**
 * Store Arrow data in a form that can be serialized by Spark and served to a Python process.
 */
  class ArrowPayload implements scala.Serializable {
     ArrowPayload (byte[] payload)  { throw new RuntimeException(); }
  /**
   * Convert the ArrowPayload to an ArrowRecordBatch.
   * @param allocator (undocumented)
   * @return (undocumented)
   */
  public  org.apache.arrow.vector.ipc.message.ArrowRecordBatch loadBatch (org.apache.arrow.memory.BufferAllocator allocator)  { throw new RuntimeException(); }
  /**
   * Get the ArrowPayload as a type that can be served to Python.
   * @return (undocumented)
   */
  public  byte[] asPythonSerializable ()  { throw new RuntimeException(); }
}
