package org.apache.spark.sql.catalyst.plans.logical;
public  class ColumnStat$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ColumnStat$ MODULE$ = null;
  public   ColumnStat$ ()  { throw new RuntimeException(); }
  public  java.lang.String KEY_VERSION ()  { throw new RuntimeException(); }
  private  java.lang.String KEY_DISTINCT_COUNT ()  { throw new RuntimeException(); }
  private  java.lang.String KEY_MIN_VALUE ()  { throw new RuntimeException(); }
  private  java.lang.String KEY_MAX_VALUE ()  { throw new RuntimeException(); }
  private  java.lang.String KEY_NULL_COUNT ()  { throw new RuntimeException(); }
  private  java.lang.String KEY_AVG_LEN ()  { throw new RuntimeException(); }
  private  java.lang.String KEY_MAX_LEN ()  { throw new RuntimeException(); }
  private  java.lang.String KEY_HISTOGRAM ()  { throw new RuntimeException(); }
  /** Returns true iff the we support gathering column statistics on column of the given type. */
  public  boolean supportsType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /** Returns true iff the we support gathering histogram on column of the given type. */
  public  boolean supportsHistogram (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Creates a {@link ColumnStat} object from the given map. This is used to deserialize column stats
   * from some external storage. The serialization side is defined in {@link ColumnStat.toMap}.
   * @param table (undocumented)
   * @param field (undocumented)
   * @param map (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.ColumnStat> fromMap (java.lang.String table, org.apache.spark.sql.types.StructField field, scala.collection.immutable.Map<java.lang.String, java.lang.String> map)  { throw new RuntimeException(); }
  /**
   * Converts from string representation of external data type to the corresponding Catalyst data
   * type.
   * @param s (undocumented)
   * @param name (undocumented)
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  private  Object fromExternalString (java.lang.String s, java.lang.String name, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Constructs an expression to compute column statistics for a given column.
   * <p>
   * The expression should create a single struct column with the following schema:
   * distinctCount: Long, min: T, max: T, nullCount: Long, avgLen: Long, maxLen: Long,
   * distinctCountsForIntervals: Array[Long]
   * <p>
   * Together with {@link rowToColumnStat}, this function is used to create {@link ColumnStat} and
   * as a result should stay in sync with it.
   * @param col (undocumented)
   * @param conf (undocumented)
   * @param colPercentiles (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.CreateNamedStruct statExprs (org.apache.spark.sql.catalyst.expressions.Attribute col, org.apache.spark.sql.internal.SQLConf conf, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.util.ArrayData> colPercentiles)  { throw new RuntimeException(); }
  /** Convert a struct for column stats (defined in `statExprs`) into {@link ColumnStat}. */
  public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat rowToColumnStat (org.apache.spark.sql.catalyst.InternalRow row, org.apache.spark.sql.catalyst.expressions.Attribute attr, long rowCount, scala.Option<org.apache.spark.sql.catalyst.util.ArrayData> percentiles)  { throw new RuntimeException(); }
}
