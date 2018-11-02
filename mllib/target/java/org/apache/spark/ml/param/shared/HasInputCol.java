package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param inputCol. This trait may be changed or
 * removed between minor versions.
 */
public  interface HasInputCol extends org.apache.spark.ml.param.Params {
  /**
   * Param for input column name.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  ;
  /** @group getParam */
  public  java.lang.String getInputCol ()  ;
}
