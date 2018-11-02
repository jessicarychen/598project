package org.apache.spark.sql.execution.streaming;
/** An operator that writes to a StateStore. */
public  interface StateStoreWriter extends org.apache.spark.sql.execution.streaming.StatefulOperator {
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  ;
  /**
   * Get the progress made by this stateful operator after execution. This should be called in
   * the driver after this SparkPlan has been executed and metrics have been updated.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.StateOperatorProgress getProgress ()  ;
  /** Records the duration of running `body` for the next query progress update. */
  public  long timeTakenMs (scala.Function0<scala.runtime.BoxedUnit> body)  ;
  /**
   * Set the SQL metrics related to the state store.
   * This should be called in that task after the store has been updated.
   * @param store (undocumented)
   */
  public  void setStoreMetrics (org.apache.spark.sql.execution.streaming.state.StateStore store)  ;
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> stateStoreCustomMetrics ()  ;
}
