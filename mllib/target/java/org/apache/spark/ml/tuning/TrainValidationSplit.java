package org.apache.spark.ml.tuning;
/**
 * Validation for hyper-parameter tuning.
 * Randomly splits the input dataset into train and validation sets,
 * and uses evaluation metric on the validation set to select the best model.
 * Similar to {@link CrossValidator}, but only splits the set once.
 */
public  class TrainValidationSplit extends org.apache.spark.ml.Estimator<org.apache.spark.ml.tuning.TrainValidationSplitModel> implements org.apache.spark.ml.tuning.TrainValidationSplitParams, org.apache.spark.ml.param.shared.HasParallelism, org.apache.spark.ml.param.shared.HasCollectSubModels, org.apache.spark.ml.util.MLWritable, org.apache.spark.internal.Logging {
  static   class TrainValidationSplitWriter extends org.apache.spark.ml.util.MLWriter {
    public   TrainValidationSplitWriter (org.apache.spark.ml.tuning.TrainValidationSplit instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class TrainValidationSplitReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.TrainValidationSplit> {
    public   TrainValidationSplitReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.tuning.TrainValidationSplit load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.TrainValidationSplit> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tuning.TrainValidationSplit load (java.lang.String path)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<?>[] params ()  { throw new RuntimeException(); }
  static public  java.lang.String explainParam (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public  java.lang.String explainParams ()  { throw new RuntimeException(); }
  static public final  boolean isSet (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public final  boolean isDefined (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public  boolean hasParam (java.lang.String paramName)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.Object> getParam (java.lang.String paramName)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params set (java.lang.String param, Object value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.ParamPair<?> paramPair)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> scala.Option<T> get (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Params clear (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> T getOrDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> T $ (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> org.apache.spark.ml.param.Params setDefault (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params setDefault (scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> scala.Option<T> getDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> boolean hasDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends org.apache.spark.ml.param.Params> T defaultCopy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.ParamMap extractParamMap (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.ParamMap extractParamMap ()  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.ml.param.Params> T copyValues (T to, org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.ml.param.Params> org.apache.spark.ml.param.ParamMap copyValues$default$2 ()  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  static public final  long getSeed ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<org.apache.spark.ml.Estimator<?>> estimator ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.Estimator<?> getEstimator ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<org.apache.spark.ml.param.ParamMap[]> estimatorParamMaps ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.ParamMap[] getEstimatorParamMaps ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<org.apache.spark.ml.evaluation.Evaluator> evaluator ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.evaluation.Evaluator getEvaluator ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType transformSchemaImpl (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static protected  void logTuningParams (org.apache.spark.ml.util.Instrumentation<?> instrumentation)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.DoubleParam trainRatio ()  { throw new RuntimeException(); }
  static public  double getTrainRatio ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.IntParam parallelism ()  { throw new RuntimeException(); }
  static public  int getParallelism ()  { throw new RuntimeException(); }
  static   scala.concurrent.ExecutionContext getExecutionContext ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.BooleanParam collectSubModels ()  { throw new RuntimeException(); }
  static public final  boolean getCollectSubModels ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   TrainValidationSplit (java.lang.String uid)  { throw new RuntimeException(); }
  public   TrainValidationSplit ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setEstimator (org.apache.spark.ml.Estimator<?> value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setEstimatorParamMaps (org.apache.spark.ml.param.ParamMap[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setEvaluator (org.apache.spark.ml.evaluation.Evaluator value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setTrainRatio (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setSeed (long value)  { throw new RuntimeException(); }
  /**
   * Set the mamixum level of parallelism to evaluate models in parallel.
   * Default is 1 for serial evaluation
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setParallelism (int value)  { throw new RuntimeException(); }
  /**
   * Whether to collect submodels when fitting. If set, we can get submodels from
   * the returned model.
   * <p>
   * Note: If set this param, when you save the returned model, you can set an option
   * "persistSubModels" to be "true" before saving, in order to save these submodels.
   * You can check documents of
   * {@link org.apache.spark.ml.tuning.TrainValidationSplitModel.TrainValidationSplitModelWriter}
   * for more information.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tuning.TrainValidationSplit setCollectSubModels (boolean value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.TrainValidationSplitModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.TrainValidationSplit copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}