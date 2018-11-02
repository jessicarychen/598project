package org.apache.spark.sql.execution.datasources.orc;
/**
 * A deserializer to deserialize ORC structs to Spark rows.
 */
public  class OrcDeserializer {
  public   OrcDeserializer (org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType requiredSchema, int[] requestedColIds)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.SpecificInternalRow resultRow ()  { throw new RuntimeException(); }
  private  scala.Function1<org.apache.hadoop.io.WritableComparable<?>, scala.runtime.BoxedUnit>[] fieldWriters ()  { throw new RuntimeException(); }
  private  int[] validColIds ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow deserialize (org.apache.orc.mapred.OrcStruct orcStruct)  { throw new RuntimeException(); }
  /**
   * Creates a writer to write ORC values to Catalyst data structure at the given ordinal.
   * @param dataType (undocumented)
   * @param updater (undocumented)
   * @return (undocumented)
   */
  private  scala.Function2<java.lang.Object, org.apache.hadoop.io.WritableComparable<?>, scala.runtime.BoxedUnit> newWriter (org.apache.spark.sql.types.DataType dataType, org.apache.spark.sql.execution.datasources.orc.OrcDeserializer.CatalystDataUpdater updater)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.util.ArrayData createArrayData (org.apache.spark.sql.types.DataType elementType, int length)  { throw new RuntimeException(); }
  /**
   * A base interface for updating values inside catalyst data structure like <code>InternalRow</code> and
   * <code>ArrayData</code>.
   */
  public  interface CatalystDataUpdater {
    public  void set (int ordinal, Object value)  ;
    public  void setNullAt (int ordinal)  ;
    public  void setBoolean (int ordinal, boolean value)  ;
    public  void setByte (int ordinal, byte value)  ;
    public  void setShort (int ordinal, short value)  ;
    public  void setInt (int ordinal, int value)  ;
    public  void setLong (int ordinal, long value)  ;
    public  void setDouble (int ordinal, double value)  ;
    public  void setFloat (int ordinal, float value)  ;
  }
  public final class RowUpdater implements org.apache.spark.sql.execution.datasources.orc.OrcDeserializer.CatalystDataUpdater {
    public   RowUpdater (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
    public  void setNullAt (int ordinal)  { throw new RuntimeException(); }
    public  void set (int ordinal, Object value)  { throw new RuntimeException(); }
    public  void setBoolean (int ordinal, boolean value)  { throw new RuntimeException(); }
    public  void setByte (int ordinal, byte value)  { throw new RuntimeException(); }
    public  void setShort (int ordinal, short value)  { throw new RuntimeException(); }
    public  void setInt (int ordinal, int value)  { throw new RuntimeException(); }
    public  void setLong (int ordinal, long value)  { throw new RuntimeException(); }
    public  void setDouble (int ordinal, double value)  { throw new RuntimeException(); }
    public  void setFloat (int ordinal, float value)  { throw new RuntimeException(); }
  }
  public final class ArrayDataUpdater implements org.apache.spark.sql.execution.datasources.orc.OrcDeserializer.CatalystDataUpdater {
    public   ArrayDataUpdater (org.apache.spark.sql.catalyst.util.ArrayData array)  { throw new RuntimeException(); }
    public  void setNullAt (int ordinal)  { throw new RuntimeException(); }
    public  void set (int ordinal, Object value)  { throw new RuntimeException(); }
    public  void setBoolean (int ordinal, boolean value)  { throw new RuntimeException(); }
    public  void setByte (int ordinal, byte value)  { throw new RuntimeException(); }
    public  void setShort (int ordinal, short value)  { throw new RuntimeException(); }
    public  void setInt (int ordinal, int value)  { throw new RuntimeException(); }
    public  void setLong (int ordinal, long value)  { throw new RuntimeException(); }
    public  void setDouble (int ordinal, double value)  { throw new RuntimeException(); }
    public  void setFloat (int ordinal, float value)  { throw new RuntimeException(); }
  }
}