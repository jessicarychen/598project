package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * A base class for generators of byte code to perform expression evaluation.  Includes a set of
 * helpers for referring to Catalyst types and building trees that perform evaluation of individual
 * expressions.
 */
public abstract class CodeGenerator<InType extends java.lang.Object, OutType extends java.lang.Object> implements org.apache.spark.internal.Logging {
  static public final  int DEFAULT_JVM_HUGE_METHOD_LIMIT ()  { throw new RuntimeException(); }
  static public final  int MAX_JVM_METHOD_PARAMS_LENGTH ()  { throw new RuntimeException(); }
  static public final  int MERGE_SPLIT_METHODS_THRESHOLD ()  { throw new RuntimeException(); }
  static public final  int GENERATED_CLASS_SIZE_THRESHOLD ()  { throw new RuntimeException(); }
  static public final  int OUTER_CLASS_VARIABLES_THRESHOLD ()  { throw new RuntimeException(); }
  static public final  int MUTABLESTATEARRAY_SIZE_LIMIT ()  { throw new RuntimeException(); }
  /**
   * Compile the Java source code into a Java class, using Janino.
   * <p>
   * @return a pair of a generated class and the max bytecode size of generated functions.
   * @param code (undocumented)
   */
  static public  scala.Tuple2<org.apache.spark.sql.catalyst.expressions.codegen.GeneratedClass, java.lang.Object> compile (org.apache.spark.sql.catalyst.expressions.codegen.CodeAndComment code)  { throw new RuntimeException(); }
  /**
   * Compile the Java source code into a Java class, using Janino.
   * @param code (undocumented)
   * @return (undocumented)
   */
  static private  scala.Tuple2<org.apache.spark.sql.catalyst.expressions.codegen.GeneratedClass, java.lang.Object> doCompile (org.apache.spark.sql.catalyst.expressions.codegen.CodeAndComment code)  { throw new RuntimeException(); }
  /**
   * Returns the max bytecode size of the generated functions by inspecting janino private fields.
   * Also, this method updates the metrics information.
   * @param evaluator (undocumented)
   * @return (undocumented)
   */
  static private  int updateAndGetCompilationStats (org.codehaus.janino.ClassBodyEvaluator evaluator)  { throw new RuntimeException(); }
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
  static private  com.google.common.cache.LoadingCache<org.apache.spark.sql.catalyst.expressions.codegen.CodeAndComment, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.codegen.GeneratedClass, java.lang.Object>> cache ()  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Select(Ident(scala), TypeName("AnyRef")))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Select(Ident(scala), TypeName("AnyRef")))))
  public   CodeGenerator ()  { throw new RuntimeException(); }
  protected  java.lang.String genericMutableRowType ()  { throw new RuntimeException(); }
  /**
   * Generates a class for a given input expression.  Called when there is not cached code
   * already available.
   * @param in (undocumented)
   * @return (undocumented)
   */
  protected abstract  OutType create (InType in)  ;
  /**
   * Canonicalizes an input expression. Used to avoid double caching expressions that differ only
   * cosmetically.
   * @param in (undocumented)
   * @return (undocumented)
   */
  protected abstract  InType canonicalize (InType in)  ;
  /** Binds an input expression to a given input schema */
  protected abstract  InType bind (InType in, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  ;
  /** Generates the requested evaluator binding the given expression(s) to the inputSchema. */
  public  OutType generate (InType expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  /** Generates the requested evaluator given already bound expression(s). */
  public  OutType generate (InType expressions)  { throw new RuntimeException(); }
  /**
   * Create a new codegen context for expression evaluator, used to store those
   * expressions that don't support codegen
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext newCodeGenContext ()  { throw new RuntimeException(); }
}
