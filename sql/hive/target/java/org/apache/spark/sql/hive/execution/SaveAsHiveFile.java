package org.apache.spark.sql.hive.execution;
  interface SaveAsHiveFile extends org.apache.spark.sql.execution.command.DataWritingCommand {
  public  scala.Option<org.apache.hadoop.fs.Path> createdTempDir ()  ;
  public  scala.collection.immutable.Set<java.lang.String> saveAsHiveFile (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.SparkPlan plan, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.sql.hive.HiveShim.ShimFileSinkDesc fileSinkConf, java.lang.String outputLocation, scala.collection.immutable.Map<scala.collection.immutable.Map<java.lang.String, java.lang.String>, java.lang.String> customPartitionLocations, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> partitionAttributes)  ;
  public  org.apache.hadoop.fs.Path getExternalTmpPath (org.apache.spark.sql.SparkSession sparkSession, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.hadoop.fs.Path path)  ;
  public  void deleteExternalTmpPath (org.apache.hadoop.conf.Configuration hadoopConf)  ;
  public  org.apache.hadoop.fs.Path oldVersionExternalTempPath (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf, java.lang.String scratchDir)  ;
  public  org.apache.hadoop.fs.Path newVersionExternalTempPath (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf, java.lang.String stagingDir)  ;
  public  org.apache.hadoop.fs.Path getExtTmpPathRelTo (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf, java.lang.String stagingDir)  ;
  public  org.apache.hadoop.fs.Path getExternalScratchDir (java.net.URI extURI, org.apache.hadoop.conf.Configuration hadoopConf, java.lang.String stagingDir)  ;
  public  org.apache.hadoop.fs.Path getStagingDir (org.apache.hadoop.fs.Path inputPath, org.apache.hadoop.conf.Configuration hadoopConf, java.lang.String stagingDir)  ;
  public  java.lang.String executionId ()  ;
}
