package org.apache.spark.storage;
/**
 * :: DeveloperApi ::
 * Storage information for each BlockManager.
 * <p>
 * This class assumes BlockId and BlockStatus are immutable, such that the consumers of this
 * class cannot mutate the source of the information. Accesses are not thread-safe.
 *
 * @deprecated This class may be removed or made private in a future release. Since 2.2.0. 
*/
public  class StorageStatus {
  public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
  public  long maxMemory ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxOnHeapMem ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxOffHeapMem ()  { throw new RuntimeException(); }
  // not preceding
  public   StorageStatus (org.apache.spark.storage.BlockManagerId blockManagerId, long maxMemory, scala.Option<java.lang.Object> maxOnHeapMem, scala.Option<java.lang.Object> maxOffHeapMem)  { throw new RuntimeException(); }
  /**
   * Internal representation of the blocks stored in this block manager.
   * <p>
   * We store RDD blocks and non-RDD blocks separately to allow quick retrievals of RDD blocks.
   * These collections should only be mutated through the add/update/removeBlock methods.
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<java.lang.Object, scala.collection.mutable.Map<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> _rddBlocks ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> _nonRddBlocks ()  { throw new RuntimeException(); }
  private  class RddStorageInfo implements scala.Product, scala.Serializable {
    public  long memoryUsage ()  { throw new RuntimeException(); }
    public  long diskUsage ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.StorageLevel level ()  { throw new RuntimeException(); }
    // not preceding
    public   RddStorageInfo (long memoryUsage, long diskUsage, org.apache.spark.storage.StorageLevel level)  { throw new RuntimeException(); }
  }
  private  class RddStorageInfo extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, org.apache.spark.storage.StorageLevel, org.apache.spark.storage.StorageStatus.RddStorageInfo> implements scala.Serializable {
    public   RddStorageInfo ()  { throw new RuntimeException(); }
  }
  private  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.storage.StorageStatus.RddStorageInfo> _rddStorageInfo ()  { throw new RuntimeException(); }
  private  class NonRddStorageInfo implements scala.Product, scala.Serializable {
    public  long onHeapUsage ()  { throw new RuntimeException(); }
    public  long offHeapUsage ()  { throw new RuntimeException(); }
    public  long diskUsage ()  { throw new RuntimeException(); }
    // not preceding
    public   NonRddStorageInfo (long onHeapUsage, long offHeapUsage, long diskUsage)  { throw new RuntimeException(); }
  }
  private  class NonRddStorageInfo extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.storage.StorageStatus.NonRddStorageInfo> implements scala.Serializable {
    public   NonRddStorageInfo ()  { throw new RuntimeException(); }
  }
  private  org.apache.spark.storage.StorageStatus.NonRddStorageInfo _nonRddStorageInfo ()  { throw new RuntimeException(); }
  /** Create a storage status with an initial set of blocks, leaving the source unmodified. */
  public   StorageStatus (org.apache.spark.storage.BlockManagerId bmid, long maxMemory, scala.Option<java.lang.Object> maxOnHeapMem, scala.Option<java.lang.Object> maxOffHeapMem, scala.collection.Map<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> initialBlocks)  { throw new RuntimeException(); }
  /**
   * Return the blocks stored in this block manager.
   * <p>
   * @note This is somewhat expensive, as it involves cloning the underlying maps and then
   * concatenating them together. Much faster alternatives exist for common operations such as
   * contains, get, and size.
   * @return (undocumented)
   */
  public  scala.collection.Map<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> blocks ()  { throw new RuntimeException(); }
  /**
   * Return the RDD blocks stored in this block manager.
   * <p>
   * @note This is somewhat expensive, as it involves cloning the underlying maps and then
   * concatenating them together. Much faster alternatives exist for common operations such as
   * getting the memory, disk, and off-heap memory sizes occupied by this RDD.
   * @return (undocumented)
   */
  public  scala.collection.Map<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> rddBlocks ()  { throw new RuntimeException(); }
  /** Return the blocks that belong to the given RDD stored in this block manager. */
  public  scala.collection.Map<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus> rddBlocksById (int rddId)  { throw new RuntimeException(); }
  /** Add the given block to this storage status. If it already exists, overwrite it. */
    void addBlock (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockStatus blockStatus)  { throw new RuntimeException(); }
  /** Update the given block in this storage status. If it doesn't already exist, add it. */
    void updateBlock (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockStatus blockStatus)  { throw new RuntimeException(); }
  /** Remove the given block from this storage status. */
    scala.Option<org.apache.spark.storage.BlockStatus> removeBlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Return whether the given block is stored in this block manager in O(1) time.
   * <p>
   * @note This is much faster than <code>this.blocks.contains</code>, which is O(blocks) time.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  boolean containsBlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Return the given block stored in this block manager in O(1) time.
   * <p>
   * @note This is much faster than <code>this.blocks.get</code>, which is O(blocks) time.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.storage.BlockStatus> getBlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Return the number of blocks stored in this block manager in O(RDDs) time.
   * <p>
   * @note This is much faster than <code>this.blocks.size</code>, which is O(blocks) time.
   * @return (undocumented)
   */
  public  int numBlocks ()  { throw new RuntimeException(); }
  /**
   * Return the number of RDD blocks stored in this block manager in O(RDDs) time.
   * <p>
   * @note This is much faster than <code>this.rddBlocks.size</code>, which is O(RDD blocks) time.
   * @return (undocumented)
   */
  public  int numRddBlocks ()  { throw new RuntimeException(); }
  /**
   * Return the number of blocks that belong to the given RDD in O(1) time.
   * <p>
   * @note This is much faster than <code>this.rddBlocksById(rddId).size</code>, which is
   * O(blocks in this RDD) time.
   * @param rddId (undocumented)
   * @return (undocumented)
   */
  public  int numRddBlocksById (int rddId)  { throw new RuntimeException(); }
  /** Return the max memory can be used by this block manager. */
  public  long maxMem ()  { throw new RuntimeException(); }
  /** Return the memory remaining in this block manager. */
  public  long memRemaining ()  { throw new RuntimeException(); }
  /** Return the memory used by caching RDDs */
  public  long cacheSize ()  { throw new RuntimeException(); }
  /** Return the memory used by this block manager. */
  public  long memUsed ()  { throw new RuntimeException(); }
  /** Return the on-heap memory remaining in this block manager. */
  public  scala.Option<java.lang.Object> onHeapMemRemaining ()  { throw new RuntimeException(); }
  /** Return the off-heap memory remaining in this block manager. */
  public  scala.Option<java.lang.Object> offHeapMemRemaining ()  { throw new RuntimeException(); }
  /** Return the on-heap memory used by this block manager. */
  public  scala.Option<java.lang.Object> onHeapMemUsed ()  { throw new RuntimeException(); }
  /** Return the off-heap memory used by this block manager. */
  public  scala.Option<java.lang.Object> offHeapMemUsed ()  { throw new RuntimeException(); }
  /** Return the memory used by on-heap caching RDDs */
  public  scala.Option<java.lang.Object> onHeapCacheSize ()  { throw new RuntimeException(); }
  /** Return the memory used by off-heap caching RDDs */
  public  scala.Option<java.lang.Object> offHeapCacheSize ()  { throw new RuntimeException(); }
  /** Return the disk space used by this block manager. */
  public  long diskUsed ()  { throw new RuntimeException(); }
  /** Return the memory used by the given RDD in this block manager in O(1) time. */
  public  long memUsedByRdd (int rddId)  { throw new RuntimeException(); }
  /** Return the disk space used by the given RDD in this block manager in O(1) time. */
  public  long diskUsedByRdd (int rddId)  { throw new RuntimeException(); }
  /** Return the storage level, if any, used by the given RDD in this block manager. */
  public  scala.Option<org.apache.spark.storage.StorageLevel> rddStorageLevel (int rddId)  { throw new RuntimeException(); }
  /**
   * Update the relevant storage info, taking into account any existing status for this block.
   * @param blockId (undocumented)
   * @param newBlockStatus (undocumented)
   */
  private  void updateStorageInfo (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockStatus newBlockStatus)  { throw new RuntimeException(); }
}
