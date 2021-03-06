package org.apache.spark.storage;
public  class ShuffleDataBlockId extends org.apache.spark.storage.BlockId implements scala.Product, scala.Serializable {
  static public  scala.Option<org.apache.spark.storage.RDDBlockId> asRDDId ()  { throw new RuntimeException(); }
  static public  boolean isRDD ()  { throw new RuntimeException(); }
  static public  boolean isShuffle ()  { throw new RuntimeException(); }
  static public  boolean isBroadcast ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int shuffleId ()  { throw new RuntimeException(); }
  public  int mapId ()  { throw new RuntimeException(); }
  public  int reduceId ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleDataBlockId (int shuffleId, int mapId, int reduceId)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
}
