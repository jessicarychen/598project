package org.apache.spark.ui.jobs;
/** Table showing list of pools */
  class PoolTable {
  public   PoolTable (scala.collection.immutable.Map<org.apache.spark.scheduler.Schedulable, org.apache.spark.status.PoolData> pools, org.apache.spark.ui.jobs.StagesTab parent)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> toNodeSeq ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> poolRow (org.apache.spark.scheduler.Schedulable s, org.apache.spark.status.PoolData p)  { throw new RuntimeException(); }
}
