package org.apache.spark.streaming.api.java;
/**
 * A Java-friendly interface to {@link org.apache.spark.streaming.dstream.DStream}, the basic
 * abstraction in Spark Streaming that represents a continuous stream of data.
 * DStreams can either be created from live data (such as, data from TCP sockets, Kafka, Flume,
 * etc.) or it can be generated by transforming existing DStreams using operations such as <code>map</code>,
 * <code>window</code>. For operations applicable to key-value pair DStreams, see
 * {@link org.apache.spark.streaming.api.java.JavaPairDStream}.
 */
public  class JavaDStream<T extends java.lang.Object> extends org.apache.spark.streaming.api.java.AbstractJavaDStreamLike<T, org.apache.spark.streaming.api.java.JavaDStream<T>, org.apache.spark.api.java.JavaRDD<T>> {
  /**
   * Convert a scala {@link org.apache.spark.streaming.dstream.DStream} to a Java-friendly
   * {@link org.apache.spark.streaming.api.java.JavaDStream}.
   * @param dstream (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<T> fromDStream (org.apache.spark.streaming.dstream.DStream<T> dstream, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.Long> scalaIntToJavaLong (org.apache.spark.streaming.dstream.DStream<java.lang.Object> in)  { throw new RuntimeException(); }
  static public  void print ()  { throw new RuntimeException(); }
  static public  void print (int num)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.Long> count ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaPairDStream<T, java.lang.Long> countByValue ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaPairDStream<T, java.lang.Long> countByValue (int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.Long> countByWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaPairDStream<T, java.lang.Long> countByValueAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaPairDStream<T, java.lang.Long> countByValueAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<java.util.List<T>> glom ()  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.StreamingContext context ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<U> map (org.apache.spark.api.java.function.Function<T, U> f)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> mapToPair (org.apache.spark.api.java.function.PairFunction<T, K2, V2> f)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<U> flatMap (org.apache.spark.api.java.function.FlatMapFunction<T, U> f)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> flatMapToPair (org.apache.spark.api.java.function.PairFlatMapFunction<T, K2, V2> f)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<U> mapPartitions (org.apache.spark.api.java.function.FlatMapFunction<java.util.Iterator<T>, U> f)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> mapPartitionsToPair (org.apache.spark.api.java.function.PairFlatMapFunction<java.util.Iterator<T>, K2, V2> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> reduce (org.apache.spark.api.java.function.Function2<T, T, T> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> reduceByWindow (org.apache.spark.api.java.function.Function2<T, T, T> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.api.java.JavaDStream<T> reduceByWindow (org.apache.spark.api.java.function.Function2<T, T, T> reduceFunc, org.apache.spark.api.java.function.Function2<T, T, T> invReduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  static public  java.util.List<R> slice (org.apache.spark.streaming.Time fromTime, org.apache.spark.streaming.Time toTime)  { throw new RuntimeException(); }
  static public  void foreachRDD (org.apache.spark.api.java.function.VoidFunction<R> foreachFunc)  { throw new RuntimeException(); }
  static public  void foreachRDD (org.apache.spark.api.java.function.VoidFunction2<R, org.apache.spark.streaming.Time> foreachFunc)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<U> transform (org.apache.spark.api.java.function.Function<R, org.apache.spark.api.java.JavaRDD<U>> transformFunc)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<U> transform (org.apache.spark.api.java.function.Function2<R, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaRDD<U>> transformFunc)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> transformToPair (org.apache.spark.api.java.function.Function<R, org.apache.spark.api.java.JavaPairRDD<K2, V2>> transformFunc)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> transformToPair (org.apache.spark.api.java.function.Function2<R, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaPairRDD<K2, V2>> transformFunc)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<W> transformWith (org.apache.spark.streaming.api.java.JavaDStream<U> other, org.apache.spark.api.java.function.Function3<R, org.apache.spark.api.java.JavaRDD<U>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaRDD<W>> transformFunc)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object, K2 extends java.lang.Object, V2 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> transformWithToPair (org.apache.spark.streaming.api.java.JavaDStream<U> other, org.apache.spark.api.java.function.Function3<R, org.apache.spark.api.java.JavaRDD<U>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaPairRDD<K2, V2>> transformFunc)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object, W extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<W> transformWith (org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> other, org.apache.spark.api.java.function.Function3<R, org.apache.spark.api.java.JavaPairRDD<K2, V2>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaRDD<W>> transformFunc)  { throw new RuntimeException(); }
  static public <K2 extends java.lang.Object, V2 extends java.lang.Object, K3 extends java.lang.Object, V3 extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K3, V3> transformWithToPair (org.apache.spark.streaming.api.java.JavaPairDStream<K2, V2> other, org.apache.spark.api.java.function.Function3<R, org.apache.spark.api.java.JavaPairRDD<K2, V2>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaPairRDD<K3, V3>> transformFunc)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.dstream.DStream<T> checkpoint (org.apache.spark.streaming.Duration interval)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.DStream<T> dstream ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<T> classTag ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaDStream (org.apache.spark.streaming.dstream.DStream<T> dstream, scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<T> wrapRDD (org.apache.spark.rdd.RDD<T> rdd)  { throw new RuntimeException(); }
  /** Return a new DStream containing only the elements that satisfy a predicate. */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> filter (org.apache.spark.api.java.function.Function<T, java.lang.Boolean> f)  { throw new RuntimeException(); }
  /** Persist RDDs of this DStream with the default storage level (MEMORY_ONLY_SER) */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> cache ()  { throw new RuntimeException(); }
  /** Persist RDDs of this DStream with the default storage level (MEMORY_ONLY_SER) */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> persist ()  { throw new RuntimeException(); }
  /** Persist the RDDs of this DStream with the given storage level */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> persist (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /** Generate an RDD for the given duration */
  public  org.apache.spark.api.java.JavaRDD<T> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD contains all the elements in seen in a
   * sliding window of time over this DStream. The new DStream generates RDDs with
   * the same interval as this DStream.
   * @param windowDuration width of the window; must be a multiple of this DStream's interval.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> window (org.apache.spark.streaming.Duration windowDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD contains all the elements in seen in a
   * sliding window of time over this DStream.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> window (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by unifying data of another DStream with this DStream.
   * @param that Another DStream having the same interval (i.e., slideDuration) as this DStream.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> union (org.apache.spark.streaming.api.java.JavaDStream<T> that)  { throw new RuntimeException(); }
  /**
   * Return a new DStream with an increased or decreased level of parallelism. Each RDD in the
   * returned DStream has exactly numPartitions partitions.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> repartition (int numPartitions)  { throw new RuntimeException(); }
}
