package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param threshold. This trait may be changed or
 * removed between minor versions.
 */
public  interface HasThreshold extends org.apache.spark.ml.param.Params {
  /**
   * Param for threshold in binary classification prediction, in range [0, 1].
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam threshold ()  ;
  /** @group getParam */
  public  double getThreshold ()  ;
}
