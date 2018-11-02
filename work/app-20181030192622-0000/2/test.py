from __future__ import print_function

import sys
from operator import add

from pyspark.sql import SparkSession
from pyspark import SparkContext, SparkConf


if __name__ == "__main__":
    if False:
        print("Usage: wordcount <file>", file=sys.stderr)
        sys.exit(-1)

    conf = SparkConf().setAppName("engaging_reviews")
    sc = SparkContext(conf=conf)

    lines = sc.textFile(sys.argv[1])
    counts = lines.flatMap(lambda x: x.split(' ')) \
                  .map(lambda x: (x, 1))
    for i in range(10):
        counts = counts.map(lambda x:(x[0],x[1]+1))
    counts = counts.reduceByKey(add)
    output = counts.collect()
    print("DONE\n\n\n")
    #for (word, count) in output:
        #print(word, count)
