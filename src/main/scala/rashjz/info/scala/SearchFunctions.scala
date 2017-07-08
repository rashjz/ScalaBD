package rashjz.info.scala

import org.apache.spark.rdd.RDD

/**
  * Created by rasha_000 on 7/3/2017.
  */
class SearchFunctions(val query: String) {
  def isMatch(s: String): Boolean = {
    s.contains(query)
  }


//  def getMatchesNoReference(rdd: RDD[String]): RDD[String] = {
//    val query_ = this.query
////    rdd.map(x => x.split(query_))
//  }
}
