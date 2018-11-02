package org.apache.spark.sql.execution.datasources.v2;
/**
 * Pushes down various operators to the underlying data source for better performance. Operators are
 * being pushed down with a specific order. As an example, given a LIMIT has a FILTER child, you
 * can't push down LIMIT if FILTER is not completely pushed down. When both are pushed down, the
 * data source should execute FILTER before LIMIT. And required columns are calculated at the end,
 * because when more operators are pushed down, we may need less columns at Spark side.
 */
public  class PushDownOperatorsToDataSource$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PushDownOperatorsToDataSource$ MODULE$ = null;
  public   PushDownOperatorsToDataSource$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan pushDownRequiredColumns (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.catalyst.expressions.AttributeSet requiredByParent)  { throw new RuntimeException(); }
}
