package org.apache.spark.sql.execution.datasources.v2;
/**
 * A base class for data source reader holder with customized equals/hashCode methods.
 */
public  interface DataSourceReaderHolder {
  /**
   * The output of the data source reader, w.r.t. column pruning.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  ;
  /**
   * The held data source reader.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.sources.v2.reader.DataSourceReader reader ()  ;
  /**
   * The metadata of this data source reader that can be used for equality test.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> metadata ()  ;
  public  boolean canEqual (Object other)  ;
  public  boolean equals (Object other)  ;
  public  int hashCode ()  ;
}
