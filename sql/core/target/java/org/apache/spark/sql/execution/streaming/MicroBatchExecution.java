package org.apache.spark.sql.execution.streaming;
public  class MicroBatchExecution extends org.apache.spark.sql.execution.streaming.StreamExecution {
  // not preceding
  public   MicroBatchExecution (org.apache.spark.sql.SparkSession sparkSession, java.lang.String name, java.lang.String checkpointRoot, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan analyzedPlan, org.apache.spark.sql.execution.streaming.BaseStreamingSink sink, org.apache.spark.sql.streaming.Trigger trigger, org.apache.spark.util.Clock triggerClock, org.apache.spark.sql.streaming.OutputMode outputMode, scala.collection.immutable.Map<java.lang.String, java.lang.String> extraOptions, boolean deleteCheckpointOnStop)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.execution.streaming.BaseStreamingSource> sources ()  { throw new RuntimeException(); }
  private  scala.Product triggerExecutor ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan ()  { throw new RuntimeException(); }
  /**
   * Repeatedly attempts to run batches as data arrives.
   * @param sparkSessionForStream (undocumented)
   */
  protected  void runActivatedStream (org.apache.spark.sql.SparkSession sparkSessionForStream)  { throw new RuntimeException(); }
  /**
   * Populate the start offsets to start the execution at the current offsets stored in the sink
   * (i.e. avoid reprocessing data that we have already processed). This function must be called
   * before any processing occurs and will populate the following fields:
   *  - currentBatchId
   *  - committedOffsets
   *  - availableOffsets
   *  The basic structure of this method is as follows:
   * <p>
   *  Identify (from the offset log) the offsets used to run the last batch
   *  IF last batch exists THEN
   *    Set the next batch to be executed as the last recovered batch
   *    Check the commit log to see which batch was committed last
   *    IF the last batch was committed THEN
   *      Call getBatch using the last batch start and end offsets
   *      // ^^^^ above line is needed since some sources assume last batch always re-executes
   *      Setup for a new batch i.e., start = last batch end, and identify new end
   *    DONE
   *  ELSE
   *    Identify a brand new batch
   *  DONE
   * @param sparkSessionToRunBatches (undocumented)
   */
  private  void populateStartOffsets (org.apache.spark.sql.SparkSession sparkSessionToRunBatches)  { throw new RuntimeException(); }
  /**
   * Returns true if there is any new data available to be processed.
   * @return (undocumented)
   */
  private  boolean dataAvailable ()  { throw new RuntimeException(); }
  /**
   * Queries all of the sources to see if any new data is available. When there is new data the
   * batchId counter is incremented and a new log entry is written with the newest offsets.
   */
  private  void constructNextBatch ()  { throw new RuntimeException(); }
  /**
   * Processes any data available between <code>availableOffsets</code> and <code>committedOffsets</code>.
   * @param sparkSessionToRunBatch Isolated {@link SparkSession} to run this batch with.
   */
  private  void runBatch (org.apache.spark.sql.SparkSession sparkSessionToRunBatch)  { throw new RuntimeException(); }
  private  java.util.Optional<org.apache.spark.sql.sources.v2.reader.streaming.Offset> toJava (scala.Option<org.apache.spark.sql.sources.v2.reader.streaming.Offset> scalaOption)  { throw new RuntimeException(); }
}
