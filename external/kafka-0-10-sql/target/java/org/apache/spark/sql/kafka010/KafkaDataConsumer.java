package org.apache.spark.sql.kafka010;
  interface KafkaDataConsumer {
  static public  class AvailableOffsetRange implements scala.Product, scala.Serializable {
    public  long earliest ()  { throw new RuntimeException(); }
    public  long latest ()  { throw new RuntimeException(); }
    // not preceding
    public   AvailableOffsetRange (long earliest, long latest)  { throw new RuntimeException(); }
  }
  static public  class AvailableOffsetRange$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.sql.kafka010.KafkaDataConsumer.AvailableOffsetRange> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AvailableOffsetRange$ MODULE$ = null;
    public   AvailableOffsetRange$ ()  { throw new RuntimeException(); }
  }
  static   class CachedKafkaDataConsumer implements org.apache.spark.sql.kafka010.KafkaDataConsumer, scala.Product, scala.Serializable {
    public  org.apache.spark.sql.kafka010.InternalKafkaConsumer internalConsumer ()  { throw new RuntimeException(); }
    // not preceding
    public   CachedKafkaDataConsumer (org.apache.spark.sql.kafka010.InternalKafkaConsumer internalConsumer)  { throw new RuntimeException(); }
    public  void release ()  { throw new RuntimeException(); }
  }
  static   class CachedKafkaDataConsumer$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.kafka010.InternalKafkaConsumer, org.apache.spark.sql.kafka010.KafkaDataConsumer.CachedKafkaDataConsumer> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CachedKafkaDataConsumer$ MODULE$ = null;
    public   CachedKafkaDataConsumer$ ()  { throw new RuntimeException(); }
  }
  static   class NonCachedKafkaDataConsumer implements org.apache.spark.sql.kafka010.KafkaDataConsumer, scala.Product, scala.Serializable {
    public  org.apache.spark.sql.kafka010.InternalKafkaConsumer internalConsumer ()  { throw new RuntimeException(); }
    // not preceding
    public   NonCachedKafkaDataConsumer (org.apache.spark.sql.kafka010.InternalKafkaConsumer internalConsumer)  { throw new RuntimeException(); }
    public  void release ()  { throw new RuntimeException(); }
  }
  static   class NonCachedKafkaDataConsumer$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.kafka010.InternalKafkaConsumer, org.apache.spark.sql.kafka010.KafkaDataConsumer.NonCachedKafkaDataConsumer> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NonCachedKafkaDataConsumer$ MODULE$ = null;
    public   NonCachedKafkaDataConsumer$ ()  { throw new RuntimeException(); }
  }
  static   class CacheKey implements scala.Product, scala.Serializable {
    public  java.lang.String groupId ()  { throw new RuntimeException(); }
    public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
    // not preceding
    public   CacheKey (java.lang.String groupId, org.apache.kafka.common.TopicPartition topicPartition)  { throw new RuntimeException(); }
    public   CacheKey (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  }
  static   class CacheKey$ extends scala.runtime.AbstractFunction2<java.lang.String, org.apache.kafka.common.TopicPartition, org.apache.spark.sql.kafka010.KafkaDataConsumer.CacheKey> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CacheKey$ MODULE$ = null;
    public   CacheKey$ ()  { throw new RuntimeException(); }
  }
  /**
   * Get the record for the given offset if available. Otherwise it will either throw error
   * (if failOnDataLoss = true), or return the next available offset within [offset, untilOffset),
   * or null.
   * <p>
   * @param offset         the offset to fetch.
   * @param untilOffset    the max offset to fetch. Exclusive.
   * @param pollTimeoutMs  timeout in milliseconds to poll data from Kafka.
   * @param failOnDataLoss When <code>failOnDataLoss</code> is <code>true</code>, this method will either return record at
   *                       offset if available, or throw exception.when <code>failOnDataLoss</code> is <code>false</code>,
   *                       this method will either return record at offset if available, or return
   *                       the next earliest available record less than untilOffset, or null. It
   *                       will not throw any exception.
   * @return (undocumented)
   */
  public  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> get (long offset, long untilOffset, long pollTimeoutMs, boolean failOnDataLoss)  ;
  /**
   * Return the available offset range of the current partition. It's a pair of the earliest offset
   * and the latest offset.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.KafkaDataConsumer.AvailableOffsetRange getAvailableOffsetRange ()  ;
  /**
   * Release this consumer from being further used. Depending on its implementation,
   * this consumer will be either finalized, or reset for reuse later.
   */
  public  void release ()  ;
  /** Reference to the internal implementation that this wrapper delegates to */
  public  org.apache.spark.sql.kafka010.InternalKafkaConsumer internalConsumer ()  ;
}
