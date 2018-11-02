package org.apache.spark.status;
public  class LiveTask extends org.apache.spark.status.LiveEntity {
  public  org.apache.spark.scheduler.TaskInfo info ()  { throw new RuntimeException(); }
  // not preceding
  public   LiveTask (org.apache.spark.scheduler.TaskInfo info, int stageId, int stageAttemptId, scala.Option<java.lang.Object> lastUpdateTime)  { throw new RuntimeException(); }
  private  org.apache.spark.status.api.v1.TaskMetrics metrics ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> errorMessage ()  { throw new RuntimeException(); }
  /**
   * Update the metrics for the task and return the difference between the previous and new
   * values.
   * @param metrics (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.status.api.v1.TaskMetrics updateMetrics (org.apache.spark.executor.TaskMetrics metrics)  { throw new RuntimeException(); }
  protected  Object doUpdate ()  { throw new RuntimeException(); }
}
