package org.apache.spark.sql.execution;
public  interface DataSourceScanExec extends org.apache.spark.sql.execution.LeafExecNode, org.apache.spark.sql.execution.CodegenSupport {
  public  org.apache.spark.sql.sources.BaseRelation relation ()  ;
  public  scala.Option<org.apache.spark.sql.catalyst.TableIdentifier> tableIdentifier ()  ;
  public  java.lang.String nodeNamePrefix ()  ;
  public  java.lang.String nodeName ()  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> metadata ()  ;
  public  java.lang.String simpleString ()  ;
  public  java.lang.String verboseString ()  ;
  public  java.lang.String treeString (boolean verbose, boolean addSuffix)  ;
  /**
   * Shorthand for calling redactString() without specifying redacting rules
   * @param text (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String redact (java.lang.String text)  ;
}
