package org.apache.spark.deploy.history;
/**
 * Cache for application UIs.
 * <p>
 * Applications are cached for as long as there is capacity for them. See {@link LoadedAppUI} for a
 * discussion of the UI lifecycle.
 * <p>
 * param:  operations implementation of record access operations
 * param:  retainedApplications number of retained applications
 * param:  clock time source
 */
  class ApplicationCache implements org.apache.spark.internal.Logging {
  public  org.apache.spark.deploy.history.ApplicationCacheOperations operations ()  { throw new RuntimeException(); }
  public  int retainedApplications ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  // not preceding
  public   ApplicationCache (org.apache.spark.deploy.history.ApplicationCacheOperations operations, int retainedApplications, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  private  com.google.common.cache.CacheLoader<org.apache.spark.deploy.history.CacheKey, org.apache.spark.deploy.history.CacheEntry> appLoader ()  { throw new RuntimeException(); }
  /** the cache key doesn't match a cached entry, or the entry is out-of-date, so load it. */
  private  java.lang.Object removalListener ()  { throw new RuntimeException(); }
  /**
   * Removal event notifies the provider to detach the UI.
   * @param rm removal notification
   * @return (undocumented)
   */
  private  com.google.common.cache.LoadingCache<org.apache.spark.deploy.history.CacheKey, org.apache.spark.deploy.history.CacheEntry> appCache ()  { throw new RuntimeException(); }
  /**
   * The metrics which are updated as the cache is used.
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.history.CacheMetrics metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.history.CacheEntry get (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  /**
   * Run a closure while holding an application's UI read lock. This prevents the history server
   * from closing the UI data store while it's being used.
   * @param appId (undocumented)
   * @param attemptId (undocumented)
   * @param fn (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, scala.Function1<org.apache.spark.ui.SparkUI, T> fn)  { throw new RuntimeException(); }
  /** @return Number of cached UIs. */
  public  long size ()  { throw new RuntimeException(); }
  private <T extends java.lang.Object> T time (com.codahale.metrics.Timer t, scala.Function0<T> f)  { throw new RuntimeException(); }
  /**
   * Load the Spark UI via {@link ApplicationCacheOperations.getAppUI()},
   * then attach it to the web UI via {@link ApplicationCacheOperations.attachSparkUI()}.
   * <p>
   * If the application is incomplete, it has the {@link ApplicationCacheCheckFilter}
   * added as a filter to the HTTP requests, so that queries on the UI will trigger
   * update checks.
   * <p>
   * The generated entry contains the UI and the current timestamp.
   * The timer {@link metrics.loadTimer} tracks the time taken to load the UI.
   * <p>
   * @param appId application ID
   * @param attemptId optional attempt ID
   * @return the cache entry
   * @throws NoSuchElementException if there is no matching element
   */
  private  org.apache.spark.deploy.history.CacheEntry loadApplicationEntry (java.lang.String appId, scala.Option<java.lang.String> attemptId) throws java.util.NoSuchElementException { throw new RuntimeException(); }
  /**
   * String operator dumps the cache entries and metrics.
   * @return a string value, primarily for testing and diagnostics
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Register a filter for the web UI which checks for updates to the given app/attempt
   * @param ui Spark UI to attach filters to
   * @param appId application ID
   * @param attemptId attempt ID
   * @param key (undocumented)
   * @param loadedUI (undocumented)
   */
  private  void registerFilter (org.apache.spark.deploy.history.CacheKey key, org.apache.spark.deploy.history.LoadedAppUI loadedUI)  { throw new RuntimeException(); }
  public  void invalidate (org.apache.spark.deploy.history.CacheKey key)  { throw new RuntimeException(); }
}