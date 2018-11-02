package org.apache.spark.ml.optim.aggregator;
/**
 * A parent trait for aggregators used in fitting MLlib models. This parent trait implements
 * some of the common code shared between concrete instances of aggregators. Subclasses of this
 * aggregator need only implement the <code>add</code> method.
 * <p>
 * @tparam Datum The type of the instances added to the aggregator to update the loss and gradient.
 * @tparam Agg Specialization of {@link DifferentiableLossAggregator}. Classes that subclass this
 *             type need to use this parameter to specify the concrete type of the aggregator.
 */
  interface DifferentiableLossAggregator<Datum extends java.lang.Object, Agg extends org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<Datum, Agg>> extends scala.Serializable {
  public  double weightSum ()  ;
  public  double lossSum ()  ;
  /** The dimension of the gradient array. */
  public  int dim ()  ;
  /** Array of gradient values that are mutated when new instances are added to the aggregator. */
  public  double[] gradientSumArray ()  ;
  /** Add a single data point to this aggregator. */
  public  Agg add (Datum instance)  ;
  /** Merge two aggregators. The `this` object will be modified in place and returned. */
  public  Agg merge (Agg other)  ;
  /** The current weighted averaged gradient. */
  public  org.apache.spark.ml.linalg.Vector gradient ()  ;
  /** Weighted count of instances in this aggregator. */
  public  double weight ()  ;
  /** The current loss value of this aggregator. */
  public  double loss ()  ;
}
