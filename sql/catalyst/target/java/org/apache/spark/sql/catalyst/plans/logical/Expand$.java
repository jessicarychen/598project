package org.apache.spark.sql.catalyst.plans.logical;
public  class Expand$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Expand$ MODULE$ = null;
  public   Expand$ ()  { throw new RuntimeException(); }
  /**
   * Build bit mask from attributes of selected grouping set. A bit in the bitmask is corresponding
   * to an attribute in group by attributes sequence, the selected attribute has corresponding bit
   * set to 0 and otherwise set to 1. For example, if we have GroupBy attributes (a, b, c, d), the
   * bitmask 5(whose binary form is 0101) represents grouping set (a, c).
   * <p>
   * @param groupingSetAttrs The attributes of selected grouping set
   * @param attrMap Mapping group by attributes to its index in attributes sequence
   * @return The bitmask which represents the selected attributes out of group by attributes.
   */
  private  int buildBitmask (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingSetAttrs, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Attribute, java.lang.Object> attrMap)  { throw new RuntimeException(); }
  /**
   * Apply the all of the GroupExpressions to every input row, hence we will get
   * multiple output rows for an input row.
   * <p>
   * @param groupingSetsAttrs The attributes of grouping sets
   * @param groupByAliases The aliased original group by expressions
   * @param groupByAttrs The attributes of aliased group by expressions
   * @param gid Attribute of the grouping id
   * @param child Child operator
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.Expand apply (scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>> groupingSetsAttrs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias> groupByAliases, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupByAttrs, org.apache.spark.sql.catalyst.expressions.Attribute gid, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
}