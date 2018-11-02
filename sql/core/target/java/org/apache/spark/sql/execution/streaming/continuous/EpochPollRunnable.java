package org.apache.spark.sql.execution.streaming.continuous;
public  class EpochPollRunnable extends java.lang.Thread implements org.apache.spark.internal.Logging {
  public   EpochPollRunnable (java.util.concurrent.BlockingQueue<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.sources.v2.reader.streaming.PartitionOffset>> queue, org.apache.spark.TaskContext context, java.util.concurrent.atomic.AtomicBoolean failedFlag)  { throw new RuntimeException(); }
    java.lang.Throwable failureReason ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef epochEndpoint ()  { throw new RuntimeException(); }
  private  long currentEpoch ()  { throw new RuntimeException(); }
  public  void run ()  { throw new RuntimeException(); }
}
