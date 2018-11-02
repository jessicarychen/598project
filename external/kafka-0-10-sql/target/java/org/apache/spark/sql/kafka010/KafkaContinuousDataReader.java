package org.apache.spark.sql.kafka010;
/**
 * A per-task data reader for continuous Kafka processing.
 * <p>
 * param:  topicPartition The (topic, partition) pair this data reader is responsible for.
 * param:  startOffset The offset to start reading from within the partition.
 * param:  kafkaParams Kafka consumer params to use.
 * param:  pollTimeoutMs The timeout for Kafka consumer polling.
 * param:  failOnDataLoss Flag indicating whether data reader should fail if some offsets
 *                       are skipped.
 */
public  class KafkaContinuousDataReader implements org.apache.spark.sql.sources.v2.reader.streaming.ContinuousDataReader<org.apache.spark.sql.catalyst.expressions.UnsafeRow> {
  public   KafkaContinuousDataReader (org.apache.kafka.common.TopicPartition topicPartition, long startOffset, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, long pollTimeoutMs, boolean failOnDataLoss)  { throw new RuntimeException(); }
  private  java.lang.String topic ()  { throw new RuntimeException(); }
  private  int kafkaPartition ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.kafka010.KafkaDataConsumer consumer ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.UnsafeRow sharedRow ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.codegen.BufferHolder bufferHolder ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.codegen.UnsafeRowWriter rowWriter ()  { throw new RuntimeException(); }
  private  long nextKafkaOffset ()  { throw new RuntimeException(); }
  private  org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]> currentRecord ()  { throw new RuntimeException(); }
  public  boolean next ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourcePartitionOffset getOffset ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
