package org.apache.spark.sql.catalyst.rules;
public abstract class RuleExecutor<TreeType extends org.apache.spark.sql.catalyst.trees.TreeNode<?>> implements org.apache.spark.internal.Logging {
  /** A strategy that only runs once. */
  public  class Once$ extends org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Strategy implements scala.Product, scala.Serializable {
    public   Once$ ()  { throw new RuntimeException(); }
    public  int maxIterations ()  { throw new RuntimeException(); }
  }
  /** A strategy that runs until fix point or maxIterations times, whichever comes first. */
  public  class FixedPoint extends org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Strategy implements scala.Product, scala.Serializable {
    public  int maxIterations ()  { throw new RuntimeException(); }
    // not preceding
    public   FixedPoint (int maxIterations)  { throw new RuntimeException(); }
  }
  public  class FixedPoint$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.FixedPoint> implements scala.Serializable {
    public   FixedPoint$ ()  { throw new RuntimeException(); }
  }
  /** A batch of rules. */
  protected  class Batch implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Strategy strategy ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<TreeType>> rules ()  { throw new RuntimeException(); }
    // not preceding
    public   Batch (java.lang.String name, org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Strategy strategy, scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<TreeType>> rules)  { throw new RuntimeException(); }
  }
  protected  class Batch$ extends scala.runtime.AbstractFunction3<java.lang.String, org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Strategy, scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<TreeType>>, org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Batch> implements scala.Serializable {
    public   Batch$ ()  { throw new RuntimeException(); }
  }
  /**
   * An execution strategy for rules that indicates the maximum number of executions. If the
   * execution reaches fix point (i.e. converge) before maxIterations, it will stop.
   */
  public abstract class Strategy {
    public   Strategy ()  { throw new RuntimeException(); }
    public abstract  int maxIterations ()  ;
  }
  static protected  org.apache.spark.sql.catalyst.rules.QueryExecutionMetering queryExecutionMeter ()  { throw new RuntimeException(); }
  /** Dump statistics about time spent running specific rules. */
  static public  java.lang.String dumpTimeSpent ()  { throw new RuntimeException(); }
  /** Resets statistics about time spent running specific rules */
  static public  void resetMetrics ()  { throw new RuntimeException(); }
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
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(ExistentialTypeTree(AppliedTypeTree(Select(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.sql), org.apache.spark.sql.catalyst), org.apache.spark.sql.catalyst.trees), org.apache.spark.sql.catalyst.trees.TreeNode), List(TypeTree().setOriginal(Ident(TypeName("_$1"))))), List(TypeDef(Modifiers(DEFERRED | SYNTHETIC), TypeName("_$1"), List(), TypeBoundsTree(EmptyTree, EmptyTree)))))))
  public   RuleExecutor ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Once$ Once ()  { throw new RuntimeException(); }
  /** Defines a sequence of rule batches, to be overridden by the implementation. */
  protected abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Batch> batches ()  ;
  /**
   * Defines a check function that checks for structural integrity of the plan after the execution
   * of each rule. For example, we can check whether a plan is still resolved after each rule in
   * <code>Optimizer</code>, so we can catch rules that return invalid plans. The check function returns
   * <code>false</code> if the given plan doesn't pass the structural integrity check.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  protected  boolean isPlanIntegral (TreeType plan)  { throw new RuntimeException(); }
  /**
   * Executes the batches of rules defined by the subclass. The batches are executed serially
   * using the defined execution strategy. Within each batch, rules are also executed serially.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  TreeType execute (TreeType plan)  { throw new RuntimeException(); }
}
