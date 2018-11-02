package org.apache.spark.sql.catalyst.expressions.codegen;
public  class CodeGenerator$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CodeGenerator$ MODULE$ = null;
  public   CodeGenerator$ ()  { throw new RuntimeException(); }
  public final  int DEFAULT_JVM_HUGE_METHOD_LIMIT ()  { throw new RuntimeException(); }
  public final  int MAX_JVM_METHOD_PARAMS_LENGTH ()  { throw new RuntimeException(); }
  public final  int MERGE_SPLIT_METHODS_THRESHOLD ()  { throw new RuntimeException(); }
  public final  int GENERATED_CLASS_SIZE_THRESHOLD ()  { throw new RuntimeException(); }
  public final  int OUTER_CLASS_VARIABLES_THRESHOLD ()  { throw new RuntimeException(); }
  public final  int MUTABLESTATEARRAY_SIZE_LIMIT ()  { throw new RuntimeException(); }
  /**
   * Compile the Java source code into a Java class, using Janino.
   * <p>
   * @return a pair of a generated class and the max bytecode size of generated functions.
   * @param code (undocumented)
   */
  public  scala.Tuple2<org.apache.spark.sql.catalyst.expressions.codegen.GeneratedClass, java.lang.Object> compile (org.apache.spark.sql.catalyst.expressions.codegen.CodeAndComment code)  { throw new RuntimeException(); }
  /**
   * Compile the Java source code into a Java class, using Janino.
   * @param code (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<org.apache.spark.sql.catalyst.expressions.codegen.GeneratedClass, java.lang.Object> doCompile (org.apache.spark.sql.catalyst.expressions.codegen.CodeAndComment code)  { throw new RuntimeException(); }
  /**
   * Returns the max bytecode size of the generated functions by inspecting janino private fields.
   * Also, this method updates the metrics information.
   * @param evaluator (undocumented)
   * @return (undocumented)
   */
  private  int updateAndGetCompilationStats (org.codehaus.janino.ClassBodyEvaluator evaluator)  { throw new RuntimeException(); }
  /**
   * A cache of generated classes.
   * <p>
   * From the Guava Docs: A Cache is similar to ConcurrentMap, but not quite the same. The most
   * fundamental difference is that a ConcurrentMap persists all elements that are added to it until
   * they are explicitly removed. A Cache on the other hand is generally configured to evict entries
   * automatically, in order to constrain its memory footprint.  Note that this cache does not use
   * weak keys/values and thus does not respond to memory pressure.
   * @return (undocumented)
   */
  private  com.google.common.cache.LoadingCache<org.apache.spark.sql.catalyst.expressions.codegen.CodeAndComment, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.codegen.GeneratedClass, java.lang.Object>> cache ()  { throw new RuntimeException(); }
}
