# ScalaBD
#### * build.sbt files suppose to contain project name libraries and other configuration 
#### * While importing project you should import sbt structure to project

You may get ERROR java.io.IOException: Could not locate executable null\bin\winutils.exe in the Hadoop binaries.
in local  It is because you should SetUp your HADOOP_HOME environment variable on the OS level or programmatically: 
System.setProperty("hadoop.home.dir", "full path to the bin folder with winutils");


union() Produce an RDD containing elements from both RDDs.
intersection() RDD containing only elements found in both RDDs.
subtract() Remove the contents of one RDD (e.g., remove training data).
cartesian() Cartesian product with the other RDD. rdd.cartesian(other) {(1, 3), (1, 4), … (3,5)}