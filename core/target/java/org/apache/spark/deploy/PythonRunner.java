package org.apache.spark.deploy;
/**
 * A main class used to launch Python applications. It executes python as a
 * subprocess and then has it connect back to the JVM to access system properties, etc.
 */
public  class PythonRunner {
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  /**
   * Format the python file path so that it can be added to the PYTHONPATH correctly.
   * <p>
   * Python does not understand URI schemes in paths. Before adding python files to the
   * PYTHONPATH, we need to extract the path from the URI. This is safe to do because we
   * currently only support local python files.
   * @param path (undocumented)
   * @param testWindows (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String formatPath (java.lang.String path, boolean testWindows)  { throw new RuntimeException(); }
  /**
   * Format each python file path in the comma-delimited list of paths, so it can be
   * added to the PYTHONPATH correctly.
   * @param paths (undocumented)
   * @param testWindows (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String[] formatPaths (java.lang.String paths, boolean testWindows)  { throw new RuntimeException(); }
  /**
   * Resolves the ".py" files. ".py" file should not be added as is because PYTHONPATH does
   * not expect a file. This method creates a temporary directory and puts the ".py" files
   * if exist in the given paths.
   * @param pyFiles (undocumented)
   * @return (undocumented)
   */
  static private  java.lang.String[] resolvePyFiles (java.lang.String[] pyFiles)  { throw new RuntimeException(); }
}
