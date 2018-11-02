package org.apache.spark.ml.ann;
/**
 * Trait for ANN topology model
 */
  interface TopologyModel extends scala.Serializable {
  public  org.apache.spark.ml.linalg.Vector weights ()  ;
  /**
   * Array of layers
   * @return (undocumented)
   */
  public  org.apache.spark.ml.ann.Layer[] layers ()  ;
  /**
   * Array of layer models
   * @return (undocumented)
   */
  public  org.apache.spark.ml.ann.LayerModel[] layerModels ()  ;
  /**
   * Forward propagation
   * <p>
   * @param data input data
   * @param includeLastLayer Include the last layer in the output. In
   *                         MultilayerPerceptronClassifier, the last layer is always softmax;
   *                         the last layer of outputs is needed for class predictions, but not
   *                         for rawPrediction.
   * <p>
   * @return array of outputs for each of the layers
   */
  public  breeze.linalg.DenseMatrix<java.lang.Object>[] forward (breeze.linalg.DenseMatrix<java.lang.Object> data, boolean includeLastLayer)  ;
  /**
   * Prediction of the model. See {@link ProbabilisticClassificationModel}
   * <p>
   * @param features input features
   * @return prediction
   */
  public  org.apache.spark.ml.linalg.Vector predict (org.apache.spark.ml.linalg.Vector features)  ;
  /**
   * Raw prediction of the model. See {@link ProbabilisticClassificationModel}
   * <p>
   * @param features input features
   * @return raw prediction
   * <p>
   * Note: This interface is only used for classification Model.
   */
  public  org.apache.spark.ml.linalg.Vector predictRaw (org.apache.spark.ml.linalg.Vector features)  ;
  /**
   * Probability of the model. See {@link ProbabilisticClassificationModel}
   * <p>
   * @param rawPrediction raw prediction vector
   * @return probability
   * <p>
   * Note: This interface is only used for classification Model.
   */
  public  org.apache.spark.ml.linalg.Vector raw2ProbabilityInPlace (org.apache.spark.ml.linalg.Vector rawPrediction)  ;
  /**
   * Computes gradient for the network
   * <p>
   * @param data input data
   * @param target target output
   * @param cumGradient cumulative gradient
   * @param blockSize block size
   * @return error
   */
  public  double computeGradient (breeze.linalg.DenseMatrix<java.lang.Object> data, breeze.linalg.DenseMatrix<java.lang.Object> target, org.apache.spark.ml.linalg.Vector cumGradient, int blockSize)  ;
}
