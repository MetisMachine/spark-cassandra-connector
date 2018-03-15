package org.apache.spark.sql


//TODO this was removed in spark 2.3 vs 2.2 and the cassandra connector depends on it, so adding it back here
// https://datastax-oss.atlassian.net/browse/SPARKC-530
package object catalyst {
  /**
   * A JVM-global lock that should be used to prevent thread safety issues when using things in
   * scala.reflect.*.  Note that Scala Reflection API is made thread-safe in 2.11, but not yet for
   * 2.10.* builds.  See SI-6240 for more details.
   */
  protected[sql] object ScalaReflectionLock
}
