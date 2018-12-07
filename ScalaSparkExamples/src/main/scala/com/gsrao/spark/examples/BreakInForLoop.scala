package com.gsrao.spark.examples

import scala.util.control.Breaks._

object BreakInForLoop {
  
  def main(args: Array[String]){
    breakable{
      for (i <- 1 to 10 by 2){
        if(i==7)
          break
        else
          println(i)
      }
    }
  }
}