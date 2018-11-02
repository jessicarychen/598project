package org.apache.spark.sql;
/**
 * A class to consume data generated by a <code>StreamingQuery</code>. Typically this is used to send the
 * generated data to external systems. Each partition will use a new deserialized instance, so you
 * usually should do all the initialization (e.g. opening a connection or initiating a transaction)
 * in the <code>open</code> method.
 * <p>
 * Scala example:
 * <pre><code>
 *   datasetOfString.writeStream.foreach(new ForeachWriter[String] {
 *
 *     def open(partitionId: Long, version: Long): Boolean = {
 *       // open connection
 *     }
 *
 *     def process(record: String) = {
 *       // write string to connection
 *     }
 *
 *     def close(errorOrNull: Throwable): Unit = {
 *       // close the connection
 *     }
 *   })
 * </code></pre>
 * <p>
 * Java example:
 * <pre><code>
 *  datasetOfString.writeStream().foreach(new ForeachWriter&lt;String&gt;() {
 *
 *    &#64;Override
 *    public boolean open(long partitionId, long version) {
 *      // open connection
 *    }
 *
 *    &#64;Override
 *    public void process(String value) {
 *      // write string to connection
 *    }
 *
 *    &#64;Override
 *    public void close(Throwable errorOrNull) {
 *      // close the connection
 *    }
 *  });
 * </code></pre>
 * @since 2.0.0
 */
public abstract class ForeachWriter<T extends java.lang.Object> implements scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ForeachWriter ()  { throw new RuntimeException(); }
  /**
   * Called when starting to process one partition of new data in the executor. The <code>version</code> is
   * for data deduplication when there are failures. When recovering from a failure, some data may
   * be generated multiple times but they will always have the same version.
   * <p>
   * If this method finds using the <code>partitionId</code> and <code>version</code> that this partition has already been
   * processed, it can return <code>false</code> to skip the further data processing. However, <code>close</code> still
   * will be called for cleaning up resources.
   * <p>
   * @param partitionId the partition id.
   * @param version a unique id for data deduplication.
   * @return <code>true</code> if the corresponding partition and version id should be processed. <code>false</code>
   *         indicates the partition should be skipped.
   */
  public abstract  boolean open (long partitionId, long version)  ;
  /**
   * Called to process the data in the executor side. This method will be called only when <code>open</code>
   * returns <code>true</code>.
   * @param value (undocumented)
   */
  public abstract  void process (T value)  ;
  /**
   * Called when stopping to process one partition of new data in the executor side. This is
   * guaranteed to be called either <code>open</code> returns <code>true</code> or <code>false</code>. However,
   * <code>close</code> won't be called in the following cases:
   *  - JVM crashes without throwing a <code>Throwable</code>
   *  - <code>open</code> throws a <code>Throwable</code>.
   * <p>
   * @param errorOrNull the error thrown during processing data or null if there was no error.
   */
  public abstract  void close (java.lang.Throwable errorOrNull)  ;
}
