package org.apache.spark.status.api.v1;
public  class ExecutorStageSummary {
  public  long taskTime ()  { throw new RuntimeException(); }
  public  int failedTasks ()  { throw new RuntimeException(); }
  public  int succeededTasks ()  { throw new RuntimeException(); }
  public  int killedTasks ()  { throw new RuntimeException(); }
  public  long inputBytes ()  { throw new RuntimeException(); }
  public  long inputRecords ()  { throw new RuntimeException(); }
  public  long outputBytes ()  { throw new RuntimeException(); }
  public  long outputRecords ()  { throw new RuntimeException(); }
  public  long shuffleRead ()  { throw new RuntimeException(); }
  public  long shuffleReadRecords ()  { throw new RuntimeException(); }
  public  long shuffleWrite ()  { throw new RuntimeException(); }
  public  long shuffleWriteRecords ()  { throw new RuntimeException(); }
  public  long memoryBytesSpilled ()  { throw new RuntimeException(); }
  public  long diskBytesSpilled ()  { throw new RuntimeException(); }
  // not preceding
     ExecutorStageSummary (long taskTime, int failedTasks, int succeededTasks, int killedTasks, long inputBytes, long inputRecords, long outputBytes, long outputRecords, long shuffleRead, long shuffleReadRecords, long shuffleWrite, long shuffleWriteRecords, long memoryBytesSpilled, long diskBytesSpilled)  { throw new RuntimeException(); }
}
