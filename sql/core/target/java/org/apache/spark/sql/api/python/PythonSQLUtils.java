package org.apache.spark.sql.api.python;
public  class PythonSQLUtils {
  static public  org.apache.spark.sql.types.DataType parseDataType (java.lang.String typeText)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.ExpressionInfo[] listBuiltinFunctionInfos ()  { throw new RuntimeException(); }
  /**
   * Python Callable function to convert ArrowPayloads into a {@link DataFrame}.
   * <p>
   * @param payloadRDD A JavaRDD of ArrowPayloads.
   * @param schemaString JSON Formatted Schema for ArrowPayloads.
   * @param sqlContext The active {@link SQLContext}.
   * @return The converted {@link DataFrame}.
   */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> arrowPayloadToDataFrame (org.apache.spark.api.java.JavaRDD<byte[]> payloadRDD, java.lang.String schemaString, org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
}
