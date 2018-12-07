package com.gsrao.spark.examples

import scala.util.control.Breaks._

/**
 * @author gsrao
 */
object BreakInForLoop {
  
  def main(args: Array[String]){
    
    //Direct Breakable in For Loop.
    breakable{
      for (i <- 1 to 10 by 2){
        if(i==7)
          break
        else
          println(i)
      }
    }
  }
  
  // Inner Breakable Example
  for(i <- 1 to 3){
    breakable{
      for(j <- 1 to 3){
        if(i==2 & j==2){
          break
        }
        println(i+" "+j)
      }
    }
  }
  
}