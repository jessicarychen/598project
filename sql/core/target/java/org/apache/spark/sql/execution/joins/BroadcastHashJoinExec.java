package org.apache.spark.sql.execution.joins;
/**
 * Performs an inner hash join of two child relations.  When the output RDD of this operator is
 * being constructed, a Spark job is asynchronously started to calculate the values for the
 * broadcast relation.  This data is then placed in a Spark broadcast variable.  The streamed
 * relation is not shuffled.
 */
public  class BroadcastHashJoinExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.BinaryExecNode, org.apache.spark.sql.execution.joins.HashJoin, org.apache.spark.sql.execution.CodegenSupport, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.Origin origin ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.trees.TreeNode<?>> containsChild ()  { throw new RuntimeException(); }
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  boolean fastEquals (org.apache.spark.sql.catalyst.trees.TreeNode<?> other)  { throw new RuntimeException(); }
  static public  scala.Option<BaseType> find (scala.Function1<BaseType, java.lang.Object> f)  { throw new RuntimeException(); }
  static public  void foreach (scala.Function1<BaseType, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void foreachUp (scala.Function1<BaseType, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> map (scala.Function1<BaseType, A> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> flatMap (scala.Function1<BaseType, scala.collection.TraversableOnce<A>> f)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Seq<B> collect (scala.PartialFunction<BaseType, B> pf)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<BaseType> collectLeaves ()  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.Option<B> collectFirst (scala.PartialFunction<BaseType, B> pf)  { throw new RuntimeException(); }
  static protected <B extends java.lang.Object> java.lang.Object mapProductIterator (scala.Function1<java.lang.Object, B> f, scala.reflect.ClassTag<B> evidence$1)  { throw new RuntimeException(); }
  static public  BaseType withNewChildren (scala.collection.Seq<BaseType> newChildren)  { throw new RuntimeException(); }
  static public  BaseType transform (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType transformDown (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType transformUp (scala.PartialFunction<BaseType, BaseType> rule)  { throw new RuntimeException(); }
  static public  BaseType mapChildren (scala.Function1<BaseType, BaseType> f)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<java.lang.Object> otherCopyArgs ()  { throw new RuntimeException(); }
  static public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  static public  java.lang.String argString ()  { throw new RuntimeException(); }
  static public  java.lang.String verboseStringWithSuffix ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString ()  { throw new RuntimeException(); }
  static public  java.lang.String treeString (boolean verbose, boolean addSuffix)  { throw new RuntimeException(); }
  static public  java.lang.String numberedTreeString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.trees.TreeNode<?> apply (int number)  { throw new RuntimeException(); }
  static public  BaseType p (int number)  { throw new RuntimeException(); }
  static public  scala.collection.mutable.StringBuilder generateTreeString (int depth, scala.collection.Seq<java.lang.Object> lastChildren, scala.collection.mutable.StringBuilder builder, boolean verbose, java.lang.String prefix, boolean addSuffix)  { throw new RuntimeException(); }
  static public  java.lang.String asCode ()  { throw new RuntimeException(); }
  static public  java.lang.String toJSON ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  static protected  scala.collection.immutable.List<scala.Tuple2<java.lang.String, org.json4s.JsonAST.JValue>> jsonFields ()  { throw new RuntimeException(); }
  static public  boolean treeString$default$2 ()  { throw new RuntimeException(); }
  static public  java.lang.String generateTreeString$default$5 ()  { throw new RuntimeException(); }
  static public  boolean generateTreeString$default$6 ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  static public abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  ;
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet outputSet ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet references ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet inputSet ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet missingInput ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressions (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressionsDown (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformExpressionsUp (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> mapExpressions (scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.QueryPlan<PlanType> transformAllExpressions (scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> rule)  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  static public  java.lang.String schemaString ()  { throw new RuntimeException(); }
  static public  void printSchema ()  { throw new RuntimeException(); }
  static protected  java.lang.String statePrefix ()  { throw new RuntimeException(); }
  static public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  static public  java.lang.String verboseString ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<PlanType> subqueries ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.QueryPlan<?>> innerChildren ()  { throw new RuntimeException(); }
  static protected  boolean isCanonicalizedPlan ()  { throw new RuntimeException(); }
  static public final  PlanType canonicalized ()  { throw new RuntimeException(); }
  static protected  PlanType doCanonicalize ()  { throw new RuntimeException(); }
  static public final  boolean sameResult (PlanType other)  { throw new RuntimeException(); }
  static public final  int semanticHash ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSeq allAttributes ()  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  static public  boolean subexpressionEliminationEnabled ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.SparkPlan makeCopy (java.lang.Object[] newArgs)  { throw new RuntimeException(); }
  static public  void resetMetrics ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.metric.SQLMetric longMetric (java.lang.String name)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder>> requiredChildOrdering ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> execute ()  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> org.apache.spark.broadcast.Broadcast<T> executeBroadcast ()  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> T executeQuery (scala.Function0<T> query)  { throw new RuntimeException(); }
  static protected  void prepareSubqueries ()  { throw new RuntimeException(); }
  static protected  void waitForSubqueries ()  { throw new RuntimeException(); }
  static public final  void prepare ()  { throw new RuntimeException(); }
  static protected  void doPrepare ()  { throw new RuntimeException(); }
  static protected <T extends java.lang.Object> org.apache.spark.broadcast.Broadcast<T> doExecuteBroadcast ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.InternalRow[] executeCollect ()  { throw new RuntimeException(); }
  static   scala.Tuple2<java.lang.Object, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> executeCollectIterator ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> executeToIterator ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Row[] executeCollectPublic ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.InternalRow[] executeTake (int n)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.MutableProjection newMutableProjection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema, boolean useSubexprElimination)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.codegen.Predicate newPredicate (org.apache.spark.sql.catalyst.expressions.Expression expression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  static protected  scala.math.Ordering<org.apache.spark.sql.catalyst.InternalRow> newOrdering (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> order, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  static protected  scala.math.Ordering<org.apache.spark.sql.catalyst.InternalRow> newNaturalAscendingOrdering (scala.collection.Seq<org.apache.spark.sql.types.DataType> dataTypes)  { throw new RuntimeException(); }
  static protected  boolean newMutableProjection$default$3 ()  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.SparkPlan buildPlan ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.SparkPlan streamedPlan ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> buildKeys ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> streamedKeys ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Projection buildSideKeyGenerator ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.UnsafeProjection streamSideKeyGenerator ()  { throw new RuntimeException(); }
  static protected  scala.Function1<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> createResultProjection ()  { throw new RuntimeException(); }
  static protected  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> join (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> streamedIter, org.apache.spark.sql.execution.joins.HashedRelation hashed, org.apache.spark.sql.execution.metric.SQLMetric numOutputRows, org.apache.spark.sql.execution.metric.SQLMetric avgHashProbe)  { throw new RuntimeException(); }
  static public  java.lang.String metricTerm (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String name)  { throw new RuntimeException(); }
  static public  boolean supportCodegen ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.CodegenSupport parent ()  { throw new RuntimeException(); }
  static protected  void parent_$eq (org.apache.spark.sql.execution.CodegenSupport x$1)  { throw new RuntimeException(); }
  static public final  java.lang.String produce (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.execution.CodegenSupport parent)  { throw new RuntimeException(); }
  static public final  java.lang.String consume (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> outputVars, java.lang.String row)  { throw new RuntimeException(); }
  static protected  java.lang.String evaluateVariables (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> variables)  { throw new RuntimeException(); }
  static protected  java.lang.String evaluateRequiredVariables (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> variables, org.apache.spark.sql.catalyst.expressions.AttributeSet required)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.AttributeSet usedInputs ()  { throw new RuntimeException(); }
  static public  boolean needStopCheck ()  { throw new RuntimeException(); }
  static public final  java.lang.String consume$default$3 ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.JoinType joinType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.joins.BuildSide buildSide ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan right ()  { throw new RuntimeException(); }
  // not preceding
  public   BroadcastHashJoinExec (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys, org.apache.spark.sql.catalyst.plans.JoinType joinType, org.apache.spark.sql.execution.joins.BuildSide buildSide, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition, org.apache.spark.sql.execution.SparkPlan left, org.apache.spark.sql.execution.SparkPlan right)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow>> inputRDDs ()  { throw new RuntimeException(); }
  private  boolean multipleOutputForOneInput ()  { throw new RuntimeException(); }
  public  boolean needCopyResult ()  { throw new RuntimeException(); }
  public  java.lang.String doProduce (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  public  java.lang.String doConsume (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode row)  { throw new RuntimeException(); }
  /**
   * Returns the codes used to add a task completion listener to update avg hash probe
   * at the end of the task.
   * @param avgHashProbe (undocumented)
   * @param relationTerm (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String genTaskListener (java.lang.String avgHashProbe, java.lang.String relationTerm)  { throw new RuntimeException(); }
  /**
   * Returns a tuple of Broadcast of HashedRelation and the variable name for it.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<org.apache.spark.broadcast.Broadcast<org.apache.spark.sql.execution.joins.HashedRelation>, java.lang.String> prepareBroadcast (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  /**
   * Returns the code for generating join key for stream side, and expression of whether the key
   * has any null in it or not.
   * @param ctx (undocumented)
   * @param input (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode, java.lang.String> genStreamSideJoinKey (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input)  { throw new RuntimeException(); }
  /**
   * Generates the code for variable of build side.
   * @param ctx (undocumented)
   * @param matched (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> genBuildSideVars (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String matched)  { throw new RuntimeException(); }
  /**
   * Generate the (non-equi) condition used to filter joined rows. This is used in Inner, Left Semi
   * and Left Anti joins.
   * @param ctx (undocumented)
   * @param input (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple3<java.lang.String, java.lang.String, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode>> getJoinCondition (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input)  { throw new RuntimeException(); }
  /**
   * Generates the code for Inner join.
   * @param ctx (undocumented)
   * @param input (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String codegenInner (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input)  { throw new RuntimeException(); }
  /**
   * Generates the code for left or right outer join.
   * @param ctx (undocumented)
   * @param input (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String codegenOuter (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input)  { throw new RuntimeException(); }
  /**
   * Generates the code for left semi join.
   * @param ctx (undocumented)
   * @param input (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String codegenSemi (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input)  { throw new RuntimeException(); }
  /**
   * Generates the code for anti join.
   * @param ctx (undocumented)
   * @param input (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String codegenAnti (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input)  { throw new RuntimeException(); }
  /**
   * Generates the code for existence join.
   * @param ctx (undocumented)
   * @param input (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String codegenExistence (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> input)  { throw new RuntimeException(); }
}