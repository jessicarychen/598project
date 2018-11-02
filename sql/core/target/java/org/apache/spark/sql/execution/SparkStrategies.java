package org.apache.spark.sql.execution;
public abstract class SparkStrategies extends org.apache.spark.sql.catalyst.planning.QueryPlanner<org.apache.spark.sql.execution.SparkPlan> {
  public   SparkStrategies ()  { throw new RuntimeException(); }
  /**
   * Plans special cases of limit operators.
   */
  public  class SpecialLimits extends org.apache.spark.sql.execution.SparkStrategy {
    public   SpecialLimits ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.SpecialLimits$ SpecialLimits ()  { throw new RuntimeException(); }
  /**
   * Select the proper physical plan for join based on joining keys and size of logical plan.
   * <p>
   * At first, uses the {@link ExtractEquiJoinKeys} pattern to find joins where at least some of the
   * predicates can be evaluated by matching join keys. If found, join implementations are chosen
   * with the following precedence:
   * <p>
   * - Broadcast hash join (BHJ):
   *     BHJ is not supported for full outer join. For right outer join, we only can broadcast the
   *     left side. For left outer, left semi, left anti and the internal join type ExistenceJoin,
   *     we only can broadcast the right side. For inner like join, we can broadcast both sides.
   *     Normally, BHJ can perform faster than the other join algorithms when the broadcast side is
   *     small. However, broadcasting tables is a network-intensive operation. It could cause OOM
   *     or perform worse than the other join algorithms, especially when the build/broadcast side
   *     is big.
   * <p>
   *     For the supported cases, users can specify the broadcast hint (e.g. the user applied the
   *     {@link org.apache.spark.sql.functions.broadcast()} function to a DataFrame) and session-based
   *     {@link SQLConf.AUTO_BROADCASTJOIN_THRESHOLD} threshold to adjust whether BHJ is used and
   *     which join side is broadcast.
   * <p>
   *     1) Broadcast the join side with the broadcast hint, even if the size is larger than
   *     {@link SQLConf.AUTO_BROADCASTJOIN_THRESHOLD}. If both sides have the hint (only when the type
   *     is inner like join), the side with a smaller estimated physical size will be broadcast.
   *     2) Respect the {@link SQLConf.AUTO_BROADCASTJOIN_THRESHOLD} threshold and broadcast the side
   *     whose estimated physical size is smaller than the threshold. If both sides are below the
   *     threshold, broadcast the smaller side. If neither is smaller, BHJ is not used.
   * <p>
   * - Shuffle hash join: if the average size of a single partition is small enough to build a hash
   *     table.
   * <p>
   * - Sort merge: if the matching join keys are sortable.
   * <p>
   * If there is no joining keys, Join implementations are chosen with the following precedence:
   * - BroadcastNestedLoopJoin (BNLJ):
   *     BNLJ supports all the join types but the impl is OPTIMIZED for the following scenarios:
   *     For right outer join, the left side is broadcast. For left outer, left semi, left anti
   *     and the internal join type ExistenceJoin, the right side is broadcast. For inner like
   *     joins, either side is broadcast.
   * <p>
   *     Like BHJ, users still can specify the broadcast hint and session-based
   *     {@link SQLConf.AUTO_BROADCASTJOIN_THRESHOLD} threshold to impact which side is broadcast.
   * <p>
   *     1) Broadcast the join side with the broadcast hint, even if the size is larger than
   *     {@link SQLConf.AUTO_BROADCASTJOIN_THRESHOLD}. If both sides have the hint (i.e., just for
   *     inner-like join), the side with a smaller estimated physical size will be broadcast.
   *     2) Respect the {@link SQLConf.AUTO_BROADCASTJOIN_THRESHOLD} threshold and broadcast the side
   *     whose estimated physical size is smaller than the threshold. If both sides are below the
   *     threshold, broadcast the smaller side. If neither is smaller, BNLJ is not used.
   * <p>
   * - CartesianProduct: for inner like join, CartesianProduct is the fallback option.
   * <p>
   * - BroadcastNestedLoopJoin (BNLJ):
   *     For the other join types, BNLJ is the fallback option. Here, we just pick the broadcast
   *     side with the broadcast hint. If neither side has a hint, we broadcast the side with
   *     the smaller estimated physical size.
   */
  public  class JoinSelection extends org.apache.spark.sql.execution.SparkStrategy implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
    public   JoinSelection ()  { throw new RuntimeException(); }
    /**
     * Matches a plan whose output should be small enough to be used in broadcast join.
     * @param plan (undocumented)
     * @return (undocumented)
     */
    private  boolean canBroadcast (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * Matches a plan whose single partition should be small enough to build a hash table.
     * <p>
     * Note: this assume that the number of partition is fixed, requires additional work if it's
     * dynamic.
     * @param plan (undocumented)
     * @return (undocumented)
     */
    private  boolean canBuildLocalHashMap (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * Returns whether plan a is much smaller (3X) than plan b.
     * <p>
     * The cost to build hash map is higher than sorting, we should only build hash map on a table
     * that is much smaller than other one. Since we does not have the statistic for number of rows,
     * use the size of bytes here as estimation.
     * @param a (undocumented)
     * @param b (undocumented)
     * @return (undocumented)
     */
    private  boolean muchSmaller (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan a, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan b)  { throw new RuntimeException(); }
    private  boolean canBuildRight (org.apache.spark.sql.catalyst.plans.JoinType joinType)  { throw new RuntimeException(); }
    private  boolean canBuildLeft (org.apache.spark.sql.catalyst.plans.JoinType joinType)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.execution.joins.BuildSide broadcastSide (boolean canBuildLeft, boolean canBuildRight, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
    private  boolean canBroadcastByHints (org.apache.spark.sql.catalyst.plans.JoinType joinType, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.execution.joins.BuildSide broadcastSideByHints (org.apache.spark.sql.catalyst.plans.JoinType joinType, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
    private  boolean canBroadcastBySizes (org.apache.spark.sql.catalyst.plans.JoinType joinType, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.execution.joins.BuildSide broadcastSideBySizes (org.apache.spark.sql.catalyst.plans.JoinType joinType, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.JoinSelection$ JoinSelection ()  { throw new RuntimeException(); }
  /**
   * Used to plan streaming aggregation queries that are computed incrementally as part of a
   * {@link StreamingQuery}. Currently this rule is injected into the planner
   * on-demand, only when planning in a {@link org.apache.spark.sql.execution.streaming.StreamExecution}
   */
  public  class StatefulAggregationStrategy extends org.apache.spark.sql.execution.SparkStrategy {
    public   StatefulAggregationStrategy ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.StatefulAggregationStrategy$ StatefulAggregationStrategy ()  { throw new RuntimeException(); }
  /**
   * Used to plan the streaming deduplicate operator.
   */
  public  class StreamingDeduplicationStrategy extends org.apache.spark.sql.execution.SparkStrategy {
    public   StreamingDeduplicationStrategy ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.StreamingDeduplicationStrategy$ StreamingDeduplicationStrategy ()  { throw new RuntimeException(); }
  public  class StreamingJoinStrategy extends org.apache.spark.sql.execution.SparkStrategy {
    public   StreamingJoinStrategy ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.StreamingJoinStrategy$ StreamingJoinStrategy ()  { throw new RuntimeException(); }
  /**
   * Used to plan the aggregate operator for expressions based on the AggregateFunction2 interface.
   */
  public  class Aggregation extends org.apache.spark.sql.execution.SparkStrategy {
    public   Aggregation ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.Aggregation$ Aggregation ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> singleRowRdd ()  { throw new RuntimeException(); }
  public  class InMemoryScans extends org.apache.spark.sql.execution.SparkStrategy {
    public   InMemoryScans ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.InMemoryScans$ InMemoryScans ()  { throw new RuntimeException(); }
  /**
   * This strategy is just for explaining <code>Dataset/DataFrame</code> created by <code>spark.readStream</code>.
   * It won't affect the execution, because <code>StreamingRelation</code> will be replaced with
   * <code>StreamingExecutionRelation</code> in <code>StreamingQueryManager</code> and <code>StreamingExecutionRelation</code> will
   * be replaced with the real relation using the <code>Source</code> in <code>StreamExecution</code>.
   */
  public  class StreamingRelationStrategy extends org.apache.spark.sql.execution.SparkStrategy {
    public   StreamingRelationStrategy ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.StreamingRelationStrategy$ StreamingRelationStrategy ()  { throw new RuntimeException(); }
  /**
   * Strategy to convert {@link FlatMapGroupsWithState} logical operator to physical operator
   * in streaming plans. Conversion for batch plans is handled by {@link BasicOperators}.
   */
  public  class FlatMapGroupsWithStateStrategy extends org.apache.spark.sql.execution.SparkStrategy {
    public   FlatMapGroupsWithStateStrategy ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.FlatMapGroupsWithStateStrategy$ FlatMapGroupsWithStateStrategy ()  { throw new RuntimeException(); }
  public  class BasicOperators extends org.apache.spark.sql.execution.SparkStrategy {
    public   BasicOperators ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.BasicOperators$ BasicOperators ()  { throw new RuntimeException(); }
}
