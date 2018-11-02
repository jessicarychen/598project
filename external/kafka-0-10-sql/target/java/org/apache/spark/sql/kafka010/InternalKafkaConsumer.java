package org.apache.spark.sql.kafka010;
/**
 * A wrapper around Kafka's KafkaConsumer that throws error when data loss is detected.
 * This is not for direct use outside this file.
 */
  class InternalKafkaConsumer implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  static private  long UNKNOWN_OFFSET ()  { throw new RuntimeException(); }
  static private  void reportDataLoss0 (boolean failOnDataLoss, java.lang.String finalMessage, java.lang.Throwable cause)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
  // not preceding
  public   InternalKafkaConsumer (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  private  java.lang.String groupId ()  { throw new RuntimeException(); }
  private  org.apache.kafka.clients.consumer.KafkaConsumer<byte[], byte[]> consumer ()  { throw new RuntimeException(); }
  /** indicates whether this consumer is in use or not */
  public  boolean inUse ()  { throw new RuntimeException(); }
  /** indicate whether this consumer is going to be stopped in the next release */
  public  boolean markedForClose ()  { throw new RuntimeException(); }
  /** Iterator to the already fetch data */
  private  java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>> fetchedData ()  { throw new RuntimeException(); }
  private  long nextOffsetInFetchedData ()  { throw new RuntimeException(); }
  /** Create a KafkaConsumer to fetch records for `topicPartition` */
  private  org.apache.kafka.clients.consumer.KafkaConsumer<byte[], byte[]> createConsumer ()  { throw new RuntimeException(); }
  private <T extends java.lang.Object> T runUninterruptiblyIfPossible (scala.Function0<T> body)  { throw new RuntimeException(); }
  /**
   * Return the available offset range of the current partition. It's a pair of the earliest offset
   * and the latest offset.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.KafkaDataConsumer.AvailableOffsetRange getAvailableOffsetRange ()  { throw new RuntimeException(); }
  /**
   * Get the record for the given offset if available. Otherwise it will either throw error
   * (if failOnDataLoss = true), or return the next available offset within [offset, untilOffset),
   * or null.
   * <p>
   * @param offset the offset to fetch.
   * @param untilOffset the max offset to fetch. Exclusive.
   * @param pollTimeoutMs timeout in milliseconds to poll data from Kafka.
   * @param failOnDataLoss When <code>failOnDataLoss</code> is <code>true</code>, this method will either return record at
   *                       offset if available, or throw exception.when <code>failOnDataLoss</code> is <code>false</code>,
   *                       this method will either return record at offset if available, or return
   *                       the next earliest available record less than untilOffset, or null. It
   *                       will not throw any exception.
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> get (long offset, long untilOffset, long pollTimeoutMs, boolean failOnDataLoss)  { throw new RuntimeException(); }
  /**
   * Return the next earliest available offset in [offset, untilOffset). If all offsets in
   * [offset, untilOffset) are invalid (e.g., the topic is deleted and recreated), it will return
   * <code>UNKNOWN_OFFSET</code>.
   * @param offset (undocumented)
   * @param untilOffset (undocumented)
   * @return (undocumented)
   */
  private  long getEarliestAvailableOffsetBetween (long offset, long untilOffset)  { throw new RuntimeException(); }
  /**
   * Get the record for the given offset if available. Otherwise it will either throw error
   * (if failOnDataLoss = true), or return the next available offset within [offset, untilOffset),
   * or null.
   * <p>
   * @throws OffsetOutOfRangeException if <code>offset</code> is out of range
   * @throws TimeoutException if cannot fetch the record in <code>pollTimeoutMs</code> milliseconds.
   * @param offset (undocumented)
   * @param untilOffset (undocumented)
   * @param pollTimeoutMs (undocumented)
   * @param failOnDataLoss (undocumented)
   * @return (undocumented)
   */
  private  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> fetchData (long offset, long untilOffset, long pollTimeoutMs, boolean failOnDataLoss)  { throw new RuntimeException(); }
  /** Create a new consumer and reset cached states */
  private  void resetConsumer ()  { throw new RuntimeException(); }
  /** Reset the internal pre-fetched data. */
  private  void resetFetchedData ()  { throw new RuntimeException(); }
  /**
   * Return an addition message including useful message and instruction.
   * @param failOnDataLoss (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String additionalMessage (boolean failOnDataLoss)  { throw new RuntimeException(); }
  /**
   * Throw an exception or log a warning as per <code>failOnDataLoss</code>.
   * @param failOnDataLoss (undocumented)
   * @param message (undocumented)
   * @param cause (undocumented)
   */
  private  void reportDataLoss (boolean failOnDataLoss, java.lang.String message, java.lang.Throwable cause)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  private  void seek (long offset)  { throw new RuntimeException(); }
  private  void poll (long pollTimeoutMs)  { throw new RuntimeException(); }
}
