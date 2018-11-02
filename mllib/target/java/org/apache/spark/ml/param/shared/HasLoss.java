package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param loss. This trait may be changed or
 * removed between minor versions.
 */
public  interface HasLoss extends org.apache.spark.ml.param.Params {
  /**
   * Param for the loss function to be optimized.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> loss ()  ;
  /** @group getParam */
  public  java.lang.String getLoss ()  ;
}
