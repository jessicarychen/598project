package org.apache.spark.sql.catalyst.analysis;
public  class SimpleFunctionRegistry implements org.apache.spark.sql.catalyst.analysis.FunctionRegistry {
  public   SimpleFunctionRegistry ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.sql.catalyst.FunctionIdentifier, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>>> functionBuilders ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.FunctionIdentifier normalizeFuncName (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
  public  void registerFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, org.apache.spark.sql.catalyst.expressions.ExpressionInfo info, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> builder)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression lookupFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.FunctionIdentifier> listFunction ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.ExpressionInfo> lookupFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
  public  scala.Option<scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>> lookupFunctionBuilder (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
  public  boolean dropFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.SimpleFunctionRegistry clone ()  { throw new RuntimeException(); }
}
